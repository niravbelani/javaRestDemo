package com.ecm.demo.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
public class ProductSearchServlet extends HttpServlet {
	//http://dw-webapi.dyndns-server.com/s/Demos-SiteGenesis-Site/dw/shop/v1/product_search?client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&q=tomtom&start=0&count=2&pretty_print=true&format=xml
	//http://dw-webapi.dyndns-server.com/s/Demos-SiteGenesis-Site/dw/shop/v1/products/tomtom-xl-s?client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&format=xml&pretty_print=true
	private static final long serialVersionUID = 1L;
	public static final String DW_HOST="http://dw-webapi.dyndns-server.com/s/Demos-SiteGenesis-Site/dw";
	public static final String SITE_NAME="JavaDemoRest2";
	public static final String CLIENT_ID = "client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	public static final String PAGING="start=0&count=2&pretty_print=true&format=xml";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductSearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//System.out.println("ProductSearchServlet.doPost()+++");
		StringBuffer uri = new StringBuffer(request.getRequestURI());
		uri = uri.delete(0, SITE_NAME.length() + 1);
		String param = request.getParameter("searchProduct");
		//System.out.println("ProductSearchServlet.doPost()"+param);
		String dwUrl = "http://dw-webapi.dyndns-server.com/s/Demos-SiteGenesis-Site/dw/shop/v1/products/tomtom-xl-s?client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&format=xml&pretty_print=true";
		String dwURL = "http://dw-webapi.dyndns-server.com/s/Demos-SiteGenesis-Site/dw/shop/v1/product_search?client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&q="+param+"&start=0&pretty_print=false&format=xml"; 
				//DW_HOST + uri + "?" + CLIENT_ID + "&" + PAGING  + "&" + request.getQueryString();

		URL url = new URL(dwURL);
		HttpURLConnection dw_connection = (HttpURLConnection) url.openConnection();

		BufferedReader reader = new BufferedReader(new InputStreamReader(dw_connection.getInputStream()));
		String line = "";
		StringBuffer buffer = new StringBuffer();
		while ((line = reader.readLine()) != null) {
			buffer.append(line);
		}
		response.setContentType("text/xml");
		response.getWriter().write("<?xml-stylesheet type='text/xsl' href='http://localhost:8080/JavaRestDemo/ProductSearch.xsl' encoding='UTF-8'?>"+buffer.toString());
		//response.getWriter().write(buffer.toString());
		reader.close();
		//request.setAttribute("xml", buffer.toString());
		//RequestDispatcher rd = getServletContext().getRequestDispatcher("/improvedJSP.jsp");
		
		//rd.forward(request, response);
	}
	

}