package com.babel.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Tasks extends HttpServlet{


	private static final long serialVersionUID = -703980434469498486L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
  
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Name = req.getParameter("Name").toString();
		String Description = req.getParameter("Description").toString();
		String Priority = req.getParameter("Priority").toString();
		
		req.setAttribute("Name", Name);
		req.setAttribute("Description", Description);
		req.setAttribute("Priority", Priority);
		req.getRequestDispatcher("/jsp/taskResult.jsp").forward(req, resp);
	}
}
