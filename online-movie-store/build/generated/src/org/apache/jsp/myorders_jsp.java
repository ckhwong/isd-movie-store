package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wsd.model.*;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/demo.css\"> \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("        <title>My Orders</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        String log;
        Order order = (Order) session.getAttribute("order");

        if (order != null) {
            log = " &lt " + order.getUserID() + " &gt";
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }
    
      out.write("\r\n");
      out.write("    <body onload=\"startTime()\">\r\n");
      out.write("        <div><span class=\"time\" id=\"time\" ></span></div>\r\n");
      out.write("        <h2 class=\"outline\">Order History</h2> \r\n");
      out.write("        <table width=\"100%\" >\r\n");
      out.write("            <tr bgcolor=\"lightgrey\" ><td align=\"right\" class=\"outline\">You are logged in as  ");
      out.print(log);
      out.write("</td></tr>\r\n");
      out.write("            <tr><td align=\"right\">\r\n");
      out.write("                    ");
if (order != null) { 
      out.write("\r\n");
      out.write("                    <u><a class=\"link\" href=\"edit_user.jsp\">Account</a></u> \r\n");
      out.write("                        ");
} else { 
      out.write("\r\n");
      out.write("                    <u><a class=\"link\" href=\"register.jsp\">Register</a></u>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    &emsp;<u><a class=\"link\" href=\"logout.jsp\">Logout</a></u>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>                  \r\n");
      out.write("        </table>        \r\n");
      out.write("        <hr>\r\n");
      out.write("        ");
 if (order != null) { 
      out.write("\r\n");
      out.write("        <table class=\"account\">\r\n");
      out.write("            <thead class=\"h\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"a\">Order ID</td>\r\n");
      out.write("                    <td class=\"a\">User ID</td>\r\n");
      out.write("                    <td class=\"a\">Movie ID</td>\r\n");
      out.write("                    <td class=\"a\">Date</td>\r\n");
      out.write("                    <td class=\"a\">Delivery Type</td>\r\n");
      out.write("                    <td class=\"a\">Delivery Price</td>\r\n");
      out.write("                    <td class=\"a\">Original Price</td>\r\n");
      out.write("                    <td class=\"a\">Discount %</td>\r\n");
      out.write("                    <td class=\"a\">Final Price</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody >\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"a\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.movieID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.deliveryType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.deliveryPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.origPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.discount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                    <td class=\"a\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.finalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        ");
 session.setAttribute("orderEdit", order); 
      out.write("\r\n");
      out.write("        ");
}else{ 
      out.write("\r\n");
      out.write("        <p class=\"outline\">Welcome Guest Student</p>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("    </body>\r\n");
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
