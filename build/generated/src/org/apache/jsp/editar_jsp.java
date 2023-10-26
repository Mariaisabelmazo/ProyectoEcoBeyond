package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"icon\" href=\"Imagenes/hojita.png\"/>\n");
      out.write("        <title>Editar perfil</title>\n");
      out.write("        <link href=\"CSS/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/338c5c72af.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"Imagenes/nat.png\">\n");
      out.write("    <section class=\"seccion-perfil-usuario\">\n");
      out.write("        <div class=\"perfil-usuario-header\">\n");
      out.write("            <div class=\"perfil-usuario-portada\">\n");
      out.write("                <div class=\"perfil-usuario-avatar\">\n");
      out.write("                    <img src=\"Imagenes/User2.png\" alt=\"img\"/>\n");
      out.write("                    <button type=\"button\" class=\"boton-avatar\">\n");
      out.write("                        <i class=\"far fa-image\"></i>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"Nombre_U\">\n");
      out.write("                    <h3 class=\"Nom\" >Nombre de Usuario</h3>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"button\" class=\"boton-portada\">\n");
      out.write("                    <i class=\"far fa-image\"></i> Cambiar fondo\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"perfil-usuario-body\">\n");
      out.write("            <div class=\"perfil-usuario-bio\">\n");
      out.write("                <h3 class=\"titulo\">Descripción</h3> \n");
      out.write("                <br>\n");
      out.write("                <input type=\"text\" placeholder=\"Describete....\"> \n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"perfil-usuario-footer\">\n");
      out.write("                <ul class=\"lista-datos\">\n");
      out.write("                    <h3 class=\"titulo\"> Detalles Personales </h3>\n");
      out.write("                    <p></p>\n");
      out.write("                    <li><i class=\"icono fas fa-briefcase\"></i> Trabaja en.</li>\n");
      out.write("                    <li><i class=\"icono fas fa-map-marker-alt\"></i> Ubicacion.</li>\n");
      out.write("                    <li><i class=\"icono fas fa-calendar-alt\"></i> Fecha nacimiento.</li>\n");
      out.write("                    <li><i class=\"icono fas fa-share-alt\"></i> Redes sociales.</li>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <button type=\"button\" class=\"botonE\">Editar</button>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"Bt\">\n");
      out.write("                <br>\n");
      out.write("                <a href=\"EcoInfluencer/perfilEcoInfluencer.jsp\"><button type=\"button\" class=\"botonC\">Guardar cambios</button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
