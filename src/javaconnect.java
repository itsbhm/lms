/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHUBHAM
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
 Connection conn;
 
 public static Connection ConnectDB(){
 
     try{
         Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Library Management System\\LibManDB.sqlite");
      //   Connection conn=DriverManager.getConnection("jdbc:sqlite:D:\\LibManDB.sqlite");
     //    Connection conn=DriverManager.getConnection("jdbc:sqlite:LibManDB.sqlite");
         return conn;
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }
 }
}
