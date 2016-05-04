
package Controlador;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Buscar extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
     String buscar = request.getParameter("txtbuscar");
     String error = "";
        if (buscar.equals("") || buscar == null) {
            
        error = "LOS CAMPOS ESTAN VACIOS!";
        request.getSession().setAttribute("myError", error);
        request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        
        else
        {
        
            
    
         
        ArrayList<Usuario> ListaU = (ArrayList<Usuario>)request.getSession().getAttribute("myUsers");
        
        
        
            if (ListaU==null) {
                
              error="NO EXISTEN USUARIOS!";
              
              request.getSession().setAttribute("myError", error);
              request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            
            else{
            
              int encotrado = 0;
              
                for (int i = 0; i < ListaU.size(); i++) {
                    
                    if (ListaU.get(i).getUser().equals(buscar)) {
                        
                      String usser = ListaU.get(i).getUser();
                      String pass = ListaU.get(i).getPass();
                      String nombre = ListaU.get(i).getNombre();
                      String apellido = ListaU.get(i).getApellido();
                      int    edad = ListaU.get(i).getEdad();
                      
                      Usuario u = new Usuario(usser, pass, nombre, apellido, edad);
                      
                      request.getSession().setAttribute("myUserEncontrado", u);
                      request.getRequestDispatcher("encontrado.jsp").forward(request, response);
                      encotrado = 1;
                        
                    }
    
                }
                
                if (encotrado==0) {
                  
                    error="ERROR EN EL NOMBRE DE USUARIO, CONSIDERE MAYUS!";
              
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
