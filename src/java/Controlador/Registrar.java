
package Controlador;

import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Registrar extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        
        String user = request.getParameter("txtuser");
        String pass = request.getParameter("txtpass");
        String nombre = request.getParameter("txtnombre");
        String apellido = request.getParameter("txtapellido");
        String edad = request.getParameter("txtedad");
        String error = "";
        
        if (    user.equals("") || user == null || 
                pass.equals("") || pass == null ||
                nombre.equals("") || nombre == null ||
                apellido.equals("") || apellido == null ||
                edad.equals("") || edad == null) 
        {
         
            error="LOS CAMPOS ESTÁN VACIOS!";
            
            request.getSession().setAttribute("myErrror", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        
        else
        {
            
        int nuevaEdad =0; 
        
            try
            {
             nuevaEdad = Integer.parseInt(edad);
            } catch (NumberFormatException e) 
            {
             error="INGRESE NUMEROS VALIDOS!";
             
            request.getSession().setAttribute("myErrror", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            
            Usuario u = new Usuario(user, pass, nombre, apellido, nuevaEdad);
            
            ArrayList<Usuario> ListaU = (ArrayList<Usuario>)request.getSession().getAttribute("myUsers");
            
            if (ListaU==null) {
            
             ListaU = new ArrayList<>();
             ListaU.add(u);
             
             request.getSession().setAttribute("myUsers", u);
             request.getRequestDispatcher("exito.jsp").forward(request, response);
                     
            }
            
            else
            {
                
             int encontrado = 0;
             
                for (int i = 0; i < ListaU.size(); i++) {
                 
                    if (ListaU.get(i).getUser().equals(user)) {
                        
                        error = "LO SENTIMOS EL USUARIO YA EXISTE!, INTENTE CON OTRO";
                        
                        request.getSession().setAttribute("myError", error);
                        request.getRequestDispatcher("error.jsp").forward(request, response);
                        encontrado = 1;
                        
                    }
    
                }
                
                if (encontrado==0) {
                    
                ListaU.add(u);
             
                request.getSession().setAttribute("myUsers", u);
                request.getRequestDispatcher("exito.jsp").forward(request, response);    
                    
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
