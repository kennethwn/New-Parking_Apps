package com.mycompany.parkingmanagement.logic.Vehicles;

import com.mycompany.parkingmanagement.logic.Database;
import java.sql.SQLException;
import javax.swing.JTable;

public class Create extends com.mycompany.parkingmanagement.logic.Vehicle {
  private String id_membership;
  private String id_vehicle_type;
  
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
  
  public void insertKendaraan(
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
      super.sql = "insert into kendaraan\n" +
        "(nopol,tanggal,id_membership,id_jenis_kendaraan,merk,jam_masuk,jam_keluar)\n"+
        "values(?,?,?,?,?,current_time(),null);";
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      db.preparedStatement.setString(1, license_plate);
      db.preparedStatement.setString(2, date);
      db.preparedStatement.setString(3, getIdMembership());
      db.preparedStatement.setString(4, getIdVehicleType());
      db.preparedStatement.setString(5, vehicle_brand);
      db.preparedStatement.executeUpdate();
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void insertKendaraanPayment(String license_plate) {
    try {
      db.connector = Database.getConnection();
      super.sql = "insert into kendaraan_payment\n"+
        "(nopol,id_payment,id_status_payment)\n"+
        "values(?,'001','BL');";
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      db.preparedStatement.setString(1, license_plate);
      db.preparedStatement.executeUpdate();
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void insert(
    String license_plate,
    String vehicle_brand,
    String vehicle_type,
    String membership,
    String date
  ) {
    insertKendaraan(license_plate,vehicle_brand,vehicle_type,membership,date);
    insertKendaraanPayment(license_plate);
  }

  @Override
  protected void displayData(JTable table) {
  }

}
