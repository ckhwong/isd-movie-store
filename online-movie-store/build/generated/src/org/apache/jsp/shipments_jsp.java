package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wsd.model.dao.*;
import wsd.model.*;
import wsd.controller.*;
import java.util.*;
import java.sql.*;

public final class shipments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DBShipmentManager manager = new DBShipmentManager();
    
    String ID = request.getParameter("ID");
    String date = request.getParameter("date");
    List<Shipment> shipments = manager.getShipment(ID, date);
    

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\"> \n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("        <title>All Shipment</title>\n");
      out.write("        <style>\n");
      out.write("table {\n");
      out.write("  font-family: arial, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("  border: 1px solid #dddddd;\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("  background-color: #dddddd;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body  bgcolor=\"#CC9933\" >\n");
      out.write("        <div><span class=\"time\" id=\"time\" ></span></div>\n");
      out.write("        <center>\n");
      out.write("            <h1>Online Movie Store: All Shipments</h1> <br>\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.html'\" > Home Page </button><br>\n");
      out.write("        </center>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form>\n");
      out.write("            <h4>Search</h4>\n");
      out.write("            <label>Shipment ID</label>\n");
      out.write("            <input type=\"number\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\">\n");
      out.write("            <label>Date</label>\n");
      out.write("            <input type=\"text\" name=\"date\" value=\"");
      out.print(date);
      out.write("\">\n");
      out.write("            <button type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        <table  width=\"100%\" >\n");
      out.write("            <tr>\n");
      out.write("                <th>Shipment ID</th>\n");
      out.write("                <th>User ID</th>\n");
      out.write("                <th>Order ID</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Shipment Type</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 for(Shipment shipment: shipments) { 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"editshipment.jsp?ID=");
      out.print( shipment.getID() );
      out.write('"');
      out.write('>');
      out.print( shipment.getID() );
      out.write("</a></td>\n");
      out.write("                    <td>");
      out.print( shipment.getUserID() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( shipment.getOrderID() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( shipment.getDate() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( shipment.getAddress() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( shipment.getShipmentType());
      out.write("</td>\n");
      out.write("                    <td><a href=\"shipmentdelete.jsp?ID=");
      out.print( shipment.getID() );
      out.write("\">Delete</a></td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <a href=\"createshipment.jsp\">Create new shipment</a>\n");
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
