package com.lab.med.medServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lab.med.medDao.ReportDAO;
import com.lab.med.medEntity.Report;

@WebServlet("/addReport")
public class ReportServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int appointmentId = Integer.parseInt(request.getParameter("appointmentId"));
        String reportUrl = request.getParameter("reportUrl");

        Report report = new Report();
        report.setAppointmentId(appointmentId);
        report.setReportUrl(reportUrl);

        ReportDAO reportDAO = new ReportDAO();
        try {
            reportDAO.addReport(report);
            response.sendRedirect("adminDashboard.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error adding report.");
            request.getRequestDispatcher("addReport.jsp").forward(request, response);
        }
    }
}