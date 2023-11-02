package servlets;

/**
 * Importamos todos los paquetes que necesitamos
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import backend.Acceso;
import javax.servlet.RequestDispatcher;

/**
 * 
 * Clase que amplia la capacidad de el servidor
 */

public class SERVLOGIN extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Punto 0");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombre;
            String contra;
            int cargo = 0;
            Acceso acc = new Acceso();
            RequestDispatcher rd = null;
            
            System.out.println("Punto 1");
            if (request.getParameter("btnIniciar") != null) {
                System.out.println("Punto 2");
    nombre = request.getParameter("txtusuario");
    contra = request.getParameter("txtcontra");
    cargo = acc.validar(nombre, contra);
    request.getSession().setAttribute("cargo", cargo);
    request.getSession().setAttribute("nombre", nombre);
    System.out.println(cargo);
                switch (cargo) {
                    case 1:
                        // Redirige a la página del perfil del EcoInfluencer
                        
                        rd = request.getRequestDispatcher("EcoInfluencer/perfilEcoInfluencer.jsp");
                        break;
                    case 2:
                        // Redirige a la página del perfil del EcoTurista
                        rd = request.getRequestDispatcher("perfilEcoTurista.jsp");
                        break;
                    default:
                        // La autenticación falló, muestra un mensaje de error en la página de inicio de sesión.
                        request.getSession().setAttribute("error", "Nombre de usuario o contraseña incorrectos");
                        rd = request.getRequestDispatcher("login.jsp");
                        break;
                }
}
rd.forward(request, response);
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
