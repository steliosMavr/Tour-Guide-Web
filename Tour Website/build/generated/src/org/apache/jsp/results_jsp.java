package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class results_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"view/MyCss/css/results.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div  class=\"header\">\n");
      out.write("            <a href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"><img src=\"view/MyCss/images/Mylogo.png\" alt=\"logo\" width=\"150\" height=\"50\" /></a>\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\"  data-toggle=\"modal\" data-target=\"#register_modal\" >Εγγραφή</button>\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#connect_modal\" id=\"connection_button\">Σύνδεση</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"register_modal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\">Εγγραφή</h4>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <form action=\"BookingServlet\" id=\"register_form\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <label for=\"text\">Όνομα:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\"  placeholder=\"Εισάγετε Όνομα\" name=\"username\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <label for=\"text\">Επίθετο:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\"  placeholder=\"Εισάγετε Επίθετο\" name=\"lastname\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\"  placeholder=\"Εισάγετε Email\" name=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pwd\">Κωδικός</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\"  placeholder=\"Εισάγετε Κωδικό\" name=\"pwd\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"register_form\">\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Εγγραφή</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"connect_modal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\">Σύνδεση</h4>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <form action=\"BookingServlet\" id=\"register_form\" method=\"POST\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Εισάγετε Email\" name=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pwd\">Κωδικός</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Εισάγετε Κωδικό\" name=\"pwd\"required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger alert-dismissable\">\n");
      out.write("\n");
      out.write("                            <strong>Λαθος Στοιχεία</strong> Παρακαλούμε προσπαθήστε ξανά.\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"connection_form\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Σύνδεση</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-sm\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\">Ευχαριστούμε για την προτίμηση σας</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <p>Η Εγγραφή σας ηταν επιτυχής</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"under_header\">\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <button class=\"btn btn-default  dropdown-toggle\" type=\"button\" id=\"menu1\" data-toggle=\"dropdown\">Μενού\n");
      out.write("                    <span class=\"caret\"></span></button>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"menu1\">\n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">Ξενοδοχεία</a></li>\n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Μουσεία</a></li>\n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Αξιοθέατα</a></li> \n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Δρομολόγια </a></li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Επικοινωνια </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h3 style=\"text-align: center;\">Αποτελέσματα Αναζήτησης</h3>      \n");
      out.write("                <ul class=\"nav nav-tabs\">\n");
      out.write("                    <li class=\"active\"><a href=\"#\">Ξενοδοχεία</a></li>\n");
      out.write("                    <li><a href=\"#\">Εκδρομικά Γραφεία</a></li>\n");
      out.write("                    <li><a href=\"#\">Ενοικιαστικά Γραφεία</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"well well-lg\" id=\"myInfo\" style=\"margin-top:0px;\"> \n");
      out.write("                    <img id=\"my_img\" src=\"data:image/jpeg;base64,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\">\n");
      out.write("                     <span class=\"label label-success \" style=\"font-size: 15px; position: relative; bottom:15px; \">Το Ξενοδοχείο Αυτο ειναι Διαθέσιμο</span>\n");
      out.write("                    <div class=\"hotel_information\">\n");
      out.write("                        <h2><a id=\"hotel_name\">Hotel Name</a></h2>    \n");
      out.write("\n");
      out.write("                        <h4><a  href=\"#\" ><div id=\"star\" class=\"hotel_star\">category</div></a></h4>\n");
      out.write("                        <span id=\"category\" style=\"display: none\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <h5><a href=\"#\" class=\"group\"id=\"hotel_telephone\"></a></h5>\n");
      out.write("                        <h5><a href=\"#\" class=\"group\" id=\"hotel_area\">Chania</a><span class=\"glyphicon glyphicon-map-marker\"></span></h5>\n");
      out.write("\n");
      out.write("                        <div style=\"float: right; position: relative; bottom:110px;\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <span id=\"people\" class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("\n");
      out.write("                            <h4>Άτομα/Άτομο</h4>\n");
      out.write("                            <h3> <a href=\"#\" id=\"price\">12&euro;</a></h3>    \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"well well-lg\" id=\"myInfo\" style=\"margin-top:0px;\"> \n");
      out.write("                    <img id=\"my_img\" src=\"data:image/jpeg;base64,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\">\n");
      out.write("                     <span class=\"label label-success \" style=\"font-size: 15px; position: relative; bottom:15px; \">Το Ξενοδοχείο Αυτο ειναι Διαθέσιμο</span>\n");
      out.write("                    <div class=\"hotel_information\">\n");
      out.write("                        <h2><a id=\"hotel_name\">Hotel Name</a></h2>    \n");
      out.write("\n");
      out.write("                        <h4><a  href=\"#\" ><div id=\"star\" class=\"hotel_star\">category</div></a></h4>\n");
      out.write("                        <span id=\"category\" style=\"display: none\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <h5><a href=\"#\" class=\"group\"id=\"hotel_telephone\"></a></h5>\n");
      out.write("                        <h5><a href=\"#\" class=\"group\" id=\"hotel_area\">Chania</a><span class=\"glyphicon glyphicon-map-marker\"></span></h5>\n");
      out.write("\n");
      out.write("                        <div style=\"float: right; position: relative; bottom:110px;\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <span id=\"people\" class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("\n");
      out.write("                            <h4>Άτομα/Άτομο</h4>\n");
      out.write("                            <h3> <a href=\"#\" id=\"price\">12&euro;</a></h3>    \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"well well-lg\" id=\"myInfo\" style=\"margin-top:0px;\"> \n");
      out.write("                    <img id=\"my_img\" src=\"data:image/jpeg;base64,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\">\n");
      out.write("                     <span class=\"label label-success \" style=\"font-size: 15px; position: relative; bottom:15px; \">Το Ξενοδοχείο Αυτο ειναι Διαθέσιμο</span>\n");
      out.write("                    <div class=\"hotel_information\">\n");
      out.write("                        <h2><a id=\"hotel_name\">Hotel Name</a></h2>    \n");
      out.write("\n");
      out.write("                        <h4><a  href=\"#\" ><div id=\"star\" class=\"hotel_star\">category</div></a></h4>\n");
      out.write("                        <span id=\"category\" style=\"display: none\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotelList.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <h5><a href=\"#\" class=\"group\"id=\"hotel_telephone\"></a></h5>\n");
      out.write("                        <h5><a href=\"#\" class=\"group\" id=\"hotel_area\">Chania</a><span class=\"glyphicon glyphicon-map-marker\"></span></h5>\n");
      out.write("\n");
      out.write("                        <div style=\"float: right; position: relative; bottom:110px;\" >\n");
      out.write("\n");
      out.write("                            <span id=\"people\" class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("                            <span id=\"people\" class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("                            <span id=\"people\" class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("                            <span id=\"people\" class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("\n");
      out.write("                            <h4>Άτομα/Άτομο</h4>\n");
      out.write("                            <h3> <a href=\"#\" id=\"price\">12&euro;</a></h3>     \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
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
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/BookingServlet");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/BookingServlet?action=redirectToHotels");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.loggIn == 'true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"menu\">\n");
        out.write("\n");
        out.write("                    <script>$(\"#connection_button\").prop('disabled', true);</script> \n");
        out.write("                    <a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>        \n");
        out.write("                    <a href=\"");
        if (_jspx_meth_c_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\"><span class=\"glyphicon glyphicon-log-out\"></span> Αποσύνδεση</a>\n");
        out.write("\n");
        out.write("\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_url_2.setValue("/BookingServlet?action=disconnect");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${succesMessage == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <script>  $('#myModal').modal('show');</script>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <script>\n");
        out.write("                    $('#connect_modal').modal('show');\n");
        out.write("                    $(\".alert-dismissable\").css(\"display\", \"block\");\n");
        out.write("                </script>\n");
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
