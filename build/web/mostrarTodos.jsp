<%-- 
    Document   : mostrarTodos
    Created on : 29-04-2016, 0:02:46
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
	color: #0FC;
}
body {
	background-image: url(Imagenes/fondo.jpg);
}
    </style>
    </head>
    <body>
        <h1>Inicie Session</h1>
        
        <form action="mostrarlista.do" method="POST">
            
            <p>
              <input type="text" name="txtusuario" value="" /> 
              User </br>
            </p>
            <p>
            <input type="password" name="txtpass" value="" />Passworld</br></br>
            </p>
          <p>
              <input type="submit" value="Entrar" name="boton" />
            </p>
        </form>
        
        
    </body>
</html>
