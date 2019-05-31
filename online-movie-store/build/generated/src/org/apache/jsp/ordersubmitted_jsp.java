package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wsd.model.dao.*;
import wsd.model.*;
import wsd.controller.*;
import java.util.*;
import java.sql.*;

public final class ordersubmitted_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\"> \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("        <title>Order Submitted</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        String date = request.getParameter("date");
        int userID = Integer.parseInt(request.getParameter("userID"));
        int movieID = Integer.parseInt(request.getParameter("movieID"));
        //String date = "29/05/2019";
        //int userID = 4448444;
        //int movieID = 55550000;
        int orderID = new Random().nextInt(999999999);
        String status = "Approved";

        String log;
        User user = (User) session.getAttribute("user");

        if (user != null) {
            log = " &lt " + user.getName() + " &gt";
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }
    
      out.write("\r\n");
      out.write("    <body onload=\"startTime()\">\r\n");
      out.write("        <div><span class=\"time\" id=\"time\" ></span></div>\r\n");
      out.write("        \r\n");
      out.write("        <center>\r\n");
      out.write("            <h1>Online Movie Store: Registered Order</h1> <br>\r\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.jsp'\" > Home Page </button>\r\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'movies.jsp'\" > Movies </button><br>       \r\n");
      out.write("            <h2>Check order details:</h2> \r\n");
      out.write("        </center>\r\n");
      out.write("        <h2 class=\"outline\">Your Order</h2> <br>\r\n");
      out.write("        <table width=\"100%\" >\r\n");
      out.write("            <tr bgcolor=\"lightgrey\" ><td align=\"right\" class=\"outline\">You are logged in as Guest Account</td></tr>\r\n");
      out.write("            <tr><td align=\"right\">\r\n");
      out.write("                    ");
if (userID == 9999999) { 
      out.write("\r\n");
      out.write("                    <u><a class=\"link\" href=\"register.jsp\">Register</a></u> \r\n");
      out.write("                        ");
} else { 
      out.write("\r\n");
      out.write("                    <u><a class=\"link\" href=\"profile.jsp\">Account</a></u>\r\n");
      out.write("                    &emsp;\r\n");
      out.write("                    <u><a class=\"link\" href=\"logout.jsp\">Logout</a></u>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>                  \r\n");
      out.write("        </table>        \r\n");
      out.write("        <hr>\r\n");
      out.write("        ");
 if (userID == 9999999) { 
      out.write("\r\n");
      out.write("        <b>Guest Account</b><br>\r\n");
      out.write("        <p>Your finalised order details:</p><br>\r\n");
      out.write("        <table class=\"userAcc\">\r\n");
      out.write("            <thead class=\"h\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"a\">Order ID</td>\r\n");
      out.write("                    <td class=\"a\">Date</td>\r\n");
      out.write("                    <td class=\"a\">User ID</td>\r\n");
      out.write("                    <td class=\"a\">Movie ID</td>\r\n");
      out.write("                    <td class=\"a\">Status</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody >\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"a\">");
      out.print(orderID);
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.print(date);
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\" >");
      out.print(userID);
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.print(movieID);
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.print(status);
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        ");

            //Activate the database add-function once DBManager functions are completed
            DBConnector connector  = new DBConnector();
            Connection conn = connector.openConnection();
            DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");
            Order order = new Order(orderID, date, userID, movieID, status);
            manager.addOrder(orderID, date, userID, movieID, status);
            session.setAttribute("order", order);
        
      out.write("\r\n");
      out.write("        ");
 } else if (request.getParameter("userID") != null) { 
      out.write("\r\n");
      out.write("        <b>Thank You ");
      out.print(user.getName());
      out.write("</b><br>\r\n");
      out.write("        <p>Your finalised order details:</p><br>\r\n");
      out.write("        <table class=\"userAcc\">\r\n");
      out.write("            <thead class=\"h\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"a\">Order ID</td>\r\n");
      out.write("                    <td class=\"a\">Date</td>\r\n");
      out.write("                    <td class=\"a\">User ID</td>\r\n");
      out.write("                    <td class=\"a\">Movie ID</td>\r\n");
      out.write("                    <td class=\"a\">Status</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody >\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"a\">");
      out.print(orderID);
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.print(date);
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\" >");
      out.print(userID);
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.print(movieID);
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.print(status);
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        ");

            //Activate the database add-function once DBManager functions are completed
            DBConnector connector  = new DBConnector();
            Connection conn = connector.openConnection();
            DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");
            Order order = new Order(orderID, date, userID, movieID, status);
            System.out.println("" + orderID + " " + date + " " + userID + " " + movieID + " " + status);
            manager.addOrder(orderID, date, userID, movieID, status);
            session.setAttribute("order", order);
            
        
      out.write("\r\n");
      out.write("        <button class=\"button\" type=\"button\" onclick=\"location.href = 'myorders.jsp'\" > My Orders </button><br>\r\n");
      out.write("        ");
} else { 
      out.write("\r\n");
      out.write("        <p class=\"outline\">Some error occurred</p>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/ConnServlet", out, true);
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
