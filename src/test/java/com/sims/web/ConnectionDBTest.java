/**
 * 
 */
package com.sims.web;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 */
class ConnectionDBTest {
private Connection connection;
private String dburl="jdbc:mysql://localhost:3306/simswebapp";
private String dbname="root";
private String password="22222";
private String dbdrive="com.mysql.jdbc.Driver";
ConnectionDB connectDB= new ConnectionDB();
	/**
	 * @throws java.lang.Exception
	 * setup new connection
	 */
	@BeforeEach
	void setUp() throws Exception {
		connection = DriverManager.getConnection(dburl,dbname,password);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		if (connection !=null) {
			connection.close();
		}
	}

	/**
	 * Test method for {@link com.sims.web.ConnectionDB#getConnection()}.
	 */
	@Test
	void testGetConnection() throws SQLException{
		Connection connection = connectDB.getConnection();
		assertNotNull(connection);
	}

	/**
	 * Test method for {@link com.sims.web.ConnectionDB#newstaff(com.sims.web.Staff)}.
	 */
	@Test
	void testNewstaff() {
	    connectDB.dbsqldrive(dbdrive);
		Staff staffs=new Staff("thasleem","12234","suhail@gmail.com");
		Connection con =connectDB.getConnection();

		String sql ="insert into STAFF values(?,?,?)";
		String result=connectDB.newstaff(staffs);
		try {
			PreparedStatement dbps = con.prepareStatement(sql);
			dbps.setString(1, staffs.getName());
			dbps.setString(2, staffs.getPassword());
			dbps.setString(3, staffs.getEmail());
			dbps.executeUpdate();
			assertEquals("Staff added successfully", result);
		}catch (SQLException e) {
			System.out.println("Staff is not added");
		}
	}
}
