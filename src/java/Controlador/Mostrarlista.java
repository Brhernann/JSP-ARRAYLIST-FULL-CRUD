/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Null
 */
public class Mostrarlista extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String user = request.getParameter("txtusuario");
       String pass = request.getParameter("txtpass");
       String error = "";
       
        if (user.equals("") || user == null || pass.equals("") || pass == null) {
          
        error = "LOS CAMPOS ESTAN VACIOS";
        request.getSession().setAttribute("myError", error);
        request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        
        else{
        
        ArrayList<Usuario> ListaU = (ArrayList<Usuario>)request.getSession().getAttribute("myUsers");
        
            if (ListaU==null) {
            error= "NO EXISTEN USUARIOS, CREE EL PRIMERO!";
            request.getSession().setAttribute("myError", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);    
            }
            
            else{
            
            int encontrado = 0;
            
                for (int i = 0; i < ListaU.size(); i++) {
                
                    if (ListaU.get(i).getUser().equals(user) || ListaU.get(i).getPass().equals(pass)) {
                        
                      String NuevoUser = ListaU.get(i).getUser();
                      String Nuevopass = ListaU.get(i).getPass();
                      String nombre = ListaU.get(i).getNombre();
                      String apellido = ListaU.get(i).getApellido();
                      int edad = ListaU.get(i).getEdad();
                      
                      Usuario u = new Usuario(user, pass, nombre, apellido, edad);
                      
                      request.getSession().setAttribute("myUserPassed", u);
                      request.getRequestDispatcher("mostrado.jsp").forward(request, response);
                      encontrado = 1;
                        
                    }
    
                }
                
                if (encontrado==0) {
                 error="ERROR EN LA CLAVE O EN EL NOMBRE DE USUARIO!";
            request.getSession().setAttribute("myError", error);
            request.getRequestDispatcher("error.jsp").forward(request, response); 
                    
                }
            }
               
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
