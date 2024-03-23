package com.lab.med.medServlet;



import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lab.med.medDao.DoctorDAO;
import com.lab.med.medEntity.Doctor;

@WebServlet("/addDoctor")
public class DoctorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Doctor doctor = new Doctor();
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setEmail(email);
        doctor.setPhone(phone);

        DoctorDAO doctorDAO = new DoctorDAO();
        try {
            doctorDAO.addDoctor(doctor);
            response.sendRedirect("adminDashboard.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error adding doctor.");
            request.getRequestDispatcher("addDoctor.jsp").forward(request, response);
        }
    }
}