package com.sims.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class productCatalogue
 */
@WebServlet("/productCatalogue")
public class productCatalogue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected String result;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productCatalogue() {
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
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String productID=request.getParameter("productID");
		String productName=request.getParameter("productName");
		String productCatalogues=request.getParameter("productCatalogues");
		Product product=new Product(productID,productName,productCatalogues);
		ConnectionDB condb=new ConnectionDB();
	     result = condb.productStore(product);
		response.getWriter().println(result);
		response.sendRedirect("http://localhost:8090/simswebapp/productInventorylist"); 
	}

}
