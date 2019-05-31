package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wsd.model.dao.*;
import wsd.model.*;
import wsd.controller.*;
import java.util.*;
import java.sql.*;

public final class movies_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    DBMovieManager manager = new DBMovieManager();
    List<Movie> movies = manager.getAllMovies();

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\"> \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("        <title>All Movies</title>\r\n");
      out.write("        <style>\r\n");
      out.write("table {\r\n");
      out.write("  font-family: arial, sans-serif;\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td, th {\r\n");
      out.write("  border: 1px solid #dddddd;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("  background-color: #dddddd;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body  bgcolor=\"#CC9933\" >\r\n");
      out.write("        <div><span class=\"time\" id=\"time\" ></span></div>\r\n");
      out.write("        <center>\r\n");
      out.write("            <h1>Online Movie Store</h1> <br>\r\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.jsp'\" > Home Page </button><br>\r\n");
      out.write("        </center>       \r\n");
      out.write("        \r\n");
      out.write("        <hr>\r\n");
      out.write("        <b><p>To order movie, click on its ID:</p></b>\r\n");
      out.write("        <table  width=\"100%\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Movie ID</th>\r\n");
      out.write("                <th>Title</th>\r\n");
      out.write("                <th>Duration</th>\r\n");
      out.write("                <th>Genre</th>\r\n");
      out.write("                <th>Price</th>\r\n");
      out.write("                <th>Stock</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 for(Movie movie: movies) { 
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <form action=\"createorder.jsp\" method=\"post\">\r\n");
      out.write("                      <td><input class=\"button\" type=\"submit\" name=\"order\" value=");
      out.print(movie.getMovieID());
      out.write("></td>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <td>");
      out.print( movie.getTitle() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( movie.getDuration() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( movie.getGenre() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( movie.getPrice() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( movie.getStock() );
      out.write("</td>\r\n");
      out.write("                </tr>            \r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("        <br>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/ConnServlet", out, true);
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
