package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registroEcoTurista_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>EcoBeyond</title>\n");
      out.write("        <link href=\"CSS/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <form id=\"cuadro\">\n");
      out.write("        <img src=\"Imagenes/Loguito (2).png\" height=\"200px\" width=\"300px\" title=\"logo\"/>\n");
      out.write("        <br/>\n");
      out.write("        <p id=\"titulo\">Registro Eco Turista</p>\n");
      out.write("        <br/>\n");
      out.write("        <input class=\"entrada\" type=\"text\" name = \"Nombre\" id=\"Nombre\" placeholder=\"Ingrese su Nombre:\">\n");
      out.write("        <input class=\"entrada\" type=\"text\" name = \"Apellidos\" id=\"Apellidos\" placeholder=\"Ingrese sus correo:\">\n");
      out.write("        <input class=\"entrada\" type=\"password\" name = \"Contraseña\" id=\"Constraseña\" placeholder=\"Ingrese su Constraseña:\">\n");
      out.write("        <p>Estoy de acuerdo con <a href=\"#\">Terminos y Condiciones</a></p>\n");
      out.write("        <br/>\n");
      out.write("        <input type=\"button\" value=\"Registrar\" id=\"boton\"/>\n");
      out.write("        \n");
      out.write("        <p><a href=\"index.jsp\">¿Ya tienes Cuenta?</a></p>\n");
      out.write("    </form> \n");
      out.write("\n");
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
