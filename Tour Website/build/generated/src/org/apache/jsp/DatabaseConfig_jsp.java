package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DatabaseConfig_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"view/MyCss/css/DatabaseConfig.css\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <div id=\"databaseConfigPanel\" >\n");
      out.write("            <div class=\"title\"><h1>Ρυθμίσεις Βάσης Δεδομένων</h1></div> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button class=\"database_tab\" id=\"database_info\">Πληροφορίες Βάσεις</button>\n");
      out.write("        <button class=\"database_tab\" id=\"database_prefference\" >Ρυθμίσεις Βάσεις </button>\n");
      out.write("\n");
      out.write("        <div class=\"info_database\">\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("            <ul>\n");
      out.write("                <li>Database Name:</li><br>\n");
      out.write("                <li>Driver Name:</li><br>\n");
      out.write("                <li>Driver Version:</li><br>\n");
      out.write("                <li>Username:</li><br>\n");
      out.write("                <li>URL:</li><br>\n");
      out.write("                <li>Database Product Name:</li><br>\n");
      out.write("                <li>Database Product Version:</li><br>\n");
      out.write("                <li>SQL Version:</li><br>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"database_config\">\n");
      out.write("            <h3>Επιλέξτε Πίνακα</h3>\n");
      out.write("            <select id=\"mainselection\">\n");
      out.write("                <option value=\"\">Hotels</option>\n");
      out.write("                <option value=\"\"> Pelates</option>\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <div class=\"columns\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr class=\"header\">\n");
      out.write("                        <th style=\"width:5%;\">ID</th>\n");
      out.write("                        <th style=\"width:10%;\">Columns</th>\n");
      out.write("                        <th style=\"width:10%;\">Περισότερες Πληροφορίες</th>\n");
      out.write("                        <th style=\"width:10%;\">Διαγραφή</th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>δασ</td>\n");
      out.write("                        <td>αδσ</td>\n");
      out.write("                        <td>Πατήστε <a href=\"#\">Εδώ</a></td>\n");
      out.write("\n");
      out.write("                        <td><input type=\"checkbox\" name=\"vehicle\" value=\"Bike\"></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Αποθύκευση\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(\".info_database\").css(\"display\", \"block\");\n");
      out.write("            $(\"#database_info\").css(\"background-color\", \"red\");\n");
      out.write("\n");
      out.write("            var max_fields = 9;\n");
      out.write("            var wrapper = $(\".database_config\");\n");
      out.write("            var x = 1;\n");
      out.write("\n");
      out.write("            $(\".add_fields\").click(function (e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("\n");
      out.write("                if (x < max_fields) { //max input box allowed\n");
      out.write("                    x++; //text box increment\n");
      out.write("                    $(wrapper).append('<div><label>Όνομα Πεδίου:</label><input type=\"text\" name=\"mytext[]\"/><label>Τύπος:</label> <select name=\"mySelections[]\"> <option>VARCHAR</option><option>INTEGER</option></select><a href=\"#\" class=\"remove_field\">Remove</a></div>'); //add input box\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(wrapper).on(\"click\", \".remove_field\", function (e) { //user click on remove text\n");
      out.write("                e.preventDefault();\n");
      out.write("                $(this).parent('div').remove();\n");
      out.write("                x--;\n");
      out.write("            })\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(\"#database_info\").click(function () {\n");
      out.write("\n");
      out.write("                $(\".info_database\").toggle();\n");
      out.write("                $(\".database_config\").css(\"display\", \"none\");\n");
      out.write("                $(\"#database_info\").css(\"background-color\", \"red\");\n");
      out.write("                $(\"#database_prefference\").css(\"background-color\", \"grey\");\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(\"#database_prefference\").click(function () {\n");
      out.write("\n");
      out.write("                $(\".database_config\").toggle();\n");
      out.write("                $(\".info_database\").css(\"display\", \"none\");\n");
      out.write("                $(\"#database_info\").css(\"background-color\", \"grey\");\n");
      out.write("                $(\"#database_prefference\").css(\"background-color\", \"red\");\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
        out.write("        ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
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
