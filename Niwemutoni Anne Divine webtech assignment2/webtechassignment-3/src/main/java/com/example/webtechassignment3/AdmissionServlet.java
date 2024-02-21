package com.example.webtechassignment3;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@MultipartConfig
public class AdmissionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Part passportPicture = request.getPart("passportPicture");
        Part diplomaCertificate = request.getPart("diplomaCertificate");

        response.sendRedirect("admission.jsp");
    }
}