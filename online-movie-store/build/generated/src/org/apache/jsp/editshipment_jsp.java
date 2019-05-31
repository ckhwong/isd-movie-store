package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wsd.model.dao.*;
import wsd.model.*;
import wsd.controller.*;
import java.util.*;
import java.sql.*;

public final class editshipment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Edit Shipment</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        DBShipmentManager manager = new DBShipmentManager();
        Shipment shipment = manager.findShipment(Integer.parseInt(request.getParameter("ID")));

    
      out.write("\n");
      out.write("    <body  bgcolor=\"#CC9933\" >\n");
      out.write("        <div><span class=\"time\" id=\"time\" ></span></div>\n");
      out.write("        <center>\n");
      out.write("            <h1>Online Movie Store: Create Shipment for order</h1> <br>\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.html'\" > Home Page </button><br>\n");
      out.write("            <h2>Enter shipment details:</h2> \n");
      out.write("        </center>\n");
      out.write("        <form action=\"shipmentupdated.jsp\" method=\"post\">\n");
      out.write("            <center>\n");
      out.write("                <table cellpadding=\"5\" >\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Date:</td>\n");
      out.write("                        <td><input type=\"date\" name=\"date\" value=\"");
      out.print( shipment.getDate() );
      out.write("\"></td>                                   \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Shipment ID:</td>\n");
      out.write("                        <td><input type=\"number\" name=\"ID\" value=\"");
      out.print(shipment.getID());
      out.write("\" readonly required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>User ID:</td>\n");
      out.write("                        <td><input type=\"number\" name=\"userID\" value=\"");
      out.print(shipment.getUserID());
      out.write("\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Order ID:</td>\n");
      out.write("                        <td><input type=\"number\" name=\"orderID\" value=\"");
      out.print(shipment.getOrderID());
      out.write("\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td><input type=\"text\" name=\"address\" value=\"");
      out.print(shipment.getAddress());
      out.write("\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Shipment type</td>\n");
      out.write("                        <td><input type=\"text\" name=\"shipmentType\" value=\"");
      out.print(shipment.getShipmentType());
      out.write("\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td></td>\n");
      out.write("                        <td>\n");
      out.write("                            <input class=\"button\" type=\"submit\" value=\"Update\"> \n");
      out.write("                            &nbsp; \n");
      out.write("                            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.html'\" > Home Page </button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/ConnServlet", out, true);
      out.write("\n");
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
