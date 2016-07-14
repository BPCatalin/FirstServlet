 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
    </head>
<body>
        <form method="POST" action="Login">

                <fieldset>
						<legend>Login Page</legend>
 						Username<br> <input type="text" name="Username" value="" /><br> 
                        Password<br> <input type="password" name="Password" value="" /><br> 
                        
                        <input type="submit" value="Login" /><br> 
                        <input type="reset" value="Reset" /><br> 
                
                        <a href="register">Register Here</a><br> 
 				</fieldset>
        </form>
    </body>
</html>