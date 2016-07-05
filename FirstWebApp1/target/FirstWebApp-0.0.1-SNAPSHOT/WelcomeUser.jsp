<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="Error.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>       
        <br/><br/><br/><br/><br/>
            <h2>
            <%
            String a=session.getAttribute("username").toString();
            out.println("Hi  "+a);
            %>
            </h2>
            <br/>
            <br/>
            <br/><br/><br/><br/><br/>
    </body>
</html>


Read more: http://mrbool.com/how-to-create-a-login-form-with-jsp/25685#ixzz4DWuhErp7
