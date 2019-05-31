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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Movie Store</title>\r\n");
      out.write("        <link  rel=\"stylesheet\" href=\"button.css\">\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("        #head {\r\n");
      out.write("\theight: 230px;\r\n");
      out.write("\twidth: 100;\r\n");
      out.write("\tbackground-color: #CC9933;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("        }\r\n");
      out.write("        .title {\r\n");
      out.write("\tfont-family: \"Arial\";\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 10%;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\ttransform: translate(-50%, -50%);  \r\n");
      out.write("\tfont-size: 36px;\r\n");
      out.write("\theight: 40px;\r\n");
      out.write("\twidth: 30%;}\r\n");
      out.write("        \r\n");
      out.write("        #foot {\r\n");
      out.write("\twidth: 100;\r\n");
      out.write("\theight: 126px;\r\n");
      out.write("\tbackground-color: #CC9933;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".copyright {\r\n");
      out.write("\tfont-family: \"Arial\";\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\ttransform: translate(-50%, -50%);  \r\n");
      out.write("\theight: 60px;\r\n");
      out.write("\twidth: 40%;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("        \r\n");
      out.write("        #foot .copyright .img {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 24px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#foot .copyright p {\r\n");
      out.write("\theight: 24px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("        <title>Home Page</title>       \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <div class=\"header\" id=\"head\">\r\n");
      out.write("   <div class=\"title\">Online Movie Store\r\n");
      out.write("   <a class=\"navbar-brand\" href=\"/\">\r\n");
      out.write("                        \r\n");
      out.write("    <img style=\"display:block; margin:0 auto;\" src=\"images.jpeg\" height=\"150\" width=\"300\"> <br>\r\n");
      out.write("                    </a>\r\n");
      out.write("   </div>\r\n");
      out.write("\t\r\n");
      out.write("  </div>\r\n");
      out.write("   \r\n");
      out.write("   <body background=\"bg.jpg\" >\r\n");
      out.write("                    \r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("<div id=\"navigator\">\r\n");
      out.write("<p class=\"button\"><a href=\"login.jsp\">Log in</a></p>\r\n");
      out.write("<p class=\"button\"><a href=\"register.jsp\">Register</a></p>\r\n");
      out.write("<p class=\"button\"><a href=\"movies.jsp\">Movies</a>\r\n");
      out.write("</div>\r\n");
      out.write("          &nbsp;\r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"footer\" id=\"foot\">\r\n");
      out.write("  <div class=\"copyright\">\r\n");
      out.write("    <p>Online Movie Store &copy; 2019</p>\r\n");
      out.write("    <div class=\"img\">\r\n");
      out.write("\t\t<i class=\"icon\"></i><span></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  </div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("    </body>\r\n");
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
