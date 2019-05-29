package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wsd.model.*;

public final class logpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>OMS Log Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        String log = (String) session.getAttribute("userID");
        
        String forcedUserID; // Used by admins for enforcing a particular user ID to be searched
        String checkDate; // The date used to get logs
        Log[] logsToDisplay = new Log[0];
        
        
        
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Log Page</h1>\r\n");
      out.write("        \r\n");
      out.write("        <table width=\"100%\" >\r\n");
      out.write("            <tr bgcolor=\"lightgrey\" ><td align=\"right\" class=\"outline\">You are logged in as  ");
      out.print(log);
      out.write("</td></tr>\r\n");
      out.write("            <tr><td align=\"right\">\r\n");
      out.write("                    <u><a class=\"link\" href=\"logout.jsp\">Logout</a></u>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>                  \r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("        <p>\r\n");
      out.write("            <form name=\"Get Log\" method=\"POST\">\r\n");
      out.write("                <pre>\r\n");
      out.write("                    forcedUserID : <input type=\"text\" name=\"Enter User ID\">\r\n");
      out.write("                    checkDate : <input type=\"text\" name=\"dd/MM/yyyy\">\r\n");
      out.write("                    <input type=\"submit\" name=\"Search\">\r\n");
      out.write("                </pre>\r\n");
      out.write("            </form>\r\n");
      out.write("        </p>\r\n");
      out.write("        \r\n");
      out.write("        <table border=\"1\" cellspacing=\"5\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>UserID</th>\r\n");
      out.write("                    <th>Initial Date</th>\r\n");
      out.write("                    <th>Initial Time</th>\r\n");
      out.write("                    <th>Final Date</th>\r\n");
      out.write("                    <th>Final Time</th>\r\n");
      out.write("                    <th>Deletion</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            <c:forEach var=\"log\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logsToDisplay}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${log.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${log.getInitialDateAsSolitaryString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${log.getInitialDateAsTimeString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${log.getFinalDateAsSolitaryString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${log.getFinalDateAsTimeString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("                    <td><input type=\"submit\" value=\"Delete\" onClick=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </c:forEach>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
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
