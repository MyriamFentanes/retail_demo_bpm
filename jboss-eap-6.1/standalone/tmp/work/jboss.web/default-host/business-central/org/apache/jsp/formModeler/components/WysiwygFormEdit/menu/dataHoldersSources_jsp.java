package org.apache.jsp.formModeler.components.WysiwygFormEdit.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jbpm.formModeler.service.LocaleManager;
import org.jbpm.formModeler.api.model.Form;
import org.jbpm.formModeler.components.editor.WysiwygFormEditor;
import org.apache.commons.lang.StringEscapeUtils;

public final class dataHoldersSources_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fformUrl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005furl_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fparam_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstatic_005fimage_0026_005frelativePath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fformUrl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005furl_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstatic_005fimage_0026_005frelativePath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.release();
    _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.release();
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.release();
    _005fjspx_005ftagPool_005ffactory_005fformUrl_005fnobody.release();
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.release();
    _005fjspx_005ftagPool_005ffactory_005furl_0026_005faction.release();
    _005fjspx_005ftagPool_005ffactory_005fparam_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fstatic_005fimage_0026_005frelativePath_005fnobody.release();
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

    java.lang.Object _jspx_existingOutputIds_1 = null;
    java.lang.Object _jspx_existingIds_2 = null;
    java.lang.Object _jspx_name_1 = null;
    java.lang.Object _jspx_optionValue_1 = null;
    java.lang.Object _jspx_input_id_1 = null;
    java.lang.Object _jspx_outId_2 = null;
    java.lang.Object _jspx_deleteId_3 = null;
    java.lang.Object _jspx_type_4 = null;
    java.lang.Object _jspx_value_5 = null;
    java.lang.Object _jspx_renderColor_6 = null;
    java.lang.Object _jspx_rowStyle_7 = null;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  i18n:bundle
      java.util.ResourceBundle bundle = null;
      org.apache.taglibs.i18n.BundleTag _jspx_th_i18n_005fbundle_005f0 = (org.apache.taglibs.i18n.BundleTag) _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.get(org.apache.taglibs.i18n.BundleTag.class);
      _jspx_th_i18n_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fbundle_005f0.setParent(null);
      // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(27,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setId("bundle");
      // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(27,0) name = baseName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setBaseName("org.jbpm.formModeler.components.editor.messages");
      // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(27,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setLocale(LocaleManager.currentLocale());
      int _jspx_eval_i18n_005fbundle_005f0 = _jspx_th_i18n_005fbundle_005f0.doStartTag();
      bundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("bundle");
      if (_jspx_th_i18n_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.reuse(_jspx_th_i18n_005fbundle_005f0);
        return;
      }
      bundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("bundle");
      _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.reuse(_jspx_th_i18n_005fbundle_005f0);
      out.write('\n');
      out.write('\n');
      //  mvc:formatter
      org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FormatterTag _jspx_th_mvc_005fformatter_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FormatterTag) _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FormatterTag.class);
      _jspx_th_mvc_005fformatter_005f0.setPageContext(_jspx_page_context);
      _jspx_th_mvc_005fformatter_005f0.setParent(null);
      // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(30,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_mvc_005fformatter_005f0.setName("DataHoldersFormFormatter");
      int _jspx_eval_mvc_005fformatter_005f0 = _jspx_th_mvc_005fformatter_005f0.doStartTag();
      if (_jspx_eval_mvc_005fformatter_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_mvc_005fformatter_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_mvc_005fformatter_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_mvc_005fformatter_005f0.doInitBody();
        }
        do {
          out.write('\n');
          out.write('\n');
          //  mvc:fragment
          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f0.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(32,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f0.setName("outputStart");
          int _jspx_eval_mvc_005ffragment_005f0 = _jspx_th_mvc_005ffragment_005f0.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("    <form style=\"margin:0px\" action=\"");
              if (_jspx_meth_factory_005fformUrl_005f0(_jspx_th_mvc_005ffragment_005f0, _jspx_page_context))
                return;
              out.write("\" id=\"");
              if (_jspx_meth_factory_005fencode_005f0(_jspx_th_mvc_005ffragment_005f0, _jspx_page_context))
                return;
              out.write("\">\n");
              out.write("    ");
              if (_jspx_meth_factory_005fhandler_005f0(_jspx_th_mvc_005ffragment_005f0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("    <input type=\"hidden\" name=\"");
              out.print(WysiwygFormEditor.ACTION_TO_DO);
              out.write("\" id=\"");
              if (_jspx_meth_factory_005fencode_005f1(_jspx_th_mvc_005ffragment_005f0, _jspx_page_context))
                return;
              out.write("\"\n");
              out.write("           value=\"");
              out.print(WysiwygFormEditor.ACTION_ADD_DATA_HOLDER);
              out.write("\"/>\n");
              out.write("    <table width=\"100%\" >\n");
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
          out.write('\n');
          //  mvc:fragment
          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f1 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f1.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(40,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f1.setName("outputFormAddHolderStart");
          int _jspx_eval_mvc_005ffragment_005f1 = _jspx_th_mvc_005ffragment_005f1.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f1.doInitBody();
            }
            do {
              out.write("\n");
              out.write("    ");
              //  mvc:fragmentValue
              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f0.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f1);
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(41,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f0.setName("existingInputIds");
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(41,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f0.setId("existingInputIds");
              int _jspx_eval_mvc_005ffragmentValue_005f0 = _jspx_th_mvc_005ffragmentValue_005f0.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object existingInputIds = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f0.doInitBody();
                }
                existingInputIds = (java.lang.Object) _jspx_page_context.findAttribute("existingInputIds");
                do {
                  out.write("\n");
                  out.write("        ");
                  //  mvc:fragmentValue
                  org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f1 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                  _jspx_th_mvc_005ffragmentValue_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_mvc_005ffragmentValue_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f0);
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(42,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f1.setName("existingOutputIds");
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(42,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f1.setId("existingOutputIds");
                  int _jspx_eval_mvc_005ffragmentValue_005f1 = _jspx_th_mvc_005ffragmentValue_005f1.doStartTag();
                  if (_jspx_eval_mvc_005ffragmentValue_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object existingOutputIds = null;
                    if (_jspx_eval_mvc_005ffragmentValue_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_mvc_005ffragmentValue_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_mvc_005ffragmentValue_005f1.doInitBody();
                    }
                    existingOutputIds = (java.lang.Object) _jspx_page_context.findAttribute("existingOutputIds");
                    do {
                      out.write("\n");
                      out.write("            ");
                      //  mvc:fragmentValue
                      org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f2 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                      _jspx_th_mvc_005ffragmentValue_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_mvc_005ffragmentValue_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f1);
                      // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(43,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_mvc_005ffragmentValue_005f2.setName("existingIds");
                      // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(43,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_mvc_005ffragmentValue_005f2.setId("existingIds");
                      int _jspx_eval_mvc_005ffragmentValue_005f2 = _jspx_th_mvc_005ffragmentValue_005f2.doStartTag();
                      if (_jspx_eval_mvc_005ffragmentValue_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        java.lang.Object existingIds = null;
                        if (_jspx_eval_mvc_005ffragmentValue_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_mvc_005ffragmentValue_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_mvc_005ffragmentValue_005f2.doInitBody();
                        }
                        existingIds = (java.lang.Object) _jspx_page_context.findAttribute("existingIds");
                        do {
                          out.write("\n");
                          out.write("            <tr>\n");
                          out.write("            <td class=\"LeftColumnProperties\" align=\"center\">\n");
                          out.write("            <script type=\"text/javascript\">\n");
                          out.write("                var supportedHolders = new Array();\n");
                          out.write("                supportedHolders.push('");
                          out.print(Form.HOLDER_TYPE_CODE_BPM_PROCESS);
                          out.write("');\n");
                          out.write("                supportedHolders.push('");
                          out.print(Form.HOLDER_TYPE_CODE_POJO_DATA_MODEL);
                          out.write("');\n");
                          out.write("                supportedHolders.push('");
                          out.print(Form.HOLDER_TYPE_CODE_POJO_CLASSNAME);
                          out.write("');\n");
                          out.write("                supportedHolders.push('");
                          out.print(Form.HOLDER_TYPE_CODE_BASIC_TYPE);
                          out.write("');\n");
                          out.write("\n");
                          out.write("            function show_dataholderInfo(divStr) {\n");
                          out.write("                jQuery.each( supportedHolders, function( index, value ) {\n");
                          out.write("                    if (divStr == value) $('#' + value).show();\n");
                          out.write("                    else $('#' + value).hide();\n");
                          out.write("                });\n");
                          out.write("            }\n");
                          out.write("            show_dataholderInfo(\"none\");\n");
                          out.write("\n");
                          out.write("                function confirmAdd(){\n");
                          out.write("                    var existingInputIds = [");
                          out.print(existingInputIds);
                          out.write("];\n");
                          out.write("                    var existingOutputIds = [");
                          out.print(existingOutputIds);
                          out.write("];\n");
                          out.write("                    var existingIds = [");
                          out.print(existingIds);
                          out.write("];\n");
                          out.write("\n");
                          out.write("                    var inVal = $(\"#");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_INPUT_ID);
                          out.write("\").val();\n");
                          out.write("                    var idVal = $(\"#");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_ID);
                          out.write("\").val();\n");
                          out.write("                    var outVal = $(\"#");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_OUTPUT_ID);
                          out.write("\").val();\n");
                          out.write("                    if ((idVal && jQuery.inArray(idVal, existingIds)!=-1) ){\n");
                          out.write("                        alert(\"");
                          if (_jspx_meth_i18n_005fmessage_005f0(_jspx_th_mvc_005ffragmentValue_005f2, _jspx_page_context))
                            return;
                          out.write("\")\n");
                          out.write("                        return false;\n");
                          out.write("                    }\n");
                          out.write("                    if ((inVal && jQuery.inArray(inVal, existingInputIds)!=-1) ||\n");
                          out.write("                            (outVal && jQuery.inArray(outVal, existingOutputIds)!=-1)){\n");
                          out.write("                        alert(\"");
                          if (_jspx_meth_i18n_005fmessage_005f1(_jspx_th_mvc_005ffragmentValue_005f2, _jspx_page_context))
                            return;
                          out.write("\")\n");
                          out.write("                        return false;\n");
                          out.write("                    }\n");
                          out.write("                    if (!(inVal || outVal)){\n");
                          out.write("                        alert(\"");
                          if (_jspx_meth_i18n_005fmessage_005f2(_jspx_th_mvc_005ffragmentValue_005f2, _jspx_page_context))
                            return;
                          out.write("\")\n");
                          out.write("                        return false;\n");
                          out.write("                    }\n");
                          out.write("                    if(!idVal){\n");
                          out.write("                        alert(\"");
                          if (_jspx_meth_i18n_005fmessage_005f3(_jspx_th_mvc_005ffragmentValue_005f2, _jspx_page_context))
                            return;
                          out.write("\")\n");
                          out.write("                        return false;\n");
                          out.write("                    }\n");
                          out.write("\n");
                          out.write("\n");
                          out.write("                }\n");
                          out.write("        </script>\n");
                          out.write("        <table>\n");
                          out.write("        <tr>\n");
                          out.write("            <td><b>");
                          if (_jspx_meth_i18n_005fmessage_005f4(_jspx_th_mvc_005ffragmentValue_005f2, _jspx_page_context))
                            return;
                          out.write(":</b></td>\n");
                          out.write("        </tr>\n");
                          out.write("        <tr>\n");
                          out.write("            <td><input name=\"");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_ID);
                          out.write("\" type=\"text\" class=\"skn-input\" value=\"\"\n");
                          out.write("                       size=\"20\" maxlength=\"64\" id=\"");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_ID);
                          out.write("\"></td>\n");
                          out.write("        </tr>\n");
                          out.write("        <tr>\n");
                          out.write("            <td><b>");
                          if (_jspx_meth_i18n_005fmessage_005f5(_jspx_th_mvc_005ffragmentValue_005f2, _jspx_page_context))
                            return;
                          out.write(":</b></td>\n");
                          out.write("        </tr>\n");
                          out.write("        <tr>\n");
                          out.write("            <td><input name=\"");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_INPUT_ID);
                          out.write("\" type=\"text\" class=\"skn-input\" value=\"\"\n");
                          out.write("                       size=\"20\" maxlength=\"64\" id=\"");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_INPUT_ID);
                          out.write("\"></td>\n");
                          out.write("        </tr>\n");
                          out.write("        <tr>\n");
                          out.write("            <td><b>");
                          if (_jspx_meth_i18n_005fmessage_005f6(_jspx_th_mvc_005ffragmentValue_005f2, _jspx_page_context))
                            return;
                          out.write(":</b></td>\n");
                          out.write("        </tr>\n");
                          out.write("        <tr>\n");
                          out.write("            <td><input name=\"");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_OUTPUT_ID);
                          out.write("\" type=\"text\" class=\"skn-input\" value=\"\"\n");
                          out.write("                       size=\"20\" maxlength=\"64\" id=\"");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_OUTPUT_ID);
                          out.write("\"></td>\n");
                          out.write("        </tr>\n");
                          out.write("        <tr>\n");
                          out.write("            <td><b>");
                          if (_jspx_meth_i18n_005fmessage_005f7(_jspx_th_mvc_005ffragmentValue_005f2, _jspx_page_context))
                            return;
                          out.write(":</b></td>\n");
                          out.write("        </tr>\n");
                          out.write("        <tr>\n");
                          out.write("            <td>\n");
                          out.write("                <select class=\"skn-input\" name=\"");
                          out.print(WysiwygFormEditor.PARAMETER_HOLDER_RENDERCOLOR);
                          out.write("\">\n");
                          out.write("            ");
                          int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f2.doAfterBody();
                          existingIds = (java.lang.Object) _jspx_page_context.findAttribute("existingIds");
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_mvc_005ffragmentValue_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_mvc_005ffragmentValue_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f2);
                      out.write("\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f1.doAfterBody();
                      existingOutputIds = (java.lang.Object) _jspx_page_context.findAttribute("existingOutputIds");
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
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f0.doAfterBody();
                  existingInputIds = (java.lang.Object) _jspx_page_context.findAttribute("existingInputIds");
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
              out.write('\n');
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f1);
          out.write('\n');
          //  mvc:fragment
          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f2 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f2.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(122,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f2.setName("color");
          int _jspx_eval_mvc_005ffragment_005f2 = _jspx_th_mvc_005ffragment_005f2.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f2.doInitBody();
            }
            do {
              out.write("\n");
              out.write("    ");
              //  mvc:fragmentValue
              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f3 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f3.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f2);
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(123,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f3.setName("color");
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(123,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f3.setId("color");
              int _jspx_eval_mvc_005ffragmentValue_005f3 = _jspx_th_mvc_005ffragmentValue_005f3.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object color = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f3.doInitBody();
                }
                color = (java.lang.Object) _jspx_page_context.findAttribute("color");
                do {
                  out.write("\n");
                  out.write("    ");
                  //  mvc:fragmentValue
                  org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f4 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                  _jspx_th_mvc_005ffragmentValue_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_mvc_005ffragmentValue_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f3);
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(124,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f4.setName("name");
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(124,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f4.setId("name");
                  int _jspx_eval_mvc_005ffragmentValue_005f4 = _jspx_th_mvc_005ffragmentValue_005f4.doStartTag();
                  if (_jspx_eval_mvc_005ffragmentValue_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object name = null;
                    if (_jspx_eval_mvc_005ffragmentValue_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_mvc_005ffragmentValue_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_mvc_005ffragmentValue_005f4.doInitBody();
                    }
                    name = (java.lang.Object) _jspx_page_context.findAttribute("name");
                    do {
                      out.write("\n");
                      out.write("        <option value=\"");
                      out.print(color);
                      out.write('"');
                      out.write('>');
                      //  i18n:message
                      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f8 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
                      _jspx_th_i18n_005fmessage_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_i18n_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f4);
                      // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(125,35) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_i18n_005fmessage_005f8.setKey((String)name);
                      int _jspx_eval_i18n_005fmessage_005f8 = _jspx_th_i18n_005fmessage_005f8.doStartTag();
                      if (_jspx_eval_i18n_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_i18n_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_i18n_005fmessage_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_i18n_005fmessage_005f8.doInitBody();
                        }
                        do {
                          out.print(color);
                          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f8.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_i18n_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_i18n_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f8);
                      out.write("</option>\n");
                      out.write("    ");
                      int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f4.doAfterBody();
                      name = (java.lang.Object) _jspx_page_context.findAttribute("name");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_mvc_005ffragmentValue_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_mvc_005ffragmentValue_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f4);
                  out.write("\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f3.doAfterBody();
                  color = (java.lang.Object) _jspx_page_context.findAttribute("color");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f3);
              out.write('\n');
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f2);
          out.write('\n');
          //  mvc:fragment
          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f3 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f3.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(129,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f3.setName("outputFormHolderTypes");
          int _jspx_eval_mvc_005ffragment_005f3 = _jspx_th_mvc_005ffragment_005f3.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f3.doInitBody();
            }
            do {
              out.write("\n");
              out.write("                </select>\n");
              out.write("            </td>\n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <td><b>");
              if (_jspx_meth_i18n_005fmessage_005f9(_jspx_th_mvc_005ffragment_005f3, _jspx_page_context))
                return;
              out.write(":</b></td>\n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <td>\n");
              out.write("                <!--input type=\"radio\" name=\"");
              out.print(WysiwygFormEditor.PARAMETER_HOLDER_TYPE);
              out.write("\"\n");
              out.write("                   value=\"");
              out.print(Form.HOLDER_TYPE_CODE_BPM_PROCESS);
              out.write("\"\n");
              out.write("                   onclick=\"show_dataholderInfo('");
              out.print(Form.HOLDER_TYPE_CODE_BPM_PROCESS);
              out.write("');\">&nbsp;");
              if (_jspx_meth_i18n_005fmessage_005f10(_jspx_th_mvc_005ffragment_005f3, _jspx_page_context))
                return;
              out.write("<br-->\n");
              out.write("                <label><input type=\"radio\" name=\"");
              out.print(WysiwygFormEditor.PARAMETER_HOLDER_TYPE);
              out.write("\"\n");
              out.write("                       value=\"");
              out.print(Form.HOLDER_TYPE_CODE_POJO_DATA_MODEL);
              out.write("\"\n");
              out.write("                       onclick=\"show_dataholderInfo('");
              out.print(Form.HOLDER_TYPE_CODE_POJO_DATA_MODEL);
              out.write("')\">&nbsp;");
              if (_jspx_meth_i18n_005fmessage_005f11(_jspx_th_mvc_005ffragment_005f3, _jspx_page_context))
                return;
              out.write("</label><br>\n");
              out.write("                <label><input type=\"radio\" name=\"");
              out.print(WysiwygFormEditor.PARAMETER_HOLDER_TYPE);
              out.write("\"\n");
              out.write("                       value=\"");
              out.print(Form.HOLDER_TYPE_CODE_POJO_CLASSNAME);
              out.write("\"\n");
              out.write("                       onclick=\"show_dataholderInfo('");
              out.print(Form.HOLDER_TYPE_CODE_POJO_CLASSNAME);
              out.write("')\">&nbsp;");
              if (_jspx_meth_i18n_005fmessage_005f12(_jspx_th_mvc_005ffragment_005f3, _jspx_page_context))
                return;
              out.write("<label><br>\n");
              out.write("                <label><input type=\"radio\" name=\"");
              out.print(WysiwygFormEditor.PARAMETER_HOLDER_TYPE);
              out.write("\"\n");
              out.write("                       value=\"");
              out.print(Form.HOLDER_TYPE_CODE_BASIC_TYPE);
              out.write("\"\n");
              out.write("                       onclick=\"show_dataholderInfo('");
              out.print(Form.HOLDER_TYPE_CODE_BASIC_TYPE);
              out.write("')\">&nbsp;");
              if (_jspx_meth_i18n_005fmessage_005f13(_jspx_th_mvc_005ffragment_005f3, _jspx_page_context))
                return;
              out.write("</label><br>\n");
              out.write("            </td>\n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <td><b>");
              if (_jspx_meth_i18n_005fmessage_005f14(_jspx_th_mvc_005ffragment_005f3, _jspx_page_context))
                return;
              out.write(":</b></td>\n");
              out.write("        </tr>\n");
              out.write("        <td valign=\"top\">\n");
              out.write("        <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\" >\n");
              out.write("\n");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f3);
          out.write('\n');
          if (_jspx_meth_mvc_005ffragment_005f4(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('\n');
          //  mvc:fragment
          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f5 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f5.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(167,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f5.setName("selectStart");
          int _jspx_eval_mvc_005ffragment_005f5 = _jspx_th_mvc_005ffragment_005f5.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f5.doInitBody();
            }
            do {
              out.write("\n");
              out.write("    ");
              //  mvc:fragmentValue
              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f5 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f5.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f5);
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(168,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f5.setName("id");
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(168,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f5.setId("id");
              int _jspx_eval_mvc_005ffragmentValue_005f5 = _jspx_th_mvc_005ffragmentValue_005f5.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object id = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f5.doInitBody();
                }
                id = (java.lang.Object) _jspx_page_context.findAttribute("id");
                do {
                  out.write("\n");
                  out.write("        ");
                  //  mvc:fragmentValue
                  org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f6 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                  _jspx_th_mvc_005ffragmentValue_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_mvc_005ffragmentValue_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f5);
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(169,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f6.setName("name");
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(169,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f6.setId("name");
                  int _jspx_eval_mvc_005ffragmentValue_005f6 = _jspx_th_mvc_005ffragmentValue_005f6.doStartTag();
                  if (_jspx_eval_mvc_005ffragmentValue_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object name = null;
                    if (_jspx_eval_mvc_005ffragmentValue_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_mvc_005ffragmentValue_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_mvc_005ffragmentValue_005f6.doInitBody();
                    }
                    name = (java.lang.Object) _jspx_page_context.findAttribute("name");
                    do {
                      out.write("\n");
                      out.write("            <select class=\"skn-input\" id=\"");
                      out.print( id );
                      out.write("\" name=\"");
                      out.print(name);
                      out.write("\" style=\"display: none\">\n");
                      out.write("        ");
                      int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f6.doAfterBody();
                      name = (java.lang.Object) _jspx_page_context.findAttribute("name");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_mvc_005ffragmentValue_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_mvc_005ffragmentValue_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f6);
                  out.write("\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f5.doAfterBody();
                  id = (java.lang.Object) _jspx_page_context.findAttribute("id");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f5);
              out.write('\n');
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f5);
          out.write('\n');
          out.write('\n');
          //  mvc:fragment
          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f6 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f6.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(175,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f6.setName("selectOption");
          int _jspx_eval_mvc_005ffragment_005f6 = _jspx_th_mvc_005ffragment_005f6.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f6.doInitBody();
            }
            do {
              out.write("\n");
              out.write("    ");
              //  mvc:fragmentValue
              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f7 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f7.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f6);
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(176,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f7.setName("optionLabel");
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(176,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f7.setId("optionLabel");
              int _jspx_eval_mvc_005ffragmentValue_005f7 = _jspx_th_mvc_005ffragmentValue_005f7.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object optionLabel = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f7.doInitBody();
                }
                optionLabel = (java.lang.Object) _jspx_page_context.findAttribute("optionLabel");
                do {
                  out.write("\n");
                  out.write("        ");
                  //  mvc:fragmentValue
                  org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f8 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                  _jspx_th_mvc_005ffragmentValue_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_mvc_005ffragmentValue_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f7);
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(177,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f8.setName("optionValue");
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(177,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f8.setId("optionValue");
                  int _jspx_eval_mvc_005ffragmentValue_005f8 = _jspx_th_mvc_005ffragmentValue_005f8.doStartTag();
                  if (_jspx_eval_mvc_005ffragmentValue_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object optionValue = null;
                    if (_jspx_eval_mvc_005ffragmentValue_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_mvc_005ffragmentValue_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_mvc_005ffragmentValue_005f8.doInitBody();
                    }
                    optionValue = (java.lang.Object) _jspx_page_context.findAttribute("optionValue");
                    do {
                      out.write("\n");
                      out.write("            <option value=\"");
                      out.print(optionValue);
                      out.write("\">\n");
                      out.write("                ");
                      out.print(optionLabel);
                      out.write("\n");
                      out.write("            </option>\n");
                      out.write("        ");
                      int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f8.doAfterBody();
                      optionValue = (java.lang.Object) _jspx_page_context.findAttribute("optionValue");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_mvc_005ffragmentValue_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_mvc_005ffragmentValue_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f8);
                  out.write("\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f7.doAfterBody();
                  optionLabel = (java.lang.Object) _jspx_page_context.findAttribute("optionLabel");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f7);
              out.write('\n');
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f6);
          out.write('\n');
          out.write('\n');
          if (_jspx_meth_mvc_005ffragment_005f7(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write('\n');
          if (_jspx_meth_mvc_005ffragment_005f8(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write('\n');
          //  mvc:fragment
          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f9 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f9.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(191,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f9.setName("outputFormAddHolderEnd");
          int _jspx_eval_mvc_005ffragment_005f9 = _jspx_th_mvc_005ffragment_005f9.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f9.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\n");
              out.write("    <tr>\n");
              out.write("        <td><input id=\"");
              out.print(Form.HOLDER_TYPE_CODE_POJO_CLASSNAME);
              out.write("\"\n");
              out.write("                   name=\"");
              out.print(WysiwygFormEditor.PARAMETER_HOLDER_INFO);
              out.write("\" type=\"text\" class=\"skn-input\" value=\"\"\n");
              out.write("                   size=\"20\" maxlength=\"64\" style=\"display: none\"></td>\n");
              out.write("    </tr>\n");
              out.write("    </table></td>\n");
              out.write("    <tr>\n");
              out.write("    </table>\n");
              out.write("    <br>\n");
              out.write("\n");
              out.write("    <div style=\"text-align: center;\">\n");
              out.write("\n");
              out.write("        <input type=\"submit\"\n");
              out.write("               value=\"");
              if (_jspx_meth_i18n_005fmessage_005f15(_jspx_th_mvc_005ffragment_005f9, _jspx_page_context))
                return;
              out.write("\"\n");
              out.write("               class=\"skn-button\" onclick=\"return confirmAdd()\">\n");
              out.write("    </div>\n");
              out.write("\n");
              out.write("    </td>\n");
              out.write("\n");
              out.write("\n");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f9);
          out.write('\n');
          out.write('\n');
          if (_jspx_meth_mvc_005ffragment_005f10(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('\n');
          //  mvc:fragment
          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f11 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f11.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(236,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f11.setName("outputBindings");
          int _jspx_eval_mvc_005ffragment_005f11 = _jspx_th_mvc_005ffragment_005f11.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f11.doInitBody();
            }
            do {
              out.write("\n");
              out.write("    ");
              //  mvc:fragmentValue
              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f9 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f9.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f11);
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(237,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f9.setName("id");
              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(237,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f9.setId("id");
              int _jspx_eval_mvc_005ffragmentValue_005f9 = _jspx_th_mvc_005ffragmentValue_005f9.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object id = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f9.doInitBody();
                }
                id = (java.lang.Object) _jspx_page_context.findAttribute("id");
                do {
                  out.write("\n");
                  out.write("    ");
                  //  mvc:fragmentValue
                  org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f10 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                  _jspx_th_mvc_005ffragmentValue_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_mvc_005ffragmentValue_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f9);
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(238,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f10.setName("input_id");
                  // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(238,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f10.setId("input_id");
                  int _jspx_eval_mvc_005ffragmentValue_005f10 = _jspx_th_mvc_005ffragmentValue_005f10.doStartTag();
                  if (_jspx_eval_mvc_005ffragmentValue_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object input_id = null;
                    if (_jspx_eval_mvc_005ffragmentValue_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_mvc_005ffragmentValue_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_mvc_005ffragmentValue_005f10.doInitBody();
                    }
                    input_id = (java.lang.Object) _jspx_page_context.findAttribute("input_id");
                    do {
                      out.write("\n");
                      out.write("        ");
                      //  mvc:fragmentValue
                      org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f11 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                      _jspx_th_mvc_005ffragmentValue_005f11.setPageContext(_jspx_page_context);
                      _jspx_th_mvc_005ffragmentValue_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f10);
                      // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(239,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_mvc_005ffragmentValue_005f11.setName("outId");
                      // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(239,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_mvc_005ffragmentValue_005f11.setId("outId");
                      int _jspx_eval_mvc_005ffragmentValue_005f11 = _jspx_th_mvc_005ffragmentValue_005f11.doStartTag();
                      if (_jspx_eval_mvc_005ffragmentValue_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        java.lang.Object outId = null;
                        if (_jspx_eval_mvc_005ffragmentValue_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_mvc_005ffragmentValue_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_mvc_005ffragmentValue_005f11.doInitBody();
                        }
                        outId = (java.lang.Object) _jspx_page_context.findAttribute("outId");
                        do {
                          out.write("\n");
                          out.write("            ");
                          //  mvc:fragmentValue
                          org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f12 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                          _jspx_th_mvc_005ffragmentValue_005f12.setPageContext(_jspx_page_context);
                          _jspx_th_mvc_005ffragmentValue_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f11);
                          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(240,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_mvc_005ffragmentValue_005f12.setName("deleteId");
                          // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(240,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_mvc_005ffragmentValue_005f12.setId("deleteId");
                          int _jspx_eval_mvc_005ffragmentValue_005f12 = _jspx_th_mvc_005ffragmentValue_005f12.doStartTag();
                          if (_jspx_eval_mvc_005ffragmentValue_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object deleteId = null;
                            if (_jspx_eval_mvc_005ffragmentValue_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_mvc_005ffragmentValue_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_mvc_005ffragmentValue_005f12.doInitBody();
                            }
                            deleteId = (java.lang.Object) _jspx_page_context.findAttribute("deleteId");
                            do {
                              out.write("\n");
                              out.write("                ");
                              //  mvc:fragmentValue
                              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f13 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                              _jspx_th_mvc_005ffragmentValue_005f13.setPageContext(_jspx_page_context);
                              _jspx_th_mvc_005ffragmentValue_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f12);
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(241,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_mvc_005ffragmentValue_005f13.setName("type");
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(241,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_mvc_005ffragmentValue_005f13.setId("type");
                              int _jspx_eval_mvc_005ffragmentValue_005f13 = _jspx_th_mvc_005ffragmentValue_005f13.doStartTag();
                              if (_jspx_eval_mvc_005ffragmentValue_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              java.lang.Object type = null;
                              if (_jspx_eval_mvc_005ffragmentValue_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_mvc_005ffragmentValue_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_mvc_005ffragmentValue_005f13.doInitBody();
                              }
                              type = (java.lang.Object) _jspx_page_context.findAttribute("type");
                              do {
                              out.write("\n");
                              out.write("                    ");
                              //  mvc:fragmentValue
                              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f14 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                              _jspx_th_mvc_005ffragmentValue_005f14.setPageContext(_jspx_page_context);
                              _jspx_th_mvc_005ffragmentValue_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f13);
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(242,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_mvc_005ffragmentValue_005f14.setName("value");
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(242,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_mvc_005ffragmentValue_005f14.setId("value");
                              int _jspx_eval_mvc_005ffragmentValue_005f14 = _jspx_th_mvc_005ffragmentValue_005f14.doStartTag();
                              if (_jspx_eval_mvc_005ffragmentValue_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              java.lang.Object value = null;
                              if (_jspx_eval_mvc_005ffragmentValue_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_mvc_005ffragmentValue_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_mvc_005ffragmentValue_005f14.doInitBody();
                              }
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              do {
                              out.write("\n");
                              out.write("                        ");
                              //  mvc:fragmentValue
                              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f15 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                              _jspx_th_mvc_005ffragmentValue_005f15.setPageContext(_jspx_page_context);
                              _jspx_th_mvc_005ffragmentValue_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f14);
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(243,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_mvc_005ffragmentValue_005f15.setName("renderColor");
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(243,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_mvc_005ffragmentValue_005f15.setId("renderColor");
                              int _jspx_eval_mvc_005ffragmentValue_005f15 = _jspx_th_mvc_005ffragmentValue_005f15.doStartTag();
                              if (_jspx_eval_mvc_005ffragmentValue_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              java.lang.Object renderColor = null;
                              if (_jspx_eval_mvc_005ffragmentValue_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_mvc_005ffragmentValue_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_mvc_005ffragmentValue_005f15.doInitBody();
                              }
                              renderColor = (java.lang.Object) _jspx_page_context.findAttribute("renderColor");
                              do {
                              out.write("\n");
                              out.write("                            ");
                              //  mvc:fragmentValue
                              org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f16 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentValueTag.class);
                              _jspx_th_mvc_005ffragmentValue_005f16.setPageContext(_jspx_page_context);
                              _jspx_th_mvc_005ffragmentValue_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f15);
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(244,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_mvc_005ffragmentValue_005f16.setName("rowStyle");
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(244,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_mvc_005ffragmentValue_005f16.setId("rowStyle");
                              int _jspx_eval_mvc_005ffragmentValue_005f16 = _jspx_th_mvc_005ffragmentValue_005f16.doStartTag();
                              if (_jspx_eval_mvc_005ffragmentValue_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              java.lang.Object rowStyle = null;
                              if (_jspx_eval_mvc_005ffragmentValue_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_mvc_005ffragmentValue_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_mvc_005ffragmentValue_005f16.doInitBody();
                              }
                              rowStyle = (java.lang.Object) _jspx_page_context.findAttribute("rowStyle");
                              do {
                              out.write("\n");
                              out.write("                                <tr class=\"");
                              out.print(rowStyle);
                              out.write("\">\n");
                              out.write("                                    <td align=\"center\" style=\"width:16px;\"><a\n");
                              out.write("                                            title=\"");
                              if (_jspx_meth_i18n_005fmessage_005f24(_jspx_th_mvc_005ffragmentValue_005f16, _jspx_page_context))
                              return;
                              out.write("\"\n");
                              out.write("                                            href=\"");
                              //  factory:url
                              org.jbpm.formModeler.service.bb.mvc.taglib.factory.URLTag _jspx_th_factory_005furl_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.factory.URLTag) _005fjspx_005ftagPool_005ffactory_005furl_0026_005faction.get(org.jbpm.formModeler.service.bb.mvc.taglib.factory.URLTag.class);
                              _jspx_th_factory_005furl_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_factory_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f16);
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(248,50) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_factory_005furl_005f0.setAction("formDataHolders");
                              int _jspx_eval_factory_005furl_005f0 = _jspx_th_factory_005furl_005f0.doStartTag();
                              if (_jspx_eval_factory_005furl_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_factory_005furl_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_factory_005furl_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_factory_005furl_005f0.doInitBody();
                              }
                              do {
                              out.write("\n");
                              out.write("                                         ");
                              //  factory:param
                              org.jbpm.formModeler.service.bb.mvc.taglib.factory.ParamTag _jspx_th_factory_005fparam_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.factory.ParamTag) _005fjspx_005ftagPool_005ffactory_005fparam_0026_005fvalue_005fname_005fnobody.get(org.jbpm.formModeler.service.bb.mvc.taglib.factory.ParamTag.class);
                              _jspx_th_factory_005fparam_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_factory_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_factory_005furl_005f0);
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(249,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_factory_005fparam_005f0.setName(WysiwygFormEditor.PARAMETER_HOLDER_ID);
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(249,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_factory_005fparam_005f0.setValue(deleteId);
                              int _jspx_eval_factory_005fparam_005f0 = _jspx_th_factory_005fparam_005f0.doStartTag();
                              if (_jspx_th_factory_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005ffactory_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_factory_005fparam_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005ffactory_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_factory_005fparam_005f0);
                              out.write("\n");
                              out.write("                                         ");
                              //  factory:param
                              org.jbpm.formModeler.service.bb.mvc.taglib.factory.ParamTag _jspx_th_factory_005fparam_005f1 = (org.jbpm.formModeler.service.bb.mvc.taglib.factory.ParamTag) _005fjspx_005ftagPool_005ffactory_005fparam_0026_005fvalue_005fname_005fnobody.get(org.jbpm.formModeler.service.bb.mvc.taglib.factory.ParamTag.class);
                              _jspx_th_factory_005fparam_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_factory_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_factory_005furl_005f0);
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(250,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_factory_005fparam_005f1.setName(WysiwygFormEditor.ACTION_TO_DO);
                              // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(250,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_factory_005fparam_005f1.setValue(WysiwygFormEditor.ACTION_REMOVE_DATA_HOLDER);
                              int _jspx_eval_factory_005fparam_005f1 = _jspx_th_factory_005fparam_005f1.doStartTag();
                              if (_jspx_th_factory_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005ffactory_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_factory_005fparam_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005ffactory_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_factory_005fparam_005f1);
                              out.write("\n");
                              out.write("                                      ");
                              int evalDoAfterBody = _jspx_th_factory_005furl_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_factory_005furl_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_factory_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005ffactory_005furl_0026_005faction.reuse(_jspx_th_factory_005furl_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005ffactory_005furl_0026_005faction.reuse(_jspx_th_factory_005furl_005f0);
                              out.write("\"\n");
                              out.write("                                            onclick=\"return confirm('");
                              if (_jspx_meth_i18n_005fmessage_005f25(_jspx_th_mvc_005ffragmentValue_005f16, _jspx_page_context))
                              return;
                              out.write("');\">\n");
                              out.write("                                        <img src=\"");
                              if (_jspx_meth_static_005fimage_005f0(_jspx_th_mvc_005ffragmentValue_005f16, _jspx_page_context))
                              return;
                              out.write("\" border=\"0\"\n");
                              out.write("                                             title=\"");
                              if (_jspx_meth_i18n_005fmessage_005f26(_jspx_th_mvc_005ffragmentValue_005f16, _jspx_page_context))
                              return;
                              out.write("\"/>\n");
                              out.write("                                    </a></td>\n");
                              out.write("                                    <td>\n");
                              out.write("                                        ");
                              out.print(StringEscapeUtils.escapeHtml((String)id) );
                              out.write("\n");
                              out.write("                                    </td>\n");
                              out.write("                                    <td>\n");
                              out.write("                                        ");
                              out.print(StringEscapeUtils.escapeHtml((String)input_id) );
                              out.write("\n");
                              out.write("                                    </td>\n");
                              out.write("                                    <td>\n");
                              out.write("                                        ");
                              out.print(StringEscapeUtils.escapeHtml((String)outId) );
                              out.write("\n");
                              out.write("                                    </td>\n");
                              out.write("                                    <td>\n");
                              out.write("                                        ");
                              out.print(type);
                              out.write("\n");
                              out.write("                                    </td>\n");
                              out.write("                                    <td>\n");
                              out.write("                                        ");
                              out.print(value);
                              out.write("\n");
                              out.write("                                    </td>\n");
                              out.write("                                    <td style=\"width: 100px;\">\n");
                              out.write("                                        <div style=\"background-color: ");
                              out.print(renderColor);
                              out.write(" \">&nbsp;</div>\n");
                              out.write("                                    </td>\n");
                              out.write("                                </tr>\n");
                              out.write("                            ");
                              int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f16.doAfterBody();
                              rowStyle = (java.lang.Object) _jspx_page_context.findAttribute("rowStyle");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_mvc_005ffragmentValue_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_mvc_005ffragmentValue_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f16);
                              return;
                              }
                              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f16);
                              out.write("\n");
                              out.write("                        ");
                              int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f15.doAfterBody();
                              renderColor = (java.lang.Object) _jspx_page_context.findAttribute("renderColor");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_mvc_005ffragmentValue_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_mvc_005ffragmentValue_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f15);
                              return;
                              }
                              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f15);
                              out.write("\n");
                              out.write("                    ");
                              int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f14.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_mvc_005ffragmentValue_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_mvc_005ffragmentValue_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f14);
                              return;
                              }
                              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f14);
                              out.write("\n");
                              out.write("                ");
                              int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f13.doAfterBody();
                              type = (java.lang.Object) _jspx_page_context.findAttribute("type");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_mvc_005ffragmentValue_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_mvc_005ffragmentValue_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f13);
                              return;
                              }
                              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f13);
                              out.write("\n");
                              out.write("            ");
                              int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f12.doAfterBody();
                              deleteId = (java.lang.Object) _jspx_page_context.findAttribute("deleteId");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_mvc_005ffragmentValue_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_mvc_005ffragmentValue_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f12);
                            return;
                          }
                          _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f12);
                          out.write("\n");
                          out.write("            ");
                          int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f11.doAfterBody();
                          outId = (java.lang.Object) _jspx_page_context.findAttribute("outId");
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_mvc_005ffragmentValue_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_mvc_005ffragmentValue_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f11);
                        return;
                      }
                      _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f11);
                      out.write("\n");
                      out.write("        ");
                      int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f10.doAfterBody();
                      input_id = (java.lang.Object) _jspx_page_context.findAttribute("input_id");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_mvc_005ffragmentValue_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_mvc_005ffragmentValue_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f10);
                    return;
                  }
                  _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f10);
                  out.write("\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f9.doAfterBody();
                  id = (java.lang.Object) _jspx_page_context.findAttribute("id");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f9);
              out.write('\n');
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f11.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f11);
          out.write('\n');
          out.write('\n');
          if (_jspx_meth_mvc_005ffragment_005f12(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('\n');
          if (_jspx_meth_mvc_005ffragment_005f13(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write('\n');
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

  private boolean _jspx_meth_factory_005fformUrl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:formUrl
    org.jbpm.formModeler.service.bb.mvc.taglib.factory.FormURLTag _jspx_th_factory_005fformUrl_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.factory.FormURLTag) _005fjspx_005ftagPool_005ffactory_005fformUrl_005fnobody.get(org.jbpm.formModeler.service.bb.mvc.taglib.factory.FormURLTag.class);
    _jspx_th_factory_005fformUrl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fformUrl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f0);
    int _jspx_eval_factory_005fformUrl_005f0 = _jspx_th_factory_005fformUrl_005f0.doStartTag();
    if (_jspx_th_factory_005fformUrl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fformUrl_005fnobody.reuse(_jspx_th_factory_005fformUrl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fformUrl_005fnobody.reuse(_jspx_th_factory_005fformUrl_005f0);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jbpm.formModeler.service.bb.mvc.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jbpm.formModeler.service.bb.mvc.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f0);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(33,61) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f0.setName("formDataHolders");
    int _jspx_eval_factory_005fencode_005f0 = _jspx_th_factory_005fencode_005f0.doStartTag();
    if (_jspx_th_factory_005fencode_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f0);
    return false;
  }

  private boolean _jspx_meth_factory_005fhandler_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:handler
    org.jbpm.formModeler.service.bb.mvc.taglib.factory.HandlerTag _jspx_th_factory_005fhandler_005f0 = (org.jbpm.formModeler.service.bb.mvc.taglib.factory.HandlerTag) _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005faction_005fnobody.get(org.jbpm.formModeler.service.bb.mvc.taglib.factory.HandlerTag.class);
    _jspx_th_factory_005fhandler_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fhandler_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f0);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(34,4) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fhandler_005f0.setAction("formDataHolders");
    int _jspx_eval_factory_005fhandler_005f0 = _jspx_th_factory_005fhandler_005f0.doStartTag();
    if (_jspx_th_factory_005fhandler_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005faction_005fnobody.reuse(_jspx_th_factory_005fhandler_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005faction_005fnobody.reuse(_jspx_th_factory_005fhandler_005f0);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jbpm.formModeler.service.bb.mvc.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f1 = (org.jbpm.formModeler.service.bb.mvc.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jbpm.formModeler.service.bb.mvc.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f1.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f0);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(35,72) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f1.setName("actionToDo");
    int _jspx_eval_factory_005fencode_005f1 = _jspx_th_factory_005fencode_005f1.doStartTag();
    if (_jspx_th_factory_005fencode_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f1);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f0 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f2);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(70,31) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f0.setKey("dataHolder_existingId_Message");
    int _jspx_eval_i18n_005fmessage_005f0 = _jspx_th_i18n_005fmessage_005f0.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f0.doInitBody();
      }
      do {
        out.write("Sure?");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f1 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f2);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(75,31) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f1.setKey("dataHolder_add_confirm");
    int _jspx_eval_i18n_005fmessage_005f1 = _jspx_th_i18n_005fmessage_005f1.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f1.doInitBody();
      }
      do {
        out.write("Sure?");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f2 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f2);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(79,31) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f2.setKey("dataHolder_requiredInOut");
    int _jspx_eval_i18n_005fmessage_005f2 = _jspx_th_i18n_005fmessage_005f2.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f2.doInitBody();
      }
      do {
        out.write("required input output!");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f3 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f2);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(83,31) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f3.setKey("dataHolder_requiredId");
    int _jspx_eval_i18n_005fmessage_005f3 = _jspx_th_i18n_005fmessage_005f3.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f3.doInitBody();
      }
      do {
        out.write("required id!");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f4 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f2);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(92,19) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f4.setKey("dataHolder_Id");
    int _jspx_eval_i18n_005fmessage_005f4 = _jspx_th_i18n_005fmessage_005f4.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f4.doInitBody();
      }
      do {
        out.write("!!!dataHolder_id");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f5 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f2);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(99,19) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f5.setKey("dataHolder_inputId");
    int _jspx_eval_i18n_005fmessage_005f5 = _jspx_th_i18n_005fmessage_005f5.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f5.doInitBody();
      }
      do {
        out.write("!!!dataHolder_input");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f5);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f6 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f2);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(106,19) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f6.setKey("dataHolder_outputId");
    int _jspx_eval_i18n_005fmessage_005f6 = _jspx_th_i18n_005fmessage_005f6.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f6.doInitBody();
      }
      do {
        out.write("!!!dataHolder_outputid");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f6);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f7 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f2);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(113,19) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f7.setKey("dataHolder_renderColor");
    int _jspx_eval_i18n_005fmessage_005f7 = _jspx_th_i18n_005fmessage_005f7.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f7.doInitBody();
      }
      do {
        out.write("!!!dataHolder_renderColor");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f7);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f9 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f9.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f3);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(134,19) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f9.setKey("dataHolder_type");
    int _jspx_eval_i18n_005fmessage_005f9 = _jspx_th_i18n_005fmessage_005f9.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f9.doInitBody();
      }
      do {
        out.write("!!!dataHolder_type");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f9);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f10 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f10.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f3);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(140,98) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f10.setKey("dataHolder_process");
    int _jspx_eval_i18n_005fmessage_005f10 = _jspx_th_i18n_005fmessage_005f10.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f10.doInitBody();
      }
      do {
        out.write("!!!Process ");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f10);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f11 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f11.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f3);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(144,105) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f11.setKey("dataHolder_datamodel");
    int _jspx_eval_i18n_005fmessage_005f11 = _jspx_th_i18n_005fmessage_005f11.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f11.doInitBody();
      }
      do {
        out.write("!!!Data Model source");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f11);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f12 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f12.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f3);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(148,104) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f12.setKey("dataHolder_info_javaClass");
    int _jspx_eval_i18n_005fmessage_005f12 = _jspx_th_i18n_005fmessage_005f12.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f12.doInitBody();
      }
      do {
        out.write("!!!dataHolder_info_javaClass");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f12);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f13 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f13.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f3);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(152,100) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f13.setKey("dataHolder_basicType");
    int _jspx_eval_i18n_005fmessage_005f13 = _jspx_th_i18n_005fmessage_005f13.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f13.doInitBody();
      }
      do {
        out.write("!!!Basic type source");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f13);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f14 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f14.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f3);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(157,19) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f14.setKey("dataHolder_info");
    int _jspx_eval_i18n_005fmessage_005f14 = _jspx_th_i18n_005fmessage_005f14.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f14.doInitBody();
      }
      do {
        out.write("!!!dataHolder_info");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f14);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f4 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f4.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(163,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f4.setName("rowStart");
    int _jspx_eval_mvc_005ffragment_005f4 = _jspx_th_mvc_005ffragment_005f4.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    <td>\n");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f4);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f7 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f7.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(185,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f7.setName("selectEnd");
    int _jspx_eval_mvc_005ffragment_005f7 = _jspx_th_mvc_005ffragment_005f7.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    </select>\n");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f7);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f8 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f8.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(188,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f8.setName("rowEnd");
    int _jspx_eval_mvc_005ffragment_005f8 = _jspx_th_mvc_005ffragment_005f8.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    </td>\n");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f8);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f15 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f15.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f9);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(206,22) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f15.setKey("dataHolder_addDataHolder");
    int _jspx_eval_i18n_005fmessage_005f15 = _jspx_th_i18n_005fmessage_005f15.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f15.doInitBody();
      }
      do {
        out.write("!!! dataHolder_addDataHolder");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f15);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f10 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f10.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(215,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f10.setName("outputStartBindings");
    int _jspx_eval_mvc_005ffragment_005f10 = _jspx_th_mvc_005ffragment_005f10.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("    <td class=\"RightMainColumn\">\n");
        out.write("\n");
        out.write("    <h1>");
        if (_jspx_meth_i18n_005fmessage_005f16(_jspx_th_mvc_005ffragment_005f10, _jspx_page_context))
          return true;
        out.write("</h1>\n");
        out.write("\n");
        out.write("    <p>");
        if (_jspx_meth_i18n_005fmessage_005f17(_jspx_th_mvc_005ffragment_005f10, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("    <br><br>\n");
        out.write("    <table width=\"100%\" class=\"skn-table_border\">\n");
        out.write("    <tr class=\"skn-table_header\">\n");
        out.write("        <td style=\"width:16px;\">&nbsp;</td>\n");
        out.write("        <td>");
        if (_jspx_meth_i18n_005fmessage_005f18(_jspx_th_mvc_005ffragment_005f10, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("        <td>");
        if (_jspx_meth_i18n_005fmessage_005f19(_jspx_th_mvc_005ffragment_005f10, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("        <td>");
        if (_jspx_meth_i18n_005fmessage_005f20(_jspx_th_mvc_005ffragment_005f10, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("        <td>");
        if (_jspx_meth_i18n_005fmessage_005f21(_jspx_th_mvc_005ffragment_005f10, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("        <td>");
        if (_jspx_meth_i18n_005fmessage_005f22(_jspx_th_mvc_005ffragment_005f10, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("        <td style=\"width: 100px;\">");
        if (_jspx_meth_i18n_005fmessage_005f23(_jspx_th_mvc_005ffragment_005f10, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\n");
        out.write("    </tr>\n");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f10);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f16 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f16.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f10);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(219,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f16.setKey("dataHolder_sources_title_list");
    int _jspx_eval_i18n_005fmessage_005f16 = _jspx_th_i18n_005fmessage_005f16.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f16.doInitBody();
      }
      do {
        out.write("Manage form data origins");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f16);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f17 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f17.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f10);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(221,7) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f17.setKey("dataHolder_sources_subtitle_list");
    int _jspx_eval_i18n_005fmessage_005f17 = _jspx_th_i18n_005fmessage_005f17.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f17.doInitBody();
      }
      do {
        out.write("!!!List of data sources that will be bound to form fields.");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f17);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f18 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f18.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f10);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(226,12) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f18.setKey("dataHolder_Id");
    int _jspx_eval_i18n_005fmessage_005f18 = _jspx_th_i18n_005fmessage_005f18.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f18.doInitBody();
      }
      do {
        out.write("!!!dataHolder_id");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f18);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f19 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f19.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f10);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(227,12) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f19.setKey("dataHolder_inputId");
    int _jspx_eval_i18n_005fmessage_005f19 = _jspx_th_i18n_005fmessage_005f19.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f19.doInitBody();
      }
      do {
        out.write("!!!dataHolder_InputId");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f19);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f20 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f20.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f10);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(228,12) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f20.setKey("dataHolder_outputId");
    int _jspx_eval_i18n_005fmessage_005f20 = _jspx_th_i18n_005fmessage_005f20.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f20.doInitBody();
      }
      do {
        out.write("!!!dataHolder_outid");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f20);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f21 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f21.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f10);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(229,12) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f21.setKey("dataHolder_type");
    int _jspx_eval_i18n_005fmessage_005f21 = _jspx_th_i18n_005fmessage_005f21.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f21.doInitBody();
      }
      do {
        out.write("!!!dataHolder_type");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f21);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f22 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f22.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f10);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(230,12) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f22.setKey("dataHolder_info");
    int _jspx_eval_i18n_005fmessage_005f22 = _jspx_th_i18n_005fmessage_005f22.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f22.doInitBody();
      }
      do {
        out.write("!!!!!!dataHolder_info");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f22);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f23 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f23.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f10);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(231,34) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f23.setKey("dataHolder_renderColor");
    int _jspx_eval_i18n_005fmessage_005f23 = _jspx_th_i18n_005fmessage_005f23.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f23.doInitBody();
      }
      do {
        out.write("!!!!!!dataHolder_renderColor");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f23);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f24 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f24.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f16);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(247,51) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f24.setKey("delete");
    int _jspx_eval_i18n_005fmessage_005f24 = _jspx_th_i18n_005fmessage_005f24.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f24.doInitBody();
      }
      do {
        out.write("!!!Borrar");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f24);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f25 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f25.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f16);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(252,69) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f25.setKey("dataHolder_delete.confirm");
    int _jspx_eval_i18n_005fmessage_005f25 = _jspx_th_i18n_005fmessage_005f25.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f25.doInitBody();
      }
      do {
        out.write("Sure?");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f25);
    return false;
  }

  private boolean _jspx_meth_static_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  static:image
    org.jbpm.bui.taglib.ImageResolverTag _jspx_th_static_005fimage_005f0 = (org.jbpm.bui.taglib.ImageResolverTag) _005fjspx_005ftagPool_005fstatic_005fimage_0026_005frelativePath_005fnobody.get(org.jbpm.bui.taglib.ImageResolverTag.class);
    _jspx_th_static_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_static_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f16);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(254,50) name = relativePath type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_static_005fimage_005f0.setRelativePath("actions/delete.png");
    int _jspx_eval_static_005fimage_005f0 = _jspx_th_static_005fimage_005f0.doStartTag();
    if (_jspx_th_static_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fstatic_005fimage_0026_005frelativePath_005fnobody.reuse(_jspx_th_static_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fstatic_005fimage_0026_005frelativePath_005fnobody.reuse(_jspx_th_static_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f26 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f26.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f16);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(255,52) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f26.setKey("delete");
    int _jspx_eval_i18n_005fmessage_005f26 = _jspx_th_i18n_005fmessage_005f26.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f26.doInitBody();
      }
      do {
        out.write("!!!Clear");
        int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_i18n_005fmessage_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_i18n_005fmessage_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f26);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f12 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f12.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(286,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f12.setName("outputEndBindings");
    int _jspx_eval_mvc_005ffragment_005f12 = _jspx_th_mvc_005ffragment_005f12.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f12.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    </table>\n");
        out.write("    </td>\n");
        out.write("    </tr>\n");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f12);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f13 = (org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jbpm.formModeler.service.bb.mvc.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f13.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(292,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f13.setName("outputEnd");
    int _jspx_eval_mvc_005ffragment_005f13 = _jspx_th_mvc_005ffragment_005f13.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f13.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    </table>\n");
        out.write("\n");
        out.write("    </form>\n");
        out.write("    <script type=\"text/javascript\" defer=\"defer\">\n");
        out.write("        setAjax(\"");
        if (_jspx_meth_factory_005fencode_005f2(_jspx_th_mvc_005ffragment_005f13, _jspx_page_context))
          return true;
        out.write("\");\n");
        out.write("    </script>\n");
        out.write("\n");
        out.write("\n");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f13);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jbpm.formModeler.service.bb.mvc.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f2 = (org.jbpm.formModeler.service.bb.mvc.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jbpm.formModeler.service.bb.mvc.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f2.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f13);
    // /formModeler/components/WysiwygFormEdit/menu/dataHoldersSources.jsp(297,17) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f2.setName("formDataHolders");
    int _jspx_eval_factory_005fencode_005f2 = _jspx_th_factory_005fencode_005f2.doStartTag();
    if (_jspx_th_factory_005fencode_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
    return false;
  }
}
