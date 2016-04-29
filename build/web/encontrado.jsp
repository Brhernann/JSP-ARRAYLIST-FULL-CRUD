<%-- 
    Document   : encontrado
    Created on : 29-04-2016, 0:03:10
    Author     : Null
--%>

<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>El usuario ha sido encontrado</h1>
        
        <%
                 
         Usuario u = (Usuario)request.getSession().getAttribute("myUserEncontrado");
        

        %>
        
          <h1>Bienvenido: <%out.println(u.getNombre());%></h1>
        <p>Su nombre de usuario es:  <%out.println(u.getUser());%></p>
        <h3>Su edad es: <%out.println(u.getEdad());%></h3>
        
    </body>
</html>
