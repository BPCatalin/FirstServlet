<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User page</title>
    </head>
    <body>       
        <br/><br/><br/><br/><br/>
            <h2>
            <%
            String a =session.getAttribute("username").toString();
            out.println("Hi  "+ a);
            %>
            </h2>
            <br/>
            <br/>
            <br/><br/><br/><br/><br/>
    </body>
</html>
