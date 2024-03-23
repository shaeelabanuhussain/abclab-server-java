package com.lab.med.medServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lab.med.medDao.TechnicianDAO;
import com.lab.med.medEntity.Technician;

@WebServlet("/addTechnician")
public class TechnicianServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Technician technician = new Technician();
        technician.setFirstName(firstName);
        technician.setLastName(lastName);
        technician.setEmail(email);
        technician.setPhone(phone);

        TechnicianDAO technicianDAO = new TechnicianDAO();
        try {
            technicianDAO.addTechnician(technician);
            response.sendRedirect("adminDashboard.jsp");
        } catch(SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error adding technician.");
            request.getRequestDispatcher("addTechnician.jsp").forward(request, response);
        }
    }
}