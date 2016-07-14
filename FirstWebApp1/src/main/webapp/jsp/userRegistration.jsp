<%@ page import="java.sql.*"%>
<%
	String Name = request.getParameter("Name");
    String Username = request.getParameter("Username");   
    String Password = request.getParameter("Password");

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hibernate4",
            "root", "");
    Statement st = con.createStatement();
    int i = st.executeUpdate("insert into users(Name, Username, Password) values ('" + Name + "','"
    + Username + "','" + Password);
    if (i > 0)
    {
        response.sendRedirect("welcome");
        
    } else 
    {
        response.sendRedirect("login");
    }
%>