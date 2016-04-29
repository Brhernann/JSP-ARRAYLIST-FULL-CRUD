<%-- 
    Document   : mostrarTodos
    Created on : 29-04-2016, 0:02:46
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
        <h1>Inicie Session</h1>
        
        <form action="mostrarlista.do" method="POST">
            
            <input type="text" name="txtusuario" value="" /> User </br>
            <input type="password" name="txtpass" value="" />Passworld</br></br>
            <input type="submit" value="Entrar" name="boton" />
        </form>
        
        
    </body>
</html>
