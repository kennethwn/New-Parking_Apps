package com.mycompany.parkingmanagement.logic;

import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class Vehicle {
  protected String date;
  protected String license_plate;
  protected String vehicle_type;
  protected String vehicle_brand;
  protected String membership;
  protected String price;
  protected String payment_method;
  protected String payment_status;
  protected String time_entry;
  protected String time_exit;
  
  protected String sql;
  protected int count;
  
  public Database db = new Database();
  
  
  // Methods
  protected String getDate() {return this.date;}
  
  protected String getLicensePlate() {return this.license_plate;}
  
  protected String getVehicleType() {return this.vehicle_type;}
  
  protected String getVehicleBrand() {return this.vehicle_brand;}
  
  protected String getMembership() {return this.membership;}
  
  protected String getPrice() {return this.price;}
  
  protected String getPaymentMethod() {return this.payment_method;}
  
  protected String getPaymentStatus() {return this.payment_status;}
  
  protected String getTimeEntry() {return this.time_entry;}
  
  protected String getTimeExit() {return this.time_exit;}
  
  protected void setDate(String date) {this.date = date;}
  
  protected void setLicensePlate(String license_plate) {this.license_plate = license_plate;}
  
  protected void setVehicleType(String vehicle_type) {this.vehicle_type = vehicle_type;}
  
  protected void setVehicleBrand(String vehicle_brand) {this.vehicle_brand = vehicle_brand;}
  
  protected void setMembership(String membership) {this.membership = membership;}
  
  protected void setPrice(String price) {this.price = price;}
  
  protected void setPaymentMethod(String payment_method) {this.payment_method = payment_method;}
  
  protected void setPaymentStatus(String payment_status) {this.payment_status = payment_status;}
  
  protected void setTimeEntry(String time_entry) {this.time_entry = time_entry;}
  
  protected void setTimeExit(String time_exit) {this.time_exit = time_exit;}
  
  protected abstract void displayData(JTable table);
  
  public int getEmptySlot(String type, int total_slot) {
    try {
      db.connector = Database.getConnection();
      db.st = db.connector.createStatement();
      
      if (type == "Lainnya") {
        this.sql = "SELECT\n" +
          "'"+total_slot+"'-COUNT(kendaraan.nopol) as kendaraan_parkir\n" +
          "FROM kendaraan_payment\n" +
          "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
          "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
          "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
          "where tipe_kendaraan in ('Truk','Bus') \n" +
          "AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');";
      }
      else {
        this.sql = "SELECT\n" +
          "'"+total_slot+"'-COUNT(kendaraan.nopol) as kendaraan_parkir\n" +
          "FROM kendaraan_payment\n" +
          "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
          "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
          "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
          "where tipe_kendaraan = '"+type+"' \n" +
          "AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');";
      }
     
      db.rs = db.st.executeQuery(this.sql);
      if(db.rs.next()) {this.count = db.rs.getInt("kendaraan_parkir");}
    }
    catch (Exception e) {
      return -1;
    }
    return this.count;
  }
  
  public int getUnemptySlot(String type) {
    try {
      db.connector = Database.getConnection();
      db.st = db.connector.createStatement();
      
      if (type == "Lainnya") {
        this.sql = "SELECT\n" +
          "COUNT(kendaraan.nopol) as kendaraan_parkir\n" +
          "FROM kendaraan_payment\n" +
          "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
          "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
          "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
          "where tipe_kendaraan in ('Truk','Bus') \n" +
          "AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');";
        db.rs = db.st.executeQuery(this.sql);
      }
      else {
        this.sql = "SELECT\n" +
          "COUNT(kendaraan.nopol) as kendaraan_parkir\n" +
          "FROM kendaraan_payment\n" +
          "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
          "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
          "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
          "where tipe_kendaraan = ? \n" +
          "AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');";
        
        db.preparedStatement = db.connector.prepareStatement(this.sql);
        db.preparedStatement.setString(1, type);
        db.rs = db.preparedStatement.executeQuery();
      }
     
      if(db.rs.next()) {this.count = db.rs.getInt("kendaraan_parkir");}
    }
    catch (Exception e) {
      return -1;
    }
    return this.count;
  }
  
  public static void clearTableContent(JTable table) {
    DefaultTableModel tbModel = (DefaultTableModel)table.getModel();
    tbModel.setRowCount(0);
  }
}
