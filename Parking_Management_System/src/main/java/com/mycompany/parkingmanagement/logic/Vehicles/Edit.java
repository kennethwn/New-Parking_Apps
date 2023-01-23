package com.mycompany.parkingmanagement.logic.Vehicles;

import com.mycompany.parkingmanagement.logic.Database;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Edit extends com.mycompany.parkingmanagement.logic.Vehicle {
  private String text_field;
  private String id_membership;
  private String id_vehicle_type;
  private Database db = new Database();
  
  public String getIdMembership() {
    return this.id_membership;
  }
  
  public void setIdMembership(String id_membership) {
    this.id_membership = id_membership;
  }
  
  public String getIdVehicleType() {
    return this.id_vehicle_type;
  }
  
  public void setIdVehicleType(String id_vehicle_type) {
    this.id_vehicle_type = id_vehicle_type;
  }

  public void searchData(String license_plate, JTable table) {
    try {
      db.connector = Database.getConnection();
      super.sql = "select \n" +
        "tanggal as Tanggal_Parkir,\n" +
        "kendaraan.nopol as No_Polisi,\n" +
        "tipe_kendaraan as Tipe,\n" +
        "merk as Merk,\n" +
        "status_member as Membership,\n"+
        "jam_masuk as Jam_Masuk\n" +
        "FROM kendaraan_payment\n" +
        "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
        "inner join membership on kendaraan.id_membership = membership.id_membership\n" +
        "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
        "inner join payment on kendaraan_payment.id_payment = payment.id_payment\n" +
        "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
        "where kendaraan.nopol=? and kendaraan.jam_keluar is null AND status_payment.id_status_payment = 'BL';";
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      db.preparedStatement.setString(1, license_plate);
      db.rs = db.preparedStatement.executeQuery();
      while(db.rs.next()) {
        super.setDate(String.valueOf(db.rs.getDate("Tanggal_Parkir")));
        super.setLicensePlate(db.rs.getString("No_Polisi"));
        super.setVehicleType(db.rs.getString("Tipe"));
        super.setVehicleBrand(db.rs.getString("Merk"));
        super.setMembership(db.rs.getString("Membership"));
        super.setTimeEntry(db.rs.getString("Jam_Masuk"));
        String tbData[] = {
          super.getDate(),
          super.getLicensePlate(),
          super.getVehicleType(),
          super.getVehicleBrand(),
          super.getMembership(),
          super.getTimeEntry()
        };
        DefaultTableModel tbModel = (DefaultTableModel)table.getModel();
        tbModel.addRow(tbData);
      }
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public String displaySingleData(String column, String license_plate) {
    try {
      db.connector = Database.getConnection();
      super.sql = "select\n"+
        " ? from kendaraan\n"+
        "where nopol=?";
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      db.preparedStatement.setString(1, license_plate);
      db.preparedStatement.setString(2, license_plate);
      db.rs = db.preparedStatement.executeQuery();
      if(db.rs.next()) this.text_field = db.rs.getString(column);
      else return "NaN";
    }
    catch (SQLException e) {
      return "NaN";
    }
    return this.text_field;
  }
  
  public void updateKendaraan(
    String license_plate,
    String vehicle_brand,
    String vehicle_type,
    String membership,
    String date
  ) {
    if (membership == "Nonmember") {
      setIdMembership("0");
    }
    
    if (vehicle_type == "Mobil") {
      setIdVehicleType("TYPE1");
    }
    else if (vehicle_type == "Motor") {
      setIdVehicleType("TYPE2");
    }
    else if (vehicle_type == "Truk") {
      setIdVehicleType("TYPE3");
    }
    else if (vehicle_type == "Bus") {
      setIdVehicleType("TYPE4");
    }
    
    try {
      db.connector = Database.getConnection();
      super.sql = "update kendaraan\n" +
        "set tanggal=?, id_membership=?, id_jenis_kendaraan=?, merk=?\n"+
        "where nopol=?";
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      db.preparedStatement.setString(1, date);
      db.preparedStatement.setString(2, getIdMembership());
      db.preparedStatement.setString(3, getIdVehicleType());
      db.preparedStatement.setString(4, vehicle_brand);
      db.preparedStatement.setString(5,license_plate);
      db.preparedStatement.executeUpdate();
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  
  public void deleteKendaraanPayment(String license_plate) {
    try {
      db.connector = Database.getConnection();
      super.sql = "delete from kendaraan_payment where nopol=?";
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      db.preparedStatement.setString(1, license_plate);
      db.preparedStatement.executeUpdate();
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void deleteKendaraan(String license_plate) {
    try {
      db.connector = Database.getConnection();
      super.sql = "delete from kendaraan where nopol=?";
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      db.preparedStatement.setString(1, license_plate);
      db.preparedStatement.executeUpdate();
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void delete(String license_plate) {
    deleteKendaraanPayment(license_plate);
    deleteKendaraan(license_plate);
  }
  
  
  @Override
  public void displayData(JTable table) {
    try {
      db.connector = Database.getConnection();
      db.st = db.connector.createStatement();
      super.sql = "select \n" +
        "tanggal as Tanggal_Parkir,\n" +
        "kendaraan.nopol as No_Polisi,\n" +
        "tipe_kendaraan as Tipe,\n" +
        "merk as Merk,\n" +
        "status_member as Membership,\n"+
        "jam_masuk as Jam_Masuk\n" +
        "FROM kendaraan_payment\n" +
        "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
        "inner join membership on kendaraan.id_membership = membership.id_membership\n" +
        "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
        "inner join payment on kendaraan_payment.id_payment = payment.id_payment\n" +
        "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
        "where kendaraan.jam_keluar is null AND status_payment.id_status_payment = 'BL';";
      db.rs = db.st.executeQuery(sql);
      while(db.rs.next()) {
        super.setDate(String.valueOf(db.rs.getDate("Tanggal_Parkir")));
        super.setLicensePlate(db.rs.getString("No_Polisi"));
        super.setVehicleType(db.rs.getString("Tipe"));
        super.setVehicleBrand(db.rs.getString("Merk"));
        super.setMembership(db.rs.getString("Membership"));
        super.setTimeEntry(db.rs.getString("Jam_Masuk"));
        String tbData[] = {
          super.getDate(),
          super.getLicensePlate(),
          super.getVehicleType(),
          super.getVehicleBrand(),
          super.getMembership(),
          super.getTimeEntry()
        };
        DefaultTableModel tbModel = (DefaultTableModel)table.getModel();
        tbModel.addRow(tbData);
      }
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
