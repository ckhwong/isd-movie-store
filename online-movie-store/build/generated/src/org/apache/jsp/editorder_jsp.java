package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wsd.model.dao.*;
import wsd.model.*;
import wsd.controller.*;
import java.util.*;
import java.sql.*;

public final class editorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\"> \n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("        <title>Create Order</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        //DBMovieManager manager = (DBMovieManager)session.getAttribute("manager");
        int orderID = Integer.parseInt(request.getParameter("order"));
        
        String log = "";
        int guestID = 9999999;

        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");
        
        Order order = (Order) session.getAttribute("order");        
        User user = (User) session.getAttribute("userLogin");

        if (user != null) {
            log = " &lt " + user.getName() + " &gt";
            guestID = user.getID();
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }
        
        
    
      out.write("\n");
      out.write("    <body onload=\"startTime()\"  bgcolor=\"#CC9933\" >\n");
      out.write("        <div><span class=\"time\" id=\"time\" ></span></div>\n");
      out.write("        <center>\n");
      out.write("            <h1>Online Movie Store: Create Order</h1> <br>\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.jsp'\" > Home Page </button>\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'movies.jsp'\" > Movies </button>\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'profile.jsp'\" > Account </button><br>\n");
      out.write("            <h2>Check order details:</h2> \n");
      out.write("        </center>\n");
      out.write("        <input type=\"button\" name=\"goback\" value=\"Go Back\" location.href = 'myorders.jsp'\">\n");
      out.write("        <form action=\"myorders.jsp\" method=\"post\">\n");
      out.write("            <center>\n");
      out.write("                <table cellpadding=\"5\" >\n");
      out.write("                    <tr>\n");
      out.write("                    <td>Order ID</td>\n");
      out.write("                    <td>Date</td>\n");
      out.write("                    <td>User ID</td>\n");
      out.write("                    <td>Movie ID</td>\n");
      out.write("                    <td>Status</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input name=\"orderID\" value=\"");
      out.print(orderID);
      out.write("\" readonly></td>\n");
      out.write("                    <td><input name=\"date\" value=\"");
      out.print(order.getDate());
      out.write("\" readonly></td>\n");
      out.write("                    <td><input name=\"userID\" value=\"");
      out.print(order.getUserID());
      out.write("\" readonly></td>\n");
      out.write("                    <td><input name=\"movieID\" value=\"");
      out.print(order.getMovieID());
      out.write("\" readonly></td>\n");
      out.write("                    <td><input name=\"status\" value=\"");
      out.print(order.getStatus());
      out.write("\" readonly></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <input type=\"button\" name=\"cancel\" value=\"Cancel My Order\"> \n");
      out.write("                <input type=\"button\" name=\"shipment\" value=\"Create Shipment\"> \n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("                    <input type=\"button\" name=\"goback\" value=\"Go Back\" onClick=\"location.href = 'myorders.jsp'\">\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/ConnServlet", out, true);
      out.write("\n");
      out.write("    </body>\n");
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
