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
 * Servlet implementation class productInventorylist
 */
@WebServlet("/productInventorylist")
public class productInventorylist extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String dbdrive="com.mysql.jdbc.Driver";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productInventorylist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**	
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			 listproduct(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void listproduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	List <Product> products = new ArrayList <>();
	ConnectionDB condb=new ConnectionDB();
	condb.dbsqldrive(dbdrive);
	Connection con=condb.getConnection();
	String sql ="select * from Product";
	try {
		PreparedStatement dbps = con.prepareStatement(sql);
		 ResultSet rs = dbps.executeQuery();
		 while (rs.next()) {
					 String productID = rs.getString("productID");
					 String productName = rs.getString("productName");
					 String productCatalogues = rs.getString("productCatalogues");
					 products.add(new Product(productID,productName,productCatalogues));
					 }
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		request.setAttribute("listproduct", products);
		request.getRequestDispatcher("/productList.jsp").forward(request, response);
	}
}
