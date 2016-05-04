<%-- 
    Document   : registrar
    Created on : 29-04-2016, 0:02:21
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
	color: #0F9;
}
    a:link {
	color: #D6D6D6;
}
    </style>
    </head>
    <body>
        <h1>Bienvenido al registro de usuario!</h1>
        
        <form action="registrar.do" method="POST">
            <p>
              <input type="text" name="txtuser" value="" /> 
            User </p>
            <p></br>
            <input type="password" name="txtpass" value="" /> Password  </br>
            </p>
            <p>
            <input type="text" name="txtnombre" value="" /> Nombre  </br>
            </p>
            <p>
              <input type="text" name="txtapellido" value="" /> 
              Apellido  </br>
            </p>
            <p>
              <input type="text" name="txtedad" value="" /> 
              Edad  </br> 
            </p>
            <p></br>
              <input type="submit" value="Guardar" name="btguardar" /> 
              <a href="index.jsp">Inicio</a></p>
            
        </form>
    </body>
</html>
