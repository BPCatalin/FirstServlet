package com.babel.data;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.babel.entities.UserRoles;

public class RoleConfig {
	  private static SessionFactory factory; 
	   public static void main(String[] args) {
	      try{
	         factory = new Configuration().configure().buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex);} 
	  	RoleConfig RC = new RoleConfig();
	      RC.addRole("pompier");
			RC.addRole("politist");
			RC.addRole("scafandru");
			RC.updateRole(1,"doctor");
			//RC.listRoles();
	   }
	   /* Method to CREATE an function in the database */
	   public Integer addRole(String Function){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer UserID = null;
	      try{
	         tx = session.beginTransaction();
	         UserRoles user = new UserRoles(Function);
	         UserID = (Integer) session.save(user); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return UserID;
	   }
	   /* Method to  READ all the functions */
	   public void listRoles( ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List fct = (List) session.createQuery("FROM UserRoles").list(); 
	         for (Iterator iterator = ((java.util.List) fct).iterator(); iterator.hasNext();){
	            UserRoles role = (UserRoles) iterator.next(); 
	            System.out.print("Function: " + role.getFunction()); 
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
	   /* Method to UPDATE function for an user */
	   public void updateRole(Integer UserRolesID, String Function ){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		         UserRoles role = (UserRoles)session.get(UserRoles.class, UserRolesID); 
		         role.setFunction( Function );
				 session.update(role); 
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
	   }
	   /* Method to DELETE an function from the records */
	   public void deleteRole(Integer UserRolesID){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         UserRoles role = (UserRoles)session.get(UserRoles.class, UserRolesID); 
	         session.delete(role); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
	   
}
