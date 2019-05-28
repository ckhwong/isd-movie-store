package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\"> \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("        <title>Create Order</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body onload=\"startTime()\"  bgcolor=\"#CC9933\" >\r\n");
      out.write("        <div><span class=\"time\" id=\"time\" ></span></div>\r\n");
      out.write("        <center>\r\n");
      out.write("            <h1>Online Movie Store: Create Order</h1> <br>\r\n");
      out.write("            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.html'\" > Home Page </button><br>\r\n");
      out.write("            <h2>Enter your order details:</h2> \r\n");
      out.write("        </center>\r\n");
      out.write("        <form>\r\n");
      out.write("            <center>\r\n");
      out.write("                <table cellpadding=\"5\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Account Type:</td>\r\n");
      out.write("                        <td> \r\n");
      out.write("                            <input class=\"button\" type=\"submit\" value=\"User\" name=\"userAcc\">\r\n");
      out.write("                            &nbsp; \r\n");
      out.write("                            <input class=\"button\" type=\"submit\" value=\"Guest\" name=\"guestAcc\"><br>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </center>\r\n");
      out.write("        </form>\r\n");
      out.write("        <br>\r\n");
      out.write("        <form type=\"hidden\" name=\"submitted\" value=\"yes\" action=\"myorders.jsp\" method=\"post\">\r\n");
      out.write("            <center>\r\n");
      out.write("                ");
  if (request.getParameter("guestAcc") != null) { 
      out.write("\r\n");
      out.write("                <b> Guest Account Chosen </b>\r\n");
      out.write("                <table cellpadding=\"5\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Delivery Type:</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"radio\" name=\"deliveryType\" value=\"pickup\"> Store Pick-Up: +$0<br>\r\n");
      out.write("                            <input type=\"radio\" name=\"deliveryType\" value=\"delivery\"> Delivery: +$10<br>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Address for Delivery/Pick-Up: </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"address\" placeholder=\"123 Movie St, Sydney\"><br>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>State: </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"address\" placeholder=\"NSW\"><br>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Email:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"email\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr><td></td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input class=\"button\" type=\"submit\" value=\"Submit\"> \r\n");
      out.write("                            &nbsp; \r\n");
      out.write("                            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.html'\" > Home Page </button>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>   \r\n");
      out.write("                ");
  } else { 
      out.write("  \r\n");
      out.write("                <b> User Account Chosen </b>\r\n");
      out.write("                <table cellpadding=\"5\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>User ID:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"userID\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Delivery Type:</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"radio\" name=\"deliveryType\" value=\"pickup\"> Store Pick-Up: +$0<br>\r\n");
      out.write("                            <input type=\"radio\" name=\"deliveryType\" value=\"delivery\"> Delivery: +$10<br>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Address for Delivery/Pick-Up: </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"address\" placeholder=\"123 Movie St, Sydney\"><br>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>State: </td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"address\" placeholder=\"NSW\"><br></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Email:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"email\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr><td></td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input class=\"button\" type=\"submit\" value=\"Submit\"> \r\n");
      out.write("                            &nbsp; \r\n");
      out.write("                            <button class=\"button\" type=\"button\" onclick=\"location.href = 'home.html'\" > Home Page </button>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                ");
  }
      out.write("\r\n");
      out.write("            </center>\r\n");
      out.write("        </form>\r\n");
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
