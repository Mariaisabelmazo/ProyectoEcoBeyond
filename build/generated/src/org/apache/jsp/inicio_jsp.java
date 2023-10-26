package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"icon\" href=\"../Imagenes/hojita.png\"/>\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link href=\"normalice/estiloNormalice.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <header class=\"hero\">\n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <nav class=\"nav\">\n");
      out.write("                <img class = \"logo\" src=\"Imagenes/NuestroLogo.png\" alt=\"\" width=\"250\" height=\"100\">\n");
      out.write("                <h3 class=\"nav__items\">");
      out.print( sesion.getAttribute("nombre"));
      out.write("</h3>\n");
      out.write("                <img class = \"avatar\" src=\"Imagenes/User.jpg\" alt=\"\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("         <div class=\"hero__wave\"; style=\"overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path d=\"M-3.38,35.03 C159.14,67.59 305.86,15.28 501.69,39.95 L500.00,150.00 L0.00,150.00 Z\" style=\"stroke: none; fill: white;\"></path></svg></div>\n");
      out.write("         <!--Color: Blonco - class = hero wave - se borra hasta overflow-->\n");
      out.write(" </header>\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <div class=\"presentacionContainer\">\n");
      out.write("    <main>\n");
      out.write("        <section class=\"presentationContainer\">\n");
      out.write("            <div class=\"cont3\">\n");
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img src=\"Imagenes/publicacion1.png\">\n");
      out.write("                    <h3>PARQUE ARVI</h3>\n");
      out.write("                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Velit quibusdam quisquam ut autem neque architecto tempore nostrum dolores natus dolore aut iure illum quidem, corporis ea recusandae? Quibusdam, excepturi et?</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img src=\"Imagenes/publicacion1.png\">\n");
      out.write("                    <h3>PARQUE ARVI</h3>\n");
      out.write("                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Velit quibusdam quisquam ut autem neque architecto tempore nostrum dolores natus dolore aut iure illum quidem, corporis ea recusandae? Quibusdam, excepturi et?</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img src=\"Imagenes/publicacion1.png\">\n");
      out.write("                    <h3>PARQUE ARVI</h3>\n");
      out.write("                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Velit quibusdam quisquam ut autem neque architecto tempore nostrum dolores natus dolore aut iure illum quidem, corporis ea recusandae? Quibusdam, excepturi et?</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <script src=\"https://kit.fontawesome.com/338c5c72af.js\" crossorigin=\"anonymous\"></script>\n");
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
