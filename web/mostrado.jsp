<%-- 
    Document   : mostrado
    Created on : 29-04-2016, 0:03:25
    Author     : Null
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Usuario"%>
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
	color: #0F9;
}
    </style>
    </head>
    <body background="Imagenes/fondo.jpg" text="#00FF99">
    <h1> Los usuario registrado estan aca!</h1>
        
        
        <%
        
        Usuario u = (Usuario)request.getSession().getAttribute("myUserPassed");
        
         ArrayList<Usuario> ListaU = (ArrayList<Usuario>) request.getSession().getAttribute("myUsers");
        
        %>
        
              <h1>Bienvenido: <%out.println(u.getUser());%></h1>
              
                     <table border="1">
            <tr>
                <td>Nombre</td>
                <td>Apellido</td>
                <td>Edad</td>
            </tr>
            <%
                for(int i=0; i<ListaU.size(); i++)
                {
                    out.println("<tr>");
                        out.println("<td>" + ListaU.get(i).getNombre()+ "</td>");
                        out.println("<td>" + ListaU.get(i).getApellido()+ "</td>");
                        out.println("<td>" + ListaU.get(i).getEdad()+ "</td>");
                    out.println("</tr>");
                }
            %>
        </table>
                     
</body>
</html>
