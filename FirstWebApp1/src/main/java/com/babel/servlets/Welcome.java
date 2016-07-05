package com.babel.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet{

	 public void doGet(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException { 
		 PrintWriter out=response.getWriter();
		 response.setContentType("text/html");
		 String username = request.getParameter("username");
		 String password =request.getParameter("password");
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title> Login Page</title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<h1>"+username+"</h1>"+
				 	 "<h1>"+password+"</h1>"	);
		 out.println("</body>");
		 out.println("</html>");
		 out.close();
	 }
	 public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException { 
		 
		 doGet(request, response);
	 }

}
