package org.apache.jsp.folder.AdminPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DatabaseUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("          <link rel=\"stylesheet\" href=\"MyCss/css/DatabaseUpdate.css\"/> \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidebar.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("          ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <div id=\"databaseUpdate\" class=\"tabcontent\">\n");
      out.write("                <div class=\"box-top\"><h1>Database Input Form</h1></div> \n");
      out.write("                <div class=\"box-panel\">\n");
      out.write("                    <a  href=\"#\" id=\"defaultOpen\" class=\"links\" name=\"hotels\" >Hotel Update</a>\n");
      out.write("                    <a  href=\"#\"  class=\"links\" name=\"office\">Update 2</a>\n");
      out.write("                    <a  href=\"#\"  class=\"links\">Update 3</a>\n");
      out.write("\n");
      out.write("                    <div id=\"hoteDropdown\" class=\"dropdownContent\">\n");
      out.write("                        <form  enctype=\"multipart/form-data\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                            <label >Ονομασία Ξενοδοχείου </label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelName\" placeholder=\"ονομασία..\">\n");
      out.write("                            <label > Διεύθυνση Ξενοδοχείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelAddress\" placeholder=\"διεύθυνση..\">\n");
      out.write("                            <label > Kατηγορία Ξενοδοχείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelCategory\" placeholder=\"κατηγορία..\">\n");
      out.write("                            <label >Τηλέφωνο Ξενοδοχείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelTelephone\" placeholder=\"τηλέφωνο..\">\n");
      out.write("                            <label >Αριθμός Ξενοδοχείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelNumber\" placeholder=\"αριθμός ..\">\n");
      out.write("                            <label >Κατηγορία Δωματίων Ξενοδοχείου </label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelRoomCategory\" placeholder=\"κατηγορία δωματίων ..\">\n");
      out.write("                            \n");
      out.write("                            <label >Τιμή Δωματίου </label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelRoomPrice\" placeholder=\"Τιμή Δωματίου ..\">\n");
      out.write("                            \n");
      out.write("                            <input type=\"file\" name=\"image\" id=\"imgSave\" value=load\"/><br>\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"update\">\n");
      out.write("                            <input type=\"submit\" value=\"Submit\">\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"officeDropdown\" class=\"dropdownContent\">\n");
      out.write("                        <form >\n");
      out.write("                            <label >Ονομασία Γραφείου </label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelName\" placeholder=\"ονομασία..\">\n");
      out.write("                            <label > Διεύθυνση Γραφείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"address\" placeholder=\"διεύθυνση..\">\n");
      out.write("                            <label > Τηλέφωνο Γραφείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"category\" placeholder=\"Τηλέφωνο..\">        \n");
      out.write("                            <input type=\"submit\" value=\"Submit\"> \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("          $(\".dropdownContent\").css('display','none');\n");
      out.write("       \n");
      out.write("          $(\"#hoteDropdown\").css('display','block');\n");
      out.write("           $(\"#defaultOpen\").css('background-color',\"red\");\n");
      out.write("         \n");
      out.write("\n");
      out.write("             $('.box-panel').find('a').click(function(){\n");
      out.write("                 $('.box-panel').find('a').css('background-color',\"#333\");\n");
      out.write("                \n");
      out.write("                 $(this).css('background-color',\"red\");\n");
      out.write("                 \n");
      out.write("                 if($(this).attr('name')=='office'){\n");
      out.write("                      $(\".dropdownContent\").css('display','none');\n");
      out.write("                      $(\"#officeDropdown\").css('display','block');\n");
      out.write("                     \n");
      out.write("                 }\n");
      out.write("                 \n");
      out.write("                  if($(this).attr('name')=='hotels'){\n");
      out.write("                      $(\".dropdownContent\").css('display','none');\n");
      out.write("                      $(\"#hoteDropdown\").css('display','block');\n");
      out.write("                 }\n");
      out.write("                 \n");
      out.write("             });\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != 'true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_redirect_0.setUrl("LoginForm.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }
}
