<%-- 
    Document   : error
    Created on : 29-04-2016, 0:03:32
    Author     : Null
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
    <style type="text/css">
    body {
	background-image: url(Imagenes/fondo.jpg);
}
    body,td,th {
	color: #0C9;
}
    </style>
    </head>
    <body>
        <h1>Ha ocurrido un grave error!</h1>
        
        <%
         String error = (String)request.getSession().getAttribute("myError");
         
        out.print(error);
        %>
    </body>
</html>
