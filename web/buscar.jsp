<%-- 
    Document   : buscar
    Created on : 29-04-2016, 0:02:30
    Author     : Null
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <h1> buscando Usuario </h1>
    
    <form action="buscar.do" method="POST">
        
        <input type="text" name="txtbuscar" value="" /> Ingrese Nombre de Usuario  </br>  </br>
        <input type="submit" value="Buscar" name="btnbuscar" /> <a href="index.jsp">Inicio</a>
    </form>    
    </body>
</html>
