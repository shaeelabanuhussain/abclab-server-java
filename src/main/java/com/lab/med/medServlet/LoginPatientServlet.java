package com.lab.med.medServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lab.med.medDao.PatientDAO;
import com.lab.med.medEntity.Patient;
import com.lab.med.medUtility.HashUtility;

@WebServlet("/loginPatient")
public class LoginPatientServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String hashedPassword = HashUtility.hashPassword(password);

        PatientDAO patientDAO = new PatientDAO();
        Patient patient = null;
        try {
            patient = patientDAO.getPatientByEmail(email);
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error logging in.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

        if (patient != null && patient.getHashedPassword().equals(hashedPassword)) {
            HttpSession session = request.getSession();
            session.setAttribute("patient", patient);
            response.sendRedirect("patientDashboard.jsp");
        } else {
            request.setAttribute("errorMessage", "Invalid email or password.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}