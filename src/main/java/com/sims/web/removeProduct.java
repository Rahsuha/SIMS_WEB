package com.sims.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
/**
 * Servlet implementation class removeProduct
 */
@WebServlet("/removeProduct")
public class removeProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String dbdrive="com.mysql.jdbc.Driver";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * remove the product from the database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String productID= request.getParameter("productID");
	  ConnectionDB condb=new ConnectionDB();
		condb.dbsqldrive(dbdrive);
		Connection con=condb.getConnection();
		String sql =" delete from Product where productID = ?;";
	  try {
		  PreparedStatement dbps = con.prepareStatement(sql);
		  dbps.setString(1, productID);
		  int i = dbps.executeUpdate(); 
	  }catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	  response.sendRedirect("http://localhost:8090/simswebapp/productInventorylist"); 
  }
}
