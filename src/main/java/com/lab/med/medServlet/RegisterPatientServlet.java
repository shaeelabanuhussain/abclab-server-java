package com.lab.med.medServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.lab.med.medDao.PatientDAO;
import com.lab.med.medEntity.Patient;
import com.lab.med.medUtility.HashUtility;

@WebServlet("/registerPatient")
public class RegisterPatientServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String password = request.getParameter("password");
        String hashedPassword = HashUtility.hashPassword(password);

        Patient patient = new Patient();
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setEmail(email);
        patient.setPhone(phone);
        patient.setAddress(address);
        patient.setHashedPassword(hashedPassword);

        PatientDAO patientDAO = new PatientDAO();
        try {
            patientDAO.addPatient(patient);
            response.sendRedirect("loginPatient.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error registering patient.");
            request.getRequestDispatcher("registration.jsp").forward(request, response);
        }
    }
}