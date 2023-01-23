package com.mycompany.parkingmanagement.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
  private static Connection connect;
  
  private static String url = "jdbc:mysql://localhost:3306/parking_system";
  private static String user = "root";
  private static String pw = "";
  
  public PreparedStatement preparedStatement;
  public Statement st;
  public Connection connector = null;
  public ResultSet rs;
  
  // Prepared Statement
  public static Connection getConnection() {
    if(connect == null) {
      try {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        connect = DriverManager.getConnection(url,user,pw);
      }
      catch(Exception e) {
        System.out.println(e.getMessage());
      }
    }
    return connect;
  }
}
