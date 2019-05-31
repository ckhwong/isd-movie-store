package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import wsd.controller.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <title>Online Movie Store</title>\n");
      out.write("        <link  rel=\"stylesheet\" href=\"button.css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        #head {\n");
      out.write("\theight: 230px;\n");
      out.write("\twidth: 100;\n");
      out.write("\tbackground-color: #CC9933;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tposition: relative;\n");
      out.write("        }\n");
      out.write("        .title {\n");
      out.write("\tfont-family: \"Arial\";\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 10%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttransform: translate(-50%, -50%);  \n");
      out.write("\tfont-size: 36px;\n");
      out.write("\theight: 40px;\n");
      out.write("\twidth: 30%;}\n");
      out.write("        \n");
      out.write("        #foot {\n");
      out.write("\twidth: 100;\n");
      out.write("\theight: 126px;\n");
      out.write("\tbackground-color: #CC9933;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".copyright {\n");
      out.write("\tfont-family: \"Arial\";\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttransform: translate(-50%, -50%);  \n");
      out.write("\theight: 60px;\n");
      out.write("\twidth: 40%;\n");
      out.write("\ttext-align:center;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("        #foot .copyright .img {\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 24px;\n");
      out.write("\tposition: relative;\n");
      out.write("\t\n");
      out.write("\n");
      out.write("}\n");
      out.write("#foot .copyright p {\n");
      out.write("\theight: 24px;\n");
      out.write("\twidth: 100%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("        <title>Home Page</title>       \n");
      out.write("    \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <div class=\"header\" id=\"head\">\n");
      out.write("   <div class=\"title\">Online Movie Store\n");
      out.write("   <a class=\"navbar-brand\" href=\"/\">\n");
      out.write("                        \n");
      out.write("    <img style=\"display:block; margin:0 auto;\" src=\"images.jpeg\" height=\"150\" width=\"300\"> <br>\n");
      out.write("                    </a>\n");
      out.write("   </div>\n");
      out.write("\t\n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("   <body background=\"bg.jpg\" >\n");
      out.write("                    \n");
      out.write("     \n");
      out.write("        \n");
      out.write("<div id=\"navigator\">\n");
      out.write("<p class=\"button\"><a href=\"login.jsp\">Log in</a></p>\n");
      out.write("<p class=\"button\"><a href=\"register.jsp\">Register</a></p>\n");
      out.write("<p class=\"button\"><a href=\"movies.jsp\">Movies</a>\n");
      out.write("</div>\n");
      out.write("          &nbsp;\n");
      out.write("          \n");
      out.write("        \n");
      out.write("        <div class=\"footer\" id=\"foot\">\n");
      out.write("  <div class=\"copyright\">\n");
      out.write("    <p>Online Movie Store &copy; 2019</p>\n");
      out.write("    <div class=\"img\">\n");
      out.write("\t\t<i class=\"icon\"></i><span></span>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write(" \n");
      out.write(" \n");
      out.write("  </div>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
