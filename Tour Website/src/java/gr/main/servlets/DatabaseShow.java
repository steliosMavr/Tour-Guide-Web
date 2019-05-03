package gr.show.database;

import gr.dao.pattern.DAOFactory;
import gr.dao.pattern.HotelDAO;
import gr.javabeans.Hotels;
import gr.javabeans.Person;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseShow extends HttpServlet {

    private ArrayList<Hotels> hotelList;

    private HotelDAOJDBC javabase;
    private Hotels hotel;

    @Override
    public void init() {
      javabase=new HotelDAOJDBC();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

       hotelList = new ArrayList<Hotels>();
        hotelList = javabase.hotelRecords();

        request.setAttribute("hotelList", hotelList);
        request.getRequestDispatcher("DatabaseShowPanel.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String a = request.getParameter("value");
        out.println("");
        System.out.println("dassd"+a);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
