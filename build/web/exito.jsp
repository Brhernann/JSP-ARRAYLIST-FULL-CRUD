<%-- 
    Document   : exito
    Created on : 29-04-2016, 0:02:57
    Author     : Null
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <h1>Has sido registrado satifactoriamente!</h1>
        
        <%
        
        ArrayList<Usuario> ListaU = (ArrayList<Usuario>)request.getSession().getAttribute("myUsers");
        
        
        
       %>
        
    </body>
</html>
