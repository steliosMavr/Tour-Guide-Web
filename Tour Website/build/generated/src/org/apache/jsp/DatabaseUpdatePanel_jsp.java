package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DatabaseUpdatePanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"MyCss/DatabaseUpdatePanel.css\"/> \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.html", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "SideBar.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <div id=\"databaseUpdate\" class=\"tabcontent\">\n");
      out.write("                <div class=\"box-top\"><h1>Database Input Form</h1></div> \n");
      out.write("                <div class=\"box-panel\">\n");
      out.write("                    <a  href=\"#\"  class=\"links\" onclick=\"myFunction(event, 'hoteDropdown')\" id=\"defaultOpen2\">Hotel Update</a>\n");
      out.write("                    <a  href=\"#\"  class=\"links\"onclick=\"myFunction(event, 'officeDropdown')\">Update 2</a>\n");
      out.write("                    <a  href=\"#\"  class=\"links\" onclick=\"myFunction()\">Update 3</a>\n");
      out.write("\n");
      out.write("                    <div id=\"hoteDropdown\" class=\"dropdownContent\">\n");
      out.write("                        <form method=\"POST\" action=\"DatabaseUpdate\">\n");
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
      out.write("\n");
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
      out.write("            document.getElementById(\"defaultOpen2\").click();\n");
      out.write("            function myFunction(evt, id) {\n");
      out.write("                var i, x, tabcontent, tablinks;\n");
      out.write("                tabcontent = document.getElementsByClassName(\"dropdownContent\");\n");
      out.write("                for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("                    tabcontent[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                tablinks = document.getElementsByClassName(\"links\");\n");
      out.write("                document.getElementById(id).style.display = \"block\";\n");
      out.write("\n");
      out.write("                for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("                    tablinks[i].className = tablinks[i].className.replace(\" w3-red\", \"\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                evt.currentTarget.className += \" w3-red\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function changeContent(tabName) {\n");
      out.write("                var i, tabcontent, tablinks;\n");
      out.write("                tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("                for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("                    tabcontent[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                document.getElementById(tabName).style.display = \"block\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("             $('.box-panel').find('a').click(function(){\n");
      out.write("                 $(this).css('background-color',\"red\");\n");
      out.write("             });\n");
      out.write("             \n");
      out.write("              $('.box-panel').find('a').blur(function(){\n");
      out.write("                 $(this).css('background-color',\"white\");\n");
      out.write("             });\n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
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
}
