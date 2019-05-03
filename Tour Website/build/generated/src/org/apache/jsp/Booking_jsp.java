package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"view/MyCss/css/booking.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div  class=\"header\">\n");
      out.write("\n");
      out.write("            <a href=\"#\"><img src=\"view/MyCss/images/Mylogo.png\" alt=\"logo\" width=\"150\" height=\"50\" /></a>\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\">Εγγραφή</button>\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\">Σύνδεση</button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"under_header\">\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <button class=\"btn btn-default  dropdown-toggle\" type=\"button\" id=\"menu1\" data-toggle=\"dropdown\">Μενού\n");
      out.write("                    <span class=\"caret\"></span></button>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"menu1\">\n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Ξενοδοχεία</a></li>\n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Μουσεία</a></li>\n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Αξιοθέατα</a></li> \n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Δρομολόγια </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"menu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>  Ο Λογαριασμός μου</a>        \n");
      out.write("                <a href=\"#\">Αποσύνδεση</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"well\">\n");
      out.write("                <h4> <span class=\"glyphicon glyphicon-search\"></span> Αναζήτηση Ξενοδοχείων</h4>\n");
      out.write("\n");
      out.write("                <form>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"text\">Προορισμός</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"email\">            \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"text\">Ημερομηνία αναχώρησης</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"datepicker1\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"text\">Ημερομηνία άφιξης</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"datepicker\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    Δωμάτια:\n");
      out.write("                    <select class=\"control-group inline\" id=\"sel1\">\n");
      out.write("                        <option>1</option>\n");
      out.write("                        <option>2</option>\n");
      out.write("                        <option>3</option>\n");
      out.write("                        <option>4</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    Ενήλικες:\n");
      out.write("                    <select class=\"control-group inline\" id=\"sel1\">\n");
      out.write("                        <option>1</option>\n");
      out.write("                        <option>2</option>\n");
      out.write("                        <option>3</option>\n");
      out.write("                        <option>4</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    Παιδιά:\n");
      out.write("                    <select class=\"control-group inline\" id=\"sel1\">\n");
      out.write("                        <option>1</option>\n");
      out.write("                        <option>2</option>\n");
      out.write("                        <option>3</option>\n");
      out.write("                        <option>4</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Αναζήτηση</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <h3>Προορισμοί που θα Λατρέψετε</h3>      \n");
      out.write("            <div class=\"destinationsList\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"destinations\" id=\"athens\">\n");
      out.write("                    Αθήνα,Ελλάδα\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"destinations\" id=\"thess\">\n");
      out.write("                    Θεσσαλονίκη,Ελλάδα\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"destinations\" id=\"chania\">\n");
      out.write("                    Χανία,Ελλάδα\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#datepicker\").datepicker();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#datepicker1\").datepicker();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
