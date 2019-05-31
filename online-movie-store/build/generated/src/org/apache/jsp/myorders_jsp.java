package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import wsd.model.dao.*;
import java.util.List;
import wsd.model.*;
import wsd.model.dao.DBOrderManager;

public final class myorders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\"> \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("        <title>Order Submitted</title>\r\n");
      out.write("            <style>\r\n");
      out.write("            table {\r\n");
      out.write("                font-family: arial, sans-serif;\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            td, th {\r\n");
      out.write("                border: 1px solid #dddddd;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            tr:nth-child(even) {\r\n");
      out.write("                background-color: #dddddd;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");

        String log;
        User user = (User) session.getAttribute("user");

        if (user != null) {
            log = " &lt " + user.getName() + " &gt";
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }

        List<Order> orders = manager.getOrders(user.getID());
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div><span class=\"time\" id=\"time\" ></span></div>\r\n");
      out.write("        <center>\r\n");
      out.write("            <h1>Online Movie Store</h1> <br>\r\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.jsp'\" > Home Page </button>\r\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'profile.jsp'\" > Account </button>\r\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'movies.jsp'\" > Movies </button><br>\r\n");
      out.write("        </center>      \r\n");
      out.write("          \r\n");
      out.write("        <h2 class=\"outline\">Order History</h2><br>\r\n");
      out.write("        <p><b>Select Order ID Create Shipment Form or Cancel</b></p><br>\r\n");
      out.write("            <table border=\"2\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Order ID</td>\r\n");
      out.write("                    <td>Date</td>\r\n");
      out.write("                    <td>User ID</td>\r\n");
      out.write("                    <td>Movie ID</td>\r\n");
      out.write("                    <td>Status</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 for (Order order : orders) {
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <form action=\"editorder.jsp\" method=\"post\">\r\n");
      out.write("                      <td><input class=\"button\" type=\"submit\" name=\"order\" value=");
      out.print(order.getOrderID());
      out.write("></td>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <td>");
      out.print( order.getDate());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( order.getUserID());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( order.getMovieID());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( order.getStatus());
      out.write("</td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td><input type=\"button\" name=\"cancel\" value=\"cancel\"></td>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html> \r\n");
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
