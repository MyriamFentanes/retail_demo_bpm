package org.apache.jsp.org_kie_workbench_KIEWebapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inlineeditor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      response.addHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

    response.setHeader("Cache-Control","no-cache");
    response.setHeader("Pragma","no-cache");
    response.setDateHeader ("Expires", -1);

      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:b3mn=\"http://b3mn.org/2007/b3mn\" xmlns:ext=\"http://b3mn.org/2007/ext\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:atom=\"http://b3mn.org/2007/atom+xhtml\">\n");
      out.write("<head profile=\"http://purl.org/NET/erdf/profile\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta http-equiv=\"PRAGMA\" content=\"NO-CACHE\">\n");
      out.write("    <meta http-equiv=\"Expires\" content=\"-1\">\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/jbpm.gif\" />\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/prototype-1.5.1.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/path_parser.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/ext-2.0.2/adapter/ext/ext-base.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/ext-2.0.2/ext-all.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/ext-2.0.2/color-field.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\">jQuery.noConflict();</script>\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/handlebars-1.0.0.beta.6.js\" type=\"text/javascript\"></script>\n");
      out.write("    <style xmlns=\"http://www.w3.org/1999/xhtml\" media=\"screen\" type=\"text/css\">@import url(\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/ext-2.0.2/resources/css/ext-all.css\");\n");
      out.write("    .extensive-remove {\n");
      out.write("        background-image: url(");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/images/remove.gif) ! important;\n");
      out.write("    }</style>\n");
      out.write("    <!-- utility scripts -->\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/compressed/designer-utils.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- styles -->\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/codemirror.css\" type=\"text/css\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/cmdialog.css\" type=\"text/css\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/fullscreen.css\" type=\"text/css\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/mic.css\" type=\"text/css\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/notifications.css\" type=\"text/css\" />\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/CFInstall.min.js\"></script>\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/theme-default.css\" type=\"text/css\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/xtheme-gray-colors.css\" type=\"text/css\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/xtheme-gray.css\" type=\"text/css\" />\n");
      out.write("    <!-- schemas -->\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.dc\" href=\"http://purl.org/dc/elements/1.1/\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.dcTerms\" href=\"http://purl.org/dc/terms/\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.b3mn\" href=\"http://b3mn.org\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.oryx\" href=\"http://oryx-editor.org/\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.raziel\" href=\"http://raziel.org/\" />\n");
      out.write("    <!-- core scripts -->\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/compressed/designer-core.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- translations -->\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/i18n/translation_");
      out.print(request.getParameter("locale"));
      out.write(".js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- plugins -->\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/compressed/designer-plugins.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- dynamic properties -->\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/editor/?uuid=");
      out.print(request.getParameter("uuid"));
      out.write("&profile=");
      out.print(request.getParameter("profile"));
      out.write("&pp=");
      out.print(request.getParameter("pp"));
      out.write("&editorid=");
      out.print(request.getParameter("editorid"));
      out.write("&readonly=");
      out.print(request.getParameter("readonly"));
      out.write("&ts=");
      out.print(request.getParameter("ts"));
      out.write("\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"overflow:hidden;\" onload=\"startit();\">\n");
      out.write("    <div id=\"Definition\"></div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        if(parent.document.getElementById(ORYX.EDITORID) && parent.document.getElementById(ORYX.EDITORID).parentNode && parent.document.getElementById(ORYX.EDITORID).parentNode.parentNode) {\n");
      out.write("            parent.document.getElementById(ORYX.EDITORID).parentNode.parentNode.style.overflow = 'hidden';\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
