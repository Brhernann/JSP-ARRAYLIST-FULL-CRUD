<%-- 
    Document   : registrar
    Created on : 29-04-2016, 0:02:21
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
        <h1>Bienvenido al registro de usuario!</h1>
        
        <form action="registrar.do" method="POST">
            <input type="text" name="txtuser" value="" /> User </br>
            <input type="password" name="txtpass" value="" /> Password  </br>
            <input type="text" name="txtnombre" value="" /> Nombre  </br>
            <input type="text" name="txtapellido" value="" /> Apellido  </br>
            <input type="text" name="txtedad" value="" /> Edad  </br> </br>
            <input type="submit" value="Guardar" name="btguardar" /> <a href="index.jsp">Inicio</a>
            
        </form>
    </body>
</html>
