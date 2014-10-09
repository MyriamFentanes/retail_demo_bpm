package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ResourceBundle;
import org.jboss.dashboard.LocaleManager;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      response.addHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/redhat/base.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/redhat/forms.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/redhat/login-screen.css\">\n");
      out.write("    <link rel=\"shortcut icon\"  href=\"");
      out.print(request.getContextPath());
      out.write("/favicon.ico\" />\n");
      out.write("    <title>Red Hat JBoss BPM Suite :: Dashboard Builder</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"login\">\n");
      out.write("    <div id=\"rcue-login-screen\">\n");
      out.write("      <img id=\"logo\" src=\"");
      out.print(request.getContextPath());
      out.write("/redhat/login-screen-logo.png\">\n");
      out.write("<div id=\"login-wrapper\" class=\"png_bg\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div id=\"login-content\">\n");
      out.write("        ");

            ResourceBundle i18nBundle = ResourceBundle.getBundle("org.jboss.dashboard.login", LocaleManager.currentLocale());
            String messageKey = request.getParameter("message");
            String message = "";
            if (messageKey != null)  message = i18nBundle.getString(messageKey);
        
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"j_security_check\" method=\"POST\">\n");
      out.write("         <fieldset>\n");
      out.write("         <legend><img src=\"");
      out.print(request.getContextPath());
      out.write("/redhat/RH-Product-Name.png\" alt=\"\" /></legend>\n");
      out.write("           <h3>");
      out.print( message );
      out.write("</h3>\n");
      out.write("           <p>\n");
      out.write("                <label>");
      out.print( i18nBundle.getString("login.username") );
      out.write("</label>\n");
      out.write("                <input value=\"\" name=\"j_username\" type=\"text\" autofocus/>\n");
      out.write("            </p>\n");
      out.write("            <br style=\"clear: both;\"/>\n");
      out.write("\n");
      out.write("            <p>\n");
      out.write("                <label>");
      out.print( i18nBundle.getString("login.password") );
      out.write("</label>\n");
      out.write("                <input name=\"j_password\" type=\"password\"/>\n");
      out.write("            </p>\n");
      out.write("            <br style=\"clear: both;\"/>\n");
      out.write("\n");
      out.write("            <p>\n");
      out.write("                <input type=\"submit\" value=\"Log In\"/>\n");
      out.write("            </p>\n");
      out.write("\t\t</fieldset>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
