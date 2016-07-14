package com.babel.data;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.babel.entities.Users;

public class UserConfig {
	   private static SessionFactory factory; 
	   public static void main(String[] args) {
	      try{
	         factory = new Configuration().configure().buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex);} 
	      
	      
	      	UserConfig DC = new UserConfig();
	      	
	      	//Users
	      	DC.addUser("catalin", "ronin", "parola");
			DC.addUser("mihai", "r2k16", "qwerty");
}	
			
			   public Integer addUser(String Name, String Username, String Password){
				      Session session = factory.openSession();
				      Transaction tx = null;
				      Integer UserID = null;
				      try{
				         tx = session.beginTransaction();
				         Users user = new Users(Name, Username, Password);
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
				   /* Method to  READ all the users */
				   public void listUsers( ){
				      Session session = factory.openSession();
				      Transaction tx = null;
				      try{
				         tx = session.beginTransaction();
				         List usr = (List) session.createQuery("FROM Users").list(); 
				         for (Iterator iterator = ((java.util.List) usr).iterator(); iterator.hasNext();){
				            Users user = (Users) iterator.next(); 
				            System.out.print("First Name: " + user.getName()); 
				            System.out.print("  Last Name: " + user.getUsername()); 
				         }
				         tx.commit();
				      }catch (HibernateException e) {
				         if (tx!=null) tx.rollback();
				         e.printStackTrace(); 
				      }finally {
				         session.close(); 
				      }
				   }
				   /* Method to UPDATE Username for an user */
				   public void updateUser(Integer UserID, String Username ){
				      Session session = factory.openSession();
				      Transaction tx = null;
				      try{
				         tx = session.beginTransaction();
				         Users user = (Users)session.get(Users.class, UserID); 
				         user.setUsername( Username );
						 session.update(user); 
				         tx.commit();
				      }catch (HibernateException e) {
				         if (tx!=null) tx.rollback();
				         e.printStackTrace(); 
				      }finally {
				         session.close(); 
				      }
				   }
				   /* Method to DELETE an user from the records */
				   public void deleteUser(Integer UserID){
				      Session session = factory.openSession();
				      Transaction tx = null;
				      try{
				         tx = session.beginTransaction();
				         Users employee = (Users)session.get(Users.class, UserID); 
				         session.delete(employee); 
				         tx.commit();
				      }catch (HibernateException e) {
				         if (tx!=null) tx.rollback();
				         e.printStackTrace(); 
				      }finally {
				         session.close(); 
				      }
				   }
}
