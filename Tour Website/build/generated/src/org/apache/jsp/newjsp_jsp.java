package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>  \n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("    <title>Buckys Website</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"result.css\"/>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("      <div class=\"top\">\n");
      out.write("      \n");
      out.write("       <div class=\"buttons\">\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("       <button type=\"button\" >Συνδεση</button>\n");
      out.write("       <button type=\"button\" id=\"register\">Εγγραφειτε</button>\n");
      out.write(" \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("             \n");
      out.write("        \n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"search_results\">\n");
      out.write("    \n");
      out.write("         <form id=\"myForm\"   class=\"hotels\">  \n");
      out.write("         <input type=\"text\" name=\"name\" placeholder=\"Ξενοδοχειο,Πολη\">\n");
      out.write("         <input type=\"date\" name=\"firstname\"  >   \n");
      out.write("         <input type=\"date\" name=\"firstname\" >\n");
      out.write("         \n");
      out.write("            \n");
      out.write("         <input type=\"submit\" value=\"Ευρεση Ξενοδοχειων\">   \n");
      out.write("        \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("   <div class=\"main_c\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("    \n");
      out.write("        <div class=\"hotels_header\">\n");
      out.write("         <a>Ταξινωμηση Κατα:</a>\n");
      out.write("              \n");
      out.write("      <select>\n");
      out.write("    <option>τιμη</option>\n");
      out.write("    <option>Αυξουσα σε φθυνουσα</option>\n");
      out.write("     <option>φθυνουσα σε φθυνουσα</option>\n");
      out.write("    \n");
      out.write("  </select>\n");
      out.write("            <select>\n");
      out.write("    <option>Κατηγορια Ξενοδωχειου</option>\n");
      out.write("    <option>1 Κατηγορια</option>\n");
      out.write("     <option>2 Κατηγορια</option>\n");
      out.write("   <option>3 Κατηγορια</option>\n");
      out.write("    <option>4 Κατηγορια</option>\n");
      out.write("    <option>5 Κατηγορια</option>\n");
      out.write("    \n");
      out.write("  </select>\n");
      out.write("\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <h5>Filter</h5>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"slider_container\">\n");
      out.write("        <h5>Price Per night</h5>\n");
      out.write("       <div id=\"slider\"></div>\n");
      out.write("       <div id=\"slider_value\"></div>\n");
      out.write("                 \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"acidjs-rating-stars\">\n");
      out.write("            \n");
      out.write("            <h5>Stars Rating</h5>\n");
      out.write("            \n");
      out.write("    <form>\n");
      out.write("        <input type=\"radio\" name=\"group-1\" id=\"group-1-0\" value=\"5\" /><label for=\"group-1-0\"></label><!--\n");
      out.write("        --><input type=\"radio\" name=\"group-1\" id=\"group-1-1\" value=\"4\" /><label for=\"group-1-1\"></label><!--\n");
      out.write("        --><input type=\"radio\" name=\"group-1\" id=\"group-1-2\" value=\"3\" /><label for=\"group-1-2\"></label><!--\n");
      out.write("        --><input type=\"radio\" name=\"group-1\" id=\"group-1-3\" value=\"2\" /><label for=\"group-1-3\"></label><!--\n");
      out.write("        --><input type=\"radio\" name=\"group-1\" id=\"group-1-4\"  value=\"1\" /><label for=\"group-1-4\"></label>\n");
      out.write("    </form>\n");
      out.write("         \n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"Search\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form id=\"Search_Form\"   class=\"search\">\n");
      out.write("        <h5>Search refresh</h5>\n");
      out.write("         <input type=\"date\" name=\"firstname\"  > <br>\n");
      out.write("         <input type=\"date\" name=\"firstname\" ><br>\n");
      out.write("            \n");
      out.write("       <div class=\"styled-select slate\">\n");
      out.write("  <select>\n");
      out.write("    <option>1 δωματιο</option>\n");
      out.write("    <option>2 δωματια</option>\n");
      out.write("    <option>3 δωματια</option>\n");
      out.write("    <option>4 δωματια</option>\n");
      out.write("    <option>5 δωματια</option>\n");
      out.write("    <option>6 δωματια</option>\n");
      out.write("    <option>7 δωματια</option>\n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("    <div class=\"styled-select slate2\">\n");
      out.write("  <select>\n");
      out.write("    <option>1 Ενηλικας</option>\n");
      out.write("    <option>2 Ενηλικες</option>\n");
      out.write("    <option>3 Ενηλικες</option>\n");
      out.write("    <option>4 Ενηλικες</option>\n");
      out.write("    <option>5 Ενηλικες</option>\n");
      out.write("    <option>6 Ενηλικες</option>\n");
      out.write("    <option>7 Ενηλικες</option>\n");
      out.write("  </select>\n");
      out.write("         <select>\n");
      out.write("    <option>0 Παιδια</option>\n");
      out.write("    <option>1 Παιδι</option>\n");
      out.write("    <option>2 Παιδια</option>\n");
      out.write("    <option>3 Παιδια</option>\n");
      out.write("    <option>4 Παιδια</option>\n");
      out.write("    <option>5 Παιδια</option>\n");
      out.write("    <option>6 Παιδια</option>\n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("         <input type=\"submit\" value=\"Ευρεση Ξενοδοχειων\">   \n");
      out.write("        \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"aksiotheata\">\n");
      out.write("        <h5>Δραστηριοτητες</h5>\n");
      out.write("        \n");
      out.write("       <input type=\"checkbox\" id=\"checkbox-1-1\" class=\"regular-checkbox\" />Μουσεια<br>\n");
      out.write("        <input type=\"checkbox\" id=\"checkbox-1-1\" class=\"regular-checkbox\" />Αξιοθεατα<br>\n");
      out.write("\t\t\n");
      out.write("             \n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("       </div>\n");
      out.write("   \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write("        $(document).ready(function(){\n");
      out.write("           $(\"#slider_value\").html(0+\"$\");\n");
      out.write("          \n");
      out.write("            $(\"#slider\").slider({\n");
      out.write("                min:0,\n");
      out.write("                max:1000,\n");
      out.write("                step:10,\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                \n");
      out.write("                slide:function(event,ui){\n");
      out.write("                $(\"#slider_value\").html(ui.value+\"$\");\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        });\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("</html>");
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
          out.write("       <div class=\"hotels2\">\n");
          out.write("\n");
          out.write("             <img src=\"data:image/jpeg;base64,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.imgArray}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  height=\"190\" width=\"300\">\n");
          out.write("            \n");
          out.write("            <div class=\"hotel_inf\">\n");
          out.write("                  <h5>Ονομα :");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5> \n");
          out.write("                 <h5>Διευθηνση:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h5>\n");
          out.write("                 <h5>Τηλεφωνο :");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                 <h5>Κατηγορια: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.roomCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                 <h5>Τιμη:1000 </h5>\n");
          out.write("                   <input type=\"submit\" value=\"BOOK NOW\">   \n");
          out.write("            </div>\n");
          out.write("           \n");
          out.write("        \n");
          out.write("        </div>\n");
          out.write("        \n");
          out.write("       \n");
          out.write("   ");
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
