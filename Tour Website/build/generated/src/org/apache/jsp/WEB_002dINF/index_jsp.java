package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"view/MyCss/css/booking.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "BookingServlet", out, false);
      out.write("\n");
      out.write("         \n");
      out.write("        <div  class=\"header\">\n");
      out.write("\n");
      out.write("            <a href=\"#\"><img src=\"view/MyCss/images/Mylogo.png\" alt=\"logo\" width=\"150\" height=\"50\" /></a>\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\"  data-toggle=\"modal\" data-target=\"#register_modal\" >Εγγραφή</button>\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#connect_modal\" id=\"connection_button\">Σύνδεση</button>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"under_header\">\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <button class=\"btn btn-default  dropdown-toggle\" type=\"button\" id=\"menu1\" data-toggle=\"dropdown\">Μενού\n");
      out.write("                    <span class=\"caret\"></span></button>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"menu1\">\n");
      out.write("                    <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
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
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <h3>Τα Καλύτερα Ξενοδοχεία του Κόσμου</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"destinationsList\">\n");
      out.write("\n");
      out.write("                <div  class=\"hotels\">\n");
      out.write("                    <img src=\"view/MyCss/images/aria-hotel-budapest.jpg\" class=\"img-rounded\" height=\"150\" width=\"300\">\n");
      out.write("                    <h6>Χώρα:Βουδαπέστη</h6>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div  class=\"hotels\">\n");
      out.write("                    <img src=\"view/MyCss/images/prague.jpg\" alt=\"Smiley face\" class=\"img-rounded\" height=\"150\" width=\"300\">\n");
      out.write("                    <h6>Χώρα:Πράγα</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div   class=\"hotels\">\n");
      out.write("                    <img src=\"view/MyCss/images/barcelona.jpg\" alt=\"Smiley face\" class=\"img-rounded\" height=\"150\" width=\"300\">\n");
      out.write("                    <h6>Χώρα:Μπαρστελόνα</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div   class=\"hotels\">\n");
      out.write("                    <img src=\"view/MyCss/images/italy.jpg\" alt=\"Smiley face\" class=\"img-rounded\" height=\"150\" width=\"300\">\n");
      out.write("                    <h6>Χώρα:Ιταλία</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h3>Όι Ποίο Δημοφιλείς  Προορισμοί</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"destinationsList\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"destinations\" id=\"bali\">\n");
      out.write("                    Μπαλί\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"destinations\" id=\"london\">\n");
      out.write("                    Λονδίνο\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"destinationsList\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"destinations\" id=\"france\">\n");
      out.write("\n");
      out.write("                    Γαλλία\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"destinations\" id=\"newYork\"> Νέα Υόρκη</div>\n");
      out.write("                <div class=\"destinations\" id=\"korea\">  Κορέα</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"information\">\n");
      out.write("\n");
      out.write("                <div class=\"info\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <section><p>Περισσότερα απο 300.000 Ξενοδοχεία σε όλο τον κόσμο.Βρείτε το δικό σας με ενα CLICK</p></section>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"info\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <section><p>Διαλέξτε Προορισμό και κλείστε τα εισιτήρια σας για ενα μοναδικο ταξίδη εύκολα και γρήγορα </p></section>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"info\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <section><p>Περισσότερα απο 100.000 Μουσεία και αξιοθέατα σε ολο τον κόσμο τα οποία αξίζει να επισκεφτείτε</p></section>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("            <h2>Δέν Βρήκατε ακόμα αυτο που ψάχνετε</h2>\n");
      out.write("\n");
      out.write("            <label class=\"radio-inline\"><input type=\"radio\" name=\"optradio\">Ξενοδοχεία</label>\n");
      out.write("            <label class=\"radio-inline\"><input type=\"radio\" name=\"optradio\">Μουσεία</label>\n");
      out.write("            <label class=\"radio-inline\"><input type=\"radio\" name=\"optradio\">Αξιοθέατα</label>\n");
      out.write("\n");
      out.write("            <form id=\"footer_search\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"text\" name=\"search\" placeholder=\"Αναζήτηση..\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"panel-footer\">\n");
      out.write("\n");
      out.write("                <h4><li value=\"1\"><a href=\"#\">Οι ποίο δημοφιλείς χώρες</a> </li></h4>\n");
      out.write("                <table class=\"table table-striped\" id=\"popular_hotels_table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"col-sm-2\">Ξενοδοχεία σε Ηνωμένες Πολιτείες</td>\n");
      out.write("                            <td class=\"col-md-2\"> Ξενοδοχεία σε Ιταλία</td>\n");
      out.write("                            <td class=\"col-md-2\">Ξενοδοχεία σε Γερμανία</td>\n");
      out.write("                            <td class=\"col-md-2\">Ξενοδοχεία σε Αυστρία</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"col-md-2\">Ξενοδοχεία σε Ηνωμένο Βασίλειο</td>\n");
      out.write("                            <td class=\"col-md-2\">Ξενοδοχεία σε Γαλλία</td>\n");
      out.write("                            <td class=\"col-md-2\">Ξενοδοχεία σε Ελλάδα</td>\n");
      out.write("                            <td class=\"col-md-2\">Ξενοδοχεία σε Ισπανία</td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h4> <li value=\"2\"><a href=\"#\">Κορυφαίοι προορισμοί</a></li></h4>\n");
      out.write("                <table class=\"table table-striped\" id=\"popular_destinations_table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"col-sm-2\">Ξενοδοχεία στην Αθήνα</td>\n");
      out.write("                            <td class=\"col-md-2\"> Ξενοδοχεία στη Θεσσαλονίκη</td>\n");
      out.write("                            <td class=\"col-sm-2\">Ξενοδοχεία στην Πάφο</td>\n");
      out.write("                            <td class=\"col-sm-2\">Ξενοδοχεία στη Λεμεσό</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"col-sm-2\">Ξενοδοχεία στον Πρωταρά</td>\n");
      out.write("                            <td class=\"col-sm-2\">Ξενοδοχεία σε Χανιά</td>\n");
      out.write("                            <td class=\"col-sm-2\">Ξενοδοχεία στον Πειραιά</td>\n");
      out.write("                            <td class=\"col-sm-2\">Ξενοδοχεία στη Ρόδο</td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h4><li  value=\"3\"><a href=\"#\">Πληροφορίες για εμάς</a></li></h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(\".panel-footer\").find(\"li\").click(function (e) {\n");
      out.write("\n");
      out.write("            e.preventDefault();\n");
      out.write("\n");
      out.write("            if ($(this).val() == 1) {\n");
      out.write("                $(\"#popular_hotels_table\").toggle();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if ($(this).val() == 2) {\n");
      out.write("                $(\"#popular_destinations_table\").toggle();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(function () {\n");
      out.write("            $(\"#datepicker\").datepicker();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(function () {\n");
      out.write("            $(\"#datepicker1\").datepicker();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(function () {\n");
      out.write("            $(\"#datepicker2\").datepicker();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(function () {\n");
      out.write("            $(\"#datepicker3\").datepicker();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/BookingServlet?action=redirectToHotels");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
        if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
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

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_url_1.setValue("/BookingServlet?action=disconnect");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
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
