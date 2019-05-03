package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DatabaseUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"view/MyCss/css/DatabaseUpdate.css\"/> \n");
      out.write("        <title>Database Update</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidebar.jsp", out, false);
      out.write("\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <div id=\"databaseUpdateMenu\" class=\"tabcontent\">\n");
      out.write("                <div class=\"header\"><h1>Ενημέρωση Βάσης Δεδομένων</h1></div> \n");
      out.write("                <div class=\"top-menu\">\n");
      out.write("                    <a  href=\"#\"   id=\"defaultOpen\"  name=\"hotels_update\">Ξενοδοχεία</a>\n");
      out.write("                    <a  href=\"#\"   name=\"office_update\">Γραφεία Ενοικίασεων</a>\n");
      out.write("                    <a  href=\"#\"   name=\"museum_update\">Μουσεία</a>\n");
      out.write("                    <a  href=\"#\"   name=\"landmark_update\">Αξιοθέατα </a>\n");
      out.write("                    <a  href=\"#\"   name=\"routes_update\">Δρομολόγια</a>\n");
      out.write("                    <a  href=\"#\"   name=\"tour_office_update\">Εκδρομικά Γραφεία</a>\n");
      out.write("                    <a  href=\"#\"   name=\"partners_update\">Συνεργάτες</a>\n");
      out.write("\n");
      out.write("                    <div id=\"hotel_fields\" class=\"dropdownContent\">\n");
      out.write("                        <form  enctype=\"multipart/form-data\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                            <label >Ονομασία Ξενοδοχείου </label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelName\" placeholder=\"Ονομασία..\" required>\n");
      out.write("                            <label > Διεύθυνση Ξενοδοχείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelAddress\" placeholder=\"Διεύθυνση..\" required>\n");
      out.write("                            <label > Kατηγορία Ξενοδοχείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelCategory\" placeholder=\"Kατηγορία..\" required>\n");
      out.write("                            <label >Τηλέφωνο Ξενοδοχείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelTelephone\" placeholder=\"Τηλέφωνο..\" required>\n");
      out.write("                            <label >Αριθμός Ξενοδοχείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelNumber\" placeholder=\"Αριθμός ..\" required>\n");
      out.write("                            <label >Κατηγορία Δωματίων Ξενοδοχείου </label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelRoomCategory\" placeholder=\"ατηγορία Δωματίων ..\" required>\n");
      out.write("                            <label >Τιμή Δωματίου </label>\n");
      out.write("                            <input type=\"text\"  name=\"hotelRoomPrice\" placeholder=\"Τιμή Δωματίου ..\" required>\n");
      out.write("                            <label >Περιοχή Ξενοδοχείου </label>\n");
      out.write("                            <input type=\"text\"  name=\"area\" placeholder=\"Περιοχή Δωματίου ..\" required>\n");
      out.write("                            <label >Μονόκλινα Δωμάτια </label>\n");
      out.write("                            <input type=\"text\"  name=\"monoklina\" placeholder=\"Περιοχή Δωματίου ..\" required>\n");
      out.write("                            <label >Δικλινα Δωμάτια </label>\n");
      out.write("                            <input type=\"text\"  name=\"diklina\" placeholder=\"Περιοχή Δωματίου ..\" required>\n");
      out.write("                            <label >Περιγραφή Ξενοδοχείου</label>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                               \n");
      out.write("                                <textarea class=\"form-control\" name=\"comment\" rows=\"10\"  style=\"min-width:100%\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <input type=\"file\" name=\"image\" id=\"imgSave\" value=load\" required/><br>\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"update\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <input type=\"submit\" value=\"Αποθήκευση\">\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"office_fields\" class=\"dropdownContent\">\n");
      out.write("                        <button class=\"tablink\" id=\"office_insert\">Εισαγωγή καινούργιου γραφείου</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <button class=\"tablink\" id=\"office_modification\" >Εισαγωγή οχημάτων σε υπάρχων γραφείο</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form  id =\"office_forms\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                            <label >Ονομασία Γραφείου </label>\n");
      out.write("                            <input type=\"text\"  name=\"office_name\" placeholder=\"ονομασία..\" required>\n");
      out.write("                            <label > Διεύθυνση Γραφείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"office_address\" placeholder=\"Διεύθυνση..\" required>\n");
      out.write("                            <label > Τηλέφωνο Γραφείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"office_telephone\" placeholder=\"Τηλέφωνο..\" required>    \n");
      out.write("                            <label > Περιοχή Γραφείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"area\" placeholder=\"Περιοχή..\" required>    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"office_update\">\n");
      out.write("                            <button class=\"accordion\">Οχηματα Γραφείου + </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"extra_fields\">\n");
      out.write("                                <button type=\"button\" id=\"add_more_fields\" class=\"accordion1\">Φόρμα Αυτοκινήτου</button>\n");
      out.write("                                <button type=\"button\" id=\"add_more_fields_moto\" class=\"accordion1\">Φόρμα Μιχανακίου</button>\n");
      out.write("                                <div class=\"car_info\">\n");
      out.write("                                    <h3>Πληροφορίες Αυτοκινήτου</h3>\n");
      out.write("                                    <label >Αριθμό Κυκλοφορίας</label>\n");
      out.write("                                    <input type=\"text\"  name=\"licence_car_number\" placeholder=\"Αριθμό Κυκλοφορίας..\" required>\n");
      out.write("\n");
      out.write("                                    <label >Κυβικά</label>\n");
      out.write("                                    <input type=\"text\"  name=\"kv\" placeholder=\"Κυβικά..\" required>\n");
      out.write("\n");
      out.write("                                    <label >Θέσεις Επιβατών</label>\n");
      out.write("                                    <input type=\"text\"  name=\"passenger_sits\" placeholder=\"Θέσεις Επιβατών..\" required>\n");
      out.write("                                    <label >Κατηγοριες</label><br>\n");
      out.write("                                    <select id=\"mainselection\" name =\"selection\" > \n");
      out.write("                                        <option  value=\"1\">1 Κατηγορία</option>\n");
      out.write("                                        <option  value=\"2\">2 Κατηγορία</option>\n");
      out.write("                                        <option  value=\"3\">3 Κατηγορία</option>\n");
      out.write("                                        <option  value=\"4\">4 Κατηγορία</option>\n");
      out.write("                                        <option  value=\"5\">5 Κατηγορία</option>\n");
      out.write("                                    </select><br><br>\n");
      out.write("                                    <label >Χρέωση ανα μέρα</label>\n");
      out.write("                                    <input type=\"text\"  name=\"charge_per_day\" placeholder=\"Χρέωση ανα μέρα..\" required>\n");
      out.write("                                    <label >Αύξηση Χρέωσης  ανα μέρα</label>\n");
      out.write("                                    <input type=\"text\"  name=\"price_car_plus\" placeholder=\"Αύξηση Χρέωσης ανα μέρα..\" required>\n");
      out.write("\n");
      out.write("                                </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"moto_info\">\n");
      out.write("                                    <h3>Πληροφορίες Μηχανακίου</h3>\n");
      out.write("                                    <label >Αριθμό Κυκλοφορίας</label>\n");
      out.write("                                    <input type=\"text\"  name=\"lice_moto\" placeholder=\"Αριθμό Κυκλοφορίας..\" required>\n");
      out.write("                                    <label >Κυβικά</label>\n");
      out.write("                                    <input type=\"text\"  name=\"moto_kv\" placeholder=\"Κυβικά..\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <label >Κατηγοριες</label><br>\n");
      out.write("                                    <select id=\"mainselection\" name=\"moto_selection\">\n");
      out.write("                                        <option value=\"1\">1 Κατηγορία</option>\n");
      out.write("                                        <option value=\"2\">2 Κατηγορία</option>\n");
      out.write("                                        <option value=\"3\">3 Κατηγορία</option>\n");
      out.write("                                        <option value=\"4\">4 Κατηγορία</option>\n");
      out.write("                                        <option value=\"5\">5 Κατηγορία</option>\n");
      out.write("                                    </select><br><br>\n");
      out.write("\n");
      out.write("                                    <label >Χρέωση ανα μέρα</label>\n");
      out.write("                                    <input type=\"text\"  name=\"moto_charge\" placeholder=\"Χρέωση ανα μέρα..\" required>\n");
      out.write("                                    <label >Αύξηση Χρέωσης  ανα μέρα</label>\n");
      out.write("                                    <input type=\"text\"  name=\"moto_price_Car_plus\" placeholder=\"Αύξηση Χρέωση ανα μέρα..\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"submit\" value=\"Αποθήκευση\">\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"existing_office\">\n");
      out.write("                            <h4>Επέλεξε Γραφείο</h4>\n");
      out.write("                            <form  method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                                <select id=\"mainselection\" name=\"existing_office\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select><br><br>\n");
      out.write("\n");
      out.write("                                <button type=\"button\" id=\"add_more_fields3\" class=\"accordion1\">Φόρμα Αυτοκινήτου</button>\n");
      out.write("                                <button type=\"button\" id=\"add_more_fields_moto3\" class=\"accordion1\">Φόρμα Μιχανακίου</button>\n");
      out.write("\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"existed_office_update\">\n");
      out.write("\n");
      out.write("                                <div class=\"exist_office_forward\">\n");
      out.write("                                    <input type=\"submit\" value=\"Αποθήκευση\"> \n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"mesuem_fields\" class=\"dropdownContent\">\n");
      out.write("                        <form  enctype=\"multipart/form-data\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                            <label >Ονομασία Μουσείου </label>\n");
      out.write("                            <input type=\"text\"  name=\"mesuemName\" placeholder=\"Ονομασία..\" required >\n");
      out.write("                            <label > Διεύθυνση Μουσείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"mesuemAddress\" placeholder=\"Διεύθυνση..\" required>\n");
      out.write("                            <label >Τηλέφωνο Μουσείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"mesuemTelephone\" placeholder=\"Τηλέφωνο..\" required>\n");
      out.write("                            <label >Τοποθεσία Μουσείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"mesuemLocation\" placeholder=\"Τοποθεσία..\" required>\n");
      out.write("                            <label >Τιμή Μουσείου</label>\n");
      out.write("                            <input type=\"text\"  name=\"mesuemPrice\" placeholder=\"Τιμή ..\" required>\n");
      out.write("\n");
      out.write("                            <input type=\"file\" name=\"image\" id=\"imgSave\" value=load\"/><br>\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"update_mesuem\">\n");
      out.write("                            <input type=\"submit\" value=\"Αποθήκευση\">\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"landmarks_fields\" class=\"dropdownContent\">\n");
      out.write("                        <form  enctype=\"multipart/form-data\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                            <label >Ονομασία Αξιοθέατου </label>\n");
      out.write("                            <input type=\"text\"  name=\"landMarkName\" placeholder=\"Ονομασία..\" required>\n");
      out.write("                            <label > Τοποθεσία Αξιοθέατου</label>\n");
      out.write("                            <input type=\"text\"  name=\"landMarkLocation\" placeholder=\"Τοποθεσία..\" required>\n");
      out.write("                            <label >Τηλέφωνο Αξιοθέατου</label>\n");
      out.write("                            <input type=\"text\"  name=\"landMarkTelephone\" placeholder=\"Τηλέφωνο..\" required>\n");
      out.write("                            <label >Τιμή Αξιοθέατου</label>\n");
      out.write("                            <input type=\"text\"  name=\"landMarkPrice\" placeholder=\"Τιμή ..\" required>\n");
      out.write("\n");
      out.write("                            <input type=\"file\" name=\"image\" id=\"imgSave\" value=load\"/><br>\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"update_landmark\">\n");
      out.write("                            <input type=\"submit\" value=\"Αποθήκευση\">\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"routes_fields\" class=\"dropdownContent\">\n");
      out.write("                        <button class=\"tablink\" id=\"defaultOpen2\">Αεροπλάνα</button>\n");
      out.write("                        <button class=\"tablink\" id=\"ships\" >Πλοία</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div id=\"aeroplane\" class=\"tabcon\">\n");
      out.write("\n");
      out.write("                            <form  enctype=\"multipart/form-data\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                                <label >Ονομασία Εταιρίας </label>\n");
      out.write("                                <input type=\"text\"  name=\"companyName\" placeholder=\"Ονομασία Αεροδρομίου..\" required>\n");
      out.write("                                <label >Ονομασία Αεροδρομίου </label>\n");
      out.write("                                <input type=\"text\"  name=\"airportName\" placeholder=\"Ονομασία Αεροδρομίου..\" required>\n");
      out.write("                                <label >Ώρα Αναχώρησης</label>\n");
      out.write("                                <input type=\"text\"  name=\"departureTime\" placeholder=\"Ώρα..\" required>\n");
      out.write("                                <label >Ημερομηνια Αναχώρησης</label>\n");
      out.write("                                <input type=\"text\"  name=\"departureDay\" placeholder=\"Ώρα..\" required>\n");
      out.write("                                <label >Ονομασία Προορισμού Αεροδρομίου</label>\n");
      out.write("                                <input type=\"text\"  name=\"airportDestinationName\" placeholder=\"Ονομασία Αεροδρομίου..\" required>\n");
      out.write("                                <label >Ημερομηνια Άφιξης</label>\n");
      out.write("                                <input type=\"text\"  name=\"arrivalDay\" placeholder=\"Ώρα..\" required>\n");
      out.write("                                <label >Ώρα Άφιξης </label>\n");
      out.write("                                <input type=\"text\"  name=\"arrivalTime\" placeholder=\"Ώρα..\" required>\n");
      out.write("\n");
      out.write("                                <label >Από</label>\n");
      out.write("                                <input type=\"text\"  name=\"from\" placeholder=\"Μερος (πχ Αθηνα)..\" required>\n");
      out.write("                                <label >Πρός</label>\n");
      out.write("                                <input type=\"text\"  name=\"to\" placeholder=\"Μερος (πχ Θεσσαλονικη)..\" required>\n");
      out.write("                                <label >Τιμή</label>\n");
      out.write("                                <input type=\"text\"  name=\"price\" placeholder=\"Τιμή ..\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"update_aeroplane\">\n");
      out.write("                                <input type=\"submit\" value=\"Αποθήκευση\">\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"shi\" class=\"tabcon\">\n");
      out.write("\n");
      out.write("                            <form  enctype=\"multipart/form-data\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                                <label >Ονομασία Εταιρίας </label>\n");
      out.write("                                <input type=\"text\"  name=\"companyName\" placeholder=\"Ονομασία Αεροδρομίου..\" required>\n");
      out.write("                                <label >Αναχώρηση Πλοίου Από</label>\n");
      out.write("                                <input type=\"text\"  name=\"departureShipFromPort\" placeholder=\"Ονομασία Λιμανίου..\" required>\n");
      out.write("                                <label >Ώρα Αναχώρησης</label>\n");
      out.write("                                <input type=\"text\"  name=\"departureTime\" placeholder=\"Ώρα..\" required>\n");
      out.write("                                <label >Μέρα Αναχώρησης</label>\n");
      out.write("                                <input type=\"text\"  name=\"departureDay\" placeholder=\"Ώρα..\" required>\n");
      out.write("                                <label >Προορισμός Πλοίου</label>\n");
      out.write("                                <input type=\"text\"  name=\"shipDestination\" placeholder=\"Ονομασία Λιμανίου..\" required>\n");
      out.write("                                <label >Ώρα Άφηξης </label>\n");
      out.write("                                <input type=\"text\"  name=\"arrivalTime\" placeholder=\"Ώρα..\" required>\n");
      out.write("                                <label >Μέρα Άφηξης</label>\n");
      out.write("                                <input type=\"text\"  name=\"arrivalDay\" placeholder=\"Ώρα..\" required>\n");
      out.write("                                <label >Από</label>\n");
      out.write("                                <input type=\"text\"  name=\"fromLocation\" placeholder=\"Μερος (πχ Αθηνα)..\" required>\n");
      out.write("                                <label >Πρός</label>\n");
      out.write("                                <input type=\"text\"  name=\"toLocation\" placeholder=\"Μερος (πχ Θεσσαλονικη)..\" required>\n");
      out.write("                                <label >Τιμή</label>\n");
      out.write("                                <input type=\"text\"  name=\"price\" placeholder=\"Τιμή ..\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"update_ships\">\n");
      out.write("                                <input type=\"submit\" value=\"Αποθήκευση\">\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"tour_office_fields\" class=\"dropdownContent\">\n");
      out.write("\n");
      out.write("                        <button class=\"tablink\" id=\"tour_office_insert\">Εισαγωγή καινούργιου γραφείου</button>\n");
      out.write("                        <button class=\"tablink\" id=\"tour_office_modification\" >Εισαγωγή εκδρομών σε υπάρχων γραφείο</button>\n");
      out.write("\n");
      out.write("                        <form  enctype=\"multipart/form-data\" id=\"extra_fields_tour_off\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("\n");
      out.write("                            <label>Ονομασία</label>\n");
      out.write("                            <input type=\"text\"  name=\"officeName\" placeholder=\"Ονομασία..\" required>\n");
      out.write("                            <label>Διεύθηνση</label>\n");
      out.write("                            <input type=\"text\"  name=\"officeAddress\" placeholder=\"Διεύθηνση..\" required>\n");
      out.write("                            <label>Τηλέφωνο</label>\n");
      out.write("                            <input type=\"text\"  name=\"officeTelephone\" placeholder=\"Τηλέφωνο..\" required>\n");
      out.write("\n");
      out.write("                            <label>Περιοχή</label>\n");
      out.write("                            <input type=\"text\"  name=\"area\" placeholder=\"Τηλέφωνο..\" required>\n");
      out.write("\n");
      out.write("                            <button id=\"accord1\" class=\"accordion\">Ταξιδιωτικές Εκδρομές +</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div id=\"extra_fi\" class=\"extra_fields\">\n");
      out.write("                                <button type=\"button\" id=\"add_more_tour_fields\" class=\"accordion1\">Επιπλέον Φόρμες</button>\n");
      out.write("                                <div id=\"tours\">    \n");
      out.write("                                    <label >Αφετηρία </label>\n");
      out.write("                                    <input type=\"text\"  name=\"tour_beginning\" placeholder=\"Αφετηρία..\" required>\n");
      out.write("                                    <label >Προορισμός </label>\n");
      out.write("                                    <input type=\"text\"  name=\"tour_destination\" placeholder=\"Προορισμός..\" required>\n");
      out.write("                                    <label >Ώρα Αναχώρησης </label>\n");
      out.write("                                    <input type=\"text\"  name=\"time_destination\" placeholder=\"Ώρα Αναχώρησης..\" required>\n");
      out.write("                                    <label >Ώρα Άφιξης </label>\n");
      out.write("                                    <input type=\"text\"  name=\"time_arrival\" placeholder=\"Ώρα Αφετηρίας..\" required>\n");
      out.write("                                    <label >Τιμή </label>\n");
      out.write("                                    <input type=\"text\"  name=\"price\" placeholder=\"Τιμή..\" required>\n");
      out.write("\n");
      out.write("                                    <h3>Πακέτα Προσφορών</h3>\n");
      out.write("                                    <label>Άνω των</label>\n");
      out.write("                                    <select id=\"mainselection2\" name=\"nubmer_of_people\">\n");
      out.write("                                        <option value=\"2\">2 Ατόμων</option>\n");
      out.write("                                        <option value=\"3\">3 Ατόμων</option>\n");
      out.write("                                        <option value=\"4\">4 Ατόμων</option>\n");
      out.write("                                        <option value=\"5\">5 Ατόμων</option>\n");
      out.write("                                        <option value=\"6\">6 Ατόμων</option>\n");
      out.write("                                    </select><br><br>\n");
      out.write("                                    <label >Μείωση τιμής κατά</label>\n");
      out.write("                                    <input type=\"text\"  name=\"price_cut\" placeholder=\"%\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <input type=\"submit\" value=\"Αποθήκευση\">\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"tour_office_update\">\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div id=\"tour_office_modi\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <h4>Επέλεξε Γραφείο</h4>\n");
      out.write("                            <form  enctype=\"multipart/form-data\" id=\"extra_fields_tour_offff\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                                <select id=\"mainselection\" name=\"tour_office_selection\">\n");
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <button type=\"button\" id=\"add_more_tour_fields_butt\" class=\"accordion1\">Φόρμα</button>\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"existed_tour_office_update\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"tour_office_forwardddd\">\n");
      out.write("                                    <input type=\"submit\" value=\"Αποθήκευση\"> \n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"partnerss\" class=\"dropdownContent\">\n");
      out.write("                        <button class=\"partner_tab\" id=\"hotel_partner\">Ξενοδοχεία</button>\n");
      out.write("                        <button class=\"partner_tab\" id=\"transport_P\" >Εταιρίες Μεταφοράς </button>\n");
      out.write("                        <button class=\"partner_tab\" id=\"\" >Γραφεία Ενοικιάσεων </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div id=\"partner_H\" class=\"partner_tabcon\">\n");
      out.write("\n");
      out.write("                            <form  enctype=\"multipart/form-data\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("\n");
      out.write("                                <label >Ονομασία Ξενοδοχείου </label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Ονομασία..\" required>\n");
      out.write("                                <label >Διεύθυνση Ξενοδοχείου </label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Διεύθυνση..\" required>\n");
      out.write("                                <label > Kατηγορία Ξενοδοχείου</label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Kατηγορία..\" required>\n");
      out.write("                                <label >Τηλέφωνο Ξενοδοχείου </label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Τηλέφωνο..\" required>\n");
      out.write("                                <label >Αριθμός Ξενοδοχείου</label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Αριθμός..\" required>\n");
      out.write("                                <label >Κατηγορία Δωματίων Ξενοδοχείου</label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Κατηγορία Δωματίων..\" required>\n");
      out.write("                                <label >Τιμή Δωματίου </label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Τιμή ..\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"update\">\n");
      out.write("                                <input type=\"submit\" value=\"Αποθήκευση\">\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"transport_partner\" class=\"partner_tabcon\">\n");
      out.write("                            <form  enctype=\"multipart/form-data\" method=\"POST\" action=\"DatabaseUpdate\">\n");
      out.write("                                <label >Ιδιότητα</label><br>\n");
      out.write("                                <select id=\"mainselection\">\n");
      out.write("                                    <option value=\"Αεροπορικία Εταιρία\">Αεροπορικία Εταιρία </option>\n");
      out.write("                                    <option value=\"Ακτοπλοϊκία  Εταιρία\">Ακτοπλοϊκία  Εταιρία</option>\n");
      out.write("\n");
      out.write("                                </select><br><br>\n");
      out.write("\n");
      out.write("                                <label >Ονομασία Εταιρίας </label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"ονομασία..\" required>\n");
      out.write("                                <label >Διεύθυνση Εταιρίας </label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Διεύθυνση..\" required>\n");
      out.write("                                <label >Τηλέφωνο Εταιρίας </label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Τηλέφωνω..\" required>\n");
      out.write("                                <label >Αφετηρία </label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Αφετηρία..\" required>\n");
      out.write("                                <label >Προορισμός </label>\n");
      out.write("                                <input type=\"text\"  name=\"\" placeholder=\"Προορισμός..\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"update\">\n");
      out.write("                                <input type=\"submit\" value=\"Αποθήκευση\">\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>   \n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\" src=\"view/MyScripts/databaseUpdateScript.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${officeInfo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("officeNames");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${officeNames.officeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${officeNames.officeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\n");
          out.write("                                    ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tourOfficeInfo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("tourOfficeName");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tourOfficeName.officeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tourOfficeName.officeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
