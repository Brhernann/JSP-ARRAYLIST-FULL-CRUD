<%-- 
    Document   : buscar
    Created on : 29-04-2016, 0:02:30
    Author     : Null
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
    <style type="text/css">
    body,td,th {
	color: #0F9;
}
body {
	background-color: #FFF;
	background-image: url(Imagenes/fondo.jpg);
}
    a:link {
	color: #9C3;
}
    </style>
    </head>
    <body>
        
    <h1> buscando Usuario </h1>
    
    <form action="buscar.do" method="POST">
        
        <p>
          <input type="text" name="txtbuscar" value="" /> 
          Ingrese Nombre de Usuario  </br>  </br>
        </p>
        <p>
          <input type="submit" value="Buscar" name="btnbuscar" /> 
          <a href="index.jsp">Inicio</a></p>
    </form>    
    </body>
</html>
