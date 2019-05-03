package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DatabaseShowPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"MyCss/DatabaseShowPanel.css\"/> \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.html", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "SideBar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div id=\"databaseShowPanel\" >\n");
      out.write("                <div class=\"title\"><h1>Database Show Panel</h1></div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button class=\"accordion\">Hotels</button>\n");
      out.write("            <div class=\"panel\">\n");
      out.write("                <table id=\"myTable\">\n");
      out.write("                    <tr class=\"header\">\n");
      out.write("                        <th clas=\"asd\" style=\"width:5%;\">ID</th>\n");
      out.write("                        <th style=\"width:10%;\">Hotel Name</th>\n");
      out.write("                        <th style=\"width:10%;\">Hotel Address</th>\n");
      out.write("                        <th style=\"width:10%;\">Hotel Category</th>\n");
      out.write("                        <th style=\"width:10%;\">Hotel Telephone</th>\n");
      out.write("                        <th style=\"width:10%;\">Hotel Number</th>\n");
      out.write("                        <th style=\"width:10%;\">Room Category</th>\n");
      out.write("                        <th style=\"width:10%;\">Remove</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Save time sheet\" />\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            var acc = document.getElementsByClassName(\"accordion\");\n");
      out.write("            var i;\n");
      out.write("\n");
      out.write("            for (i = 0; i < acc.length; i++) {\n");
      out.write("                acc[i].onclick = function () {\n");
      out.write("                    this.classList.toggle(\"active\");\n");
      out.write("                    var panel = this.nextElementSibling;\n");
      out.write("                    if (panel.style.display === \"block\") {\n");
      out.write("                        panel.style.display = \"none\";\n");
      out.write("                    } else {\n");
      out.write("                        panel.style.display = \"block\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#submit\").click(function () {\n");
      out.write("\n");
      out.write("                    var ids = [];\n");
      out.write("                    var checkedBoxes = [];\n");
      out.write("\n");
      out.write("\n");
      out.write("                    $('#myTable tr td:nth-child(1) ').each(function () {\n");
      out.write("                        ids.push($(this).text());\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("                    $('#myTable tr td:nth-child(8) input').each(function () {\n");
      out.write("                        checkedBoxes.push($(this).is(':checked'));\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("                    for (var i = 0; i < checkedBoxes.length; i++) {\n");
      out.write("\n");
      out.write("                        if (checkedBoxes[i].toString() == \"true\") {\n");
      out.write("                          //  alert(ids[i]);\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    var name = \"stlios\";\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'DatabaseShow',\n");
      out.write("                      type: 'POST',\n");
      out.write("                        data: {value: name},\n");
      out.write("                        success: function (data) {\n");
      out.write("                          alert('success' + data);\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("hotelList");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("\n");
          out.write("                        <td id=\"databaseID\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.roomCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td><input  type=\"checkbox\" name=\"checked\" id=\"dsas\" /></td>\n");
          out.write("\n");
          out.write("                    </tr>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
