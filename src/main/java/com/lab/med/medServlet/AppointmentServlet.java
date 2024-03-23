package com.lab.med.medServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.lab.med.medEntity.Appointment;
import com.lab.med.medDao.AppointmentDAO;
import com.lab.med.medEntity.Patient;

@WebServlet("/createAppointment")
public class AppointmentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int patientId = ((Patient) request.getSession().getAttribute("patient")).getPatientId();
        String testName = request.getParameter("testName");
        String appointmentDate = request.getParameter("appointmentDate");
//        java.sql.Date appointmentDate = request.getParameter("appointmentDate");
        String appointmentTime = request.getParameter("appointmentTime");

        Appointment appointment = new Appointment();
        appointment.setPatientId(patientId);
        appointment.setTestName(testName);
        appointment.setAppointmentDate(appointmentDate);
        appointment.setAppointmentTime(appointmentTime);

        AppointmentDAO appointmentDAO = new AppointmentDAO();
        try {
            appointmentDAO.addAppointment(appointment);
            response.sendRedirect("patientDashboard.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error creating appointment.");
            request.getRequestDispatcher("createAppointment.jsp").forward(request, response);
        }
    }
}