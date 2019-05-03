/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.database.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author stelios
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        System.out.println(request.getParameter("action"));

        if (request.getParameter("action").equals("logout")) {
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("LoginForm.jsp");

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("userName");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();

        if (username.equals("Admin") && password.equals("Admin")) {
            
            session.setAttribute("user", "true");       
            response.sendRedirect("AdminPage.jsp");

        } else {
            session.setAttribute("user", "false");
            response.sendRedirect("LoginForm.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
