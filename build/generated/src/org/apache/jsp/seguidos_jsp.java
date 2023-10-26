package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seguidos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Seguidos</title>\n");
      out.write("        <link href=\"CSS/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <section class=\"hero\">\n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <nav class=\"nav2\">\n");
      out.write("                <img class = \"logo\" src=\"Imagenes/NuestroLogo.png\" alt=\"\" width=\"250\" height=\"100\">\n");
      out.write("                <h3 class=\"nav__items\">Nombre de usuario</h3>\n");
      out.write("                <img class = \"avatar\" src=\"Imagenes/usuario2.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"hero__wave\"; style=\"overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path d=\"M-3.38,35.03 C159.14,67.59 305.86,15.28 501.69,39.95 L500.00,150.00 L0.00,150.00 Z\" style=\"stroke: none; fill: rgba(167, 224, 97, 0.842);\"></path></svg></div>\n");
      out.write("         <!--Color: Blonco - class = hero wave - se borra hasta overflow-->\n");
      out.write("    </section>\n");
      out.write("    <section class=\"header2\">\n");
      out.write("        <div class=\"menu-perfil\">\n");
      out.write("            <a href=\"Usuario2.html\" title=\"\">Perfil</a>\n");
      out.write("            <a href=\"Recomendaciones.html\" title=\"\">Recomendaciones</a>\n");
      out.write("            <a href=\"#\" title=\"\">Configuración</a>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"seguidores\">\n");
      out.write("        <div class=\"seg\">\n");
      out.write("            <div class=\"seguidor\">\n");
      out.write("                <img src=\"Imagenes/seguidor1.png\" alt=\"\">\n");
      out.write("                <div class=\"contenido-texto-card\">\n");
      out.write("                    <h4>Eco-Influencer 1</h4>\n");
      out.write("                    <p>Lorem ipsum dolor sit neque a deleniti tenetur maiores, nostrum incidunt ea assumenda quam nihil consequatur eaque atque vel quidem iste.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"seguidor\">\n");
      out.write("                <img src=\"Imagenes/usuario.jpeg\" alt=\"\">\n");
      out.write("                <div class=\"contenido-texto-card\">\n");
      out.write("                    <h4>Eco-Influencer 2</h4>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit repellendus ex culpa natus temporibus.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
