package com.sims.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionDB {
private String dburl="jdbc:mysql://localhost:3306/simswebapp";
private String dbname="root";
protected String password="22222";
private String dbdrive="com.mysql.jdbc.Driver";
protected String sql;
public void dbsqldrive(String dbdrive) {
	try {
		Class.forName(dbdrive);
	}
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}

public Connection getConnection() {
	Connection con= null;
	try {
		con = DriverManager.getConnection(dburl,dbname,password);
		
	} catch (SQLException e){
		e.printStackTrace();
		}
	return con;
}

public String newstaff(Staff staff) {
	dbsqldrive(dbdrive);
Connection con =getConnection();
String sql ="insert into STAFF values(?,?,?)";
String result="Staff added successfully";
try {
	PreparedStatement dbps = con.prepareStatement(sql);
	dbps.setString(1, staff.getName());
	dbps.setString(2, staff.getPassword());
	dbps.setString(3, staff.getEmail());
	dbps.executeUpdate();
}catch(SQLException e) {
	e.printStackTrace();
	result="Staff not added";
}
return result;
}

public String loginSims(Staff staff)
{
	dbsqldrive(dbdrive);
	Connection con =getConnection();
	 sql = "select * from STAFF where name=? and password=?";
	String result = "Login Successfully";
	
	try {
		PreparedStatement dbps = con.prepareStatement(sql);
		dbps.setString(1, staff.getName());
		dbps.setString(2, staff.getPassword());
		ResultSet rs = dbps.executeQuery();
		if(rs.next()) {
			System.out.println(result);
		}
	}catch(SQLException e) {
		System.out.println(e);
		result="Login Failed";
		}
return result;
}

public String productStore(Product product)
{
	dbsqldrive(dbdrive);
Connection con =getConnection();
String sql ="insert into product values(?,?,?)";
String result="Product is successfully added to the inventory store";
try {
	PreparedStatement dbps = con.prepareStatement(sql);
   dbps.setString(1, product.getproductID());
   dbps.setString(2, product.getProductName());
   dbps.setString(3, product.getproductCatalogues());
   dbps.executeUpdate();
}catch(SQLException e) {
	e.printStackTrace();
    result = "Error retrieving products from the database";
}
return result;
}
}
