/**
 * 
 */

package com.ecm.demo.rest;

import java.net.MalformedURLException;
import java.net.URL;
import javax.servlet.*;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator
 *
 */
public class ShowProduct extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		URL url=null;
		  try {
		   url = new URL("http://dw-webapi.dyndns-server.com/s/Demos-SiteGenesis-Site/dw/shop/v1/products/tomtom-xl-s?client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&format=xml&pretty_print=true");
		  } catch (MalformedURLException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		     try {
		   Object x = url.openConnection().getContent();
		   req.setAttribute("xmlObj", x);
		   
		   
		   String xString = x.toString();
		   
		   System.out.println("ShowProduct.doGet()+++"+xString);
		   
		   String destination = "/displayProduct.jsp";
			 
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(req, resp);

		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		
		     
		
	}
	//resp.sendRedirect("/JavaRestDemo/displayProduct.jsp");
	
}
