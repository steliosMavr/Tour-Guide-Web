/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.database.servlets;

import gr.database.classes.HotelDAOJDBC;

import gr.javabeans.Hotels;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author stelios
 */
public class NewServlet extends HttpServlet {

    private ArrayList<Hotels> hotelList;
    private HotelDAOJDBC databaseObject;
    private Hotels hotel;

    @Override
    public void init() {
        databaseObject = new HotelDAOJDBC();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            // databaseObject.getMetadata();
        hotelList = new ArrayList<Hotels>();
        hotelList = databaseObject.hotelRecords();

        request.setAttribute("hotelList", hotelList);
        request.getRequestDispatcher("hotels.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
