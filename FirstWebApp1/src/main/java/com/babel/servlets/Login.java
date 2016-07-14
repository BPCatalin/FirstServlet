package com.babel.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.mapping.List;

import com.babel.data.UserConfig;
import com.babel.data.HibernateUtil;
import com.babel.entities.Users;


public class Login extends HttpServlet {
	

	/**
	 * Default serial id
	 */
	//private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		HttpSession session = req.getSession(true);
		String username = req.getParameter("Username").toString();
		String password = req.getParameter("Password").toString();
//		Users user= new Users();
//		UserConfig uc= new UserConfig();
//		String us= us.getUsername();
 		if ("admin".equals(username) && "admin".equals(password)) 
 		{
 			req.setAttribute("username", username);
 			req.getRequestDispatcher("/jsp/welcome.jsp").forward(req, resp);
 		} 
 		else
 		{
 			doGet(req, resp);
 		}

		             
		             
		             /*	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query=  session.createQuery("from users");
		Users user=new Users();
		Users usr=(Users)query.setString(0,user.getName()).uniqueResult();
		if(usr!=null){
			req.setAttribute("username", username);
			req.getRequestDispatcher("/jsp/welcome.jsp").forward(req, resp);
		}else{
			doGet(req,resp);
		} */

		             
		             
		     		


		
		
	}


}
