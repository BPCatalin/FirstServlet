<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
        <form method="post" action="userRegistration">
                 	  Name<br> <input type="text" name="Name" value="" /><br>
                	  Username<br> <input type="text" name="Username" value="" /><br> 
                      Password<br> <input type="password" name="Password" value="" /><br> 
                      
                      <input type="submit" value="Submit" /><br> 
                      <input type="reset" value="Reset" /><br> 
                      <br> Already registered!! <a href="login">Login Here</a><br> 

        </form>
    </body>
</html>