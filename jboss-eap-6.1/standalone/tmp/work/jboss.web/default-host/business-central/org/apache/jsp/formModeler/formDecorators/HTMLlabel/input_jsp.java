package org.apache.jsp.formModeler.formDecorators.HTMLlabel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jbpm.formModeler.service.LocaleManager;
import org.jbpm.formModeler.api.model.wrappers.I18nSet;
import org.apache.commons.lang.StringUtils;

public final class input_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.release();
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.release();
    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.release();
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

    java.lang.Object _jspx_localeManager_1 = null;

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
      out.write("\n");
      out.write("\n");
try { 
      out.write('\n');
      //  mvc:formatter
      org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FormatterTag _jspx_th_mvc_005fformatter_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FormatterTag) _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FormatterTag.class);
      _jspx_th_mvc_005fformatter_005f0.setPageContext(_jspx_page_context);
      _jspx_th_mvc_005fformatter_005f0.setParent(null);
      // /formModeler/formDecorators/HTMLlabel/input.jsp(23,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_mvc_005fformatter_005f0.setName("SimpleFieldHandlerFormatter");
      int _jspx_eval_mvc_005fformatter_005f0 = _jspx_th_mvc_005fformatter_005f0.doStartTag();
      if (_jspx_eval_mvc_005fformatter_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_mvc_005fformatter_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_mvc_005fformatter_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_mvc_005fformatter_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f0.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /formModeler/formDecorators/HTMLlabel/input.jsp(24,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f0.setName("output");
          int _jspx_eval_mvc_005ffragment_005f0 = _jspx_th_mvc_005ffragment_005f0.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("        ");
              //  mvc:fragmentValue
              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f0.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f0);
              // /formModeler/formDecorators/HTMLlabel/input.jsp(25,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f0.setName("htmlContent");
              // /formModeler/formDecorators/HTMLlabel/input.jsp(25,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f0.setId("htmlContent");
              int _jspx_eval_mvc_005ffragmentValue_005f0 = _jspx_th_mvc_005ffragmentValue_005f0.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object htmlContent = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f0.doInitBody();
                }
                htmlContent = (java.lang.Object) _jspx_page_context.findAttribute("htmlContent");
                do {
                  out.write("\n");
                  out.write("            ");
                  //  mvc:fragmentValue
                  org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f1 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                  _jspx_th_mvc_005ffragmentValue_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_mvc_005ffragmentValue_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f0);
                  // /formModeler/formDecorators/HTMLlabel/input.jsp(26,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f1.setName("localeManager");
                  // /formModeler/formDecorators/HTMLlabel/input.jsp(26,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f1.setId("localeManager");
                  int _jspx_eval_mvc_005ffragmentValue_005f1 = _jspx_th_mvc_005ffragmentValue_005f1.doStartTag();
                  if (_jspx_eval_mvc_005ffragmentValue_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object localeManager = null;
                    if (_jspx_eval_mvc_005ffragmentValue_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_mvc_005ffragmentValue_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_mvc_005ffragmentValue_005f1.doInitBody();
                    }
                    localeManager = (java.lang.Object) _jspx_page_context.findAttribute("localeManager");
                    do {
                      out.write("\n");
                      out.write("                ");
                      out.print(StringUtils.defaultString((String) ((LocaleManager) localeManager).localize(((I18nSet) htmlContent).asMap())) );
                      out.write("\n");
                      out.write("            ");
                      int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f1.doAfterBody();
                      localeManager = (java.lang.Object) _jspx_page_context.findAttribute("localeManager");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_mvc_005ffragmentValue_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_mvc_005ffragmentValue_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f1);
                  out.write("\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f0.doAfterBody();
                  htmlContent = (java.lang.Object) _jspx_page_context.findAttribute("htmlContent");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f0);
              out.write("\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f0);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_mvc_005fformatter_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_mvc_005fformatter_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_mvc_005fformatter_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.reuse(_jspx_th_mvc_005fformatter_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.reuse(_jspx_th_mvc_005fformatter_005f0);
      out.write('\n');
} catch (Throwable t) {
    System.out.println("Error showing HTML label " + t);
    t.printStackTrace();
}
      out.write('\n');
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
