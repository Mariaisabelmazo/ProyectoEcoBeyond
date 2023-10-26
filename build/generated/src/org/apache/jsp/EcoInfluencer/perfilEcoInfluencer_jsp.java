package org.apache.jsp.EcoInfluencer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfilEcoInfluencer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("cargo") == null){
        response.sendRedirect("../login.jsp");
    }else{
        String cargo = sesion.getAttribute("cargo").toString();
        if(!cargo.equals("1")){
            response.sendRedirect("../login.jsp");
        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"icon\" href=\"../Imagenes/hojita.png\"/>\n");
      out.write("        <title>EcoBeyond</title>\n");
      out.write("        <link href=\"../CSS/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/338c5c72af.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"../Imagenes/nat.png\">\n");
      out.write("    <section class=\"perfil-usuario\">\n");
      out.write("        <div class=\"contenedor-perfil\">\n");
      out.write("            <div class=\"portada-perfil\" style=\"background-image: url(https://www.teahub.io/photos/full/167-1676088_fondos-de-naturaleza-verde.jpg)\">\n");
      out.write("                <div class=\"avatar-perfil\">\n");
      out.write("                    <img src=\"https://png.pngtree.com/illustration/20190226/ourlarge/pngtree-girl-animal-human-and-nature-summer-image_4705.jpg\" alt=\"img\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"datos-perfil\">\n");
      out.write("                    <h4 class=\"titulo-usuario\">");
      out.print( sesion.getAttribute("nombre"));
      out.write("</h4>\n");
      out.write("                    <p class=\"bio-usuario\">\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipisicing elit repellendus ex culpa natus temporibus.\n");
      out.write("                    </p>\n");
      out.write("                    <ul class=\"lista-perfil\">\n");
      out.write("                        <li>3 Seguidores</li>\n");
      out.write("                        <li>8 Publicaciones</li>\n");
      out.write("                        <li>3 Recomendados</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"opciones-perfil\">\n");
      out.write("                    <a href=\"../editar.jsp\"><button href=\"\" type=\"\">Editar Perfil</button></a>\n");
      out.write("                    <a href=\"../configuracion.jsp\"><button type=\"\">Configuración</button></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu-perfil\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"../inicio.jsp\" title=\"\">Inicio</a></li>\n");
      out.write("                <li><a href=\"../publicaciones.jsp\" title=\"\">Publicaciones</a></li>\n");
      out.write("                <li><a href=\"../seguidores.jsp\" title=\"\">Seguidores</a></li>\n");
      out.write("                <li><a href=\"../recomendados.jsp\" title=\"\">Recomendados</a></li>\n");
      out.write("                <li><a href=\"../publicar.jsp\" title=\"\">Publicar</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("    <section class=\"seccion-perfil-usuario\">\n");
      out.write("        <div class=\"perfil-usuario-body\">\n");
      out.write("            <div class=\"perfil-usuario-footer\">\n");
      out.write("                <ul class=\"lista-datos\">\n");
      out.write("                    <h3 class=\"titulo\"> Detalles Personales </h3>\n");
      out.write("                    <p></p>\n");
      out.write("                    <li><i class=\"icono fas fa-briefcase\"> Trabaja en.</i></li>\n");
      out.write("                    <li><i class=\"icono fas fa-map-marker-alt\"> Ubicacion.</i></li>\n");
      out.write("                    <li><i class=\"icono fas fa-calendar-alt\"> Fecha nacimiento.</i></li>\n");
      out.write("                    <li><i class=\"icono fas fa-share-alt\"> Redes sociales.</i></li>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                </ul>\n");
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
