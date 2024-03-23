package com.lab.med.medServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lab.med.medDao.BillingDAO;
import com.lab.med.medEntity.Billing;

@WebServlet("/addBilling")
public class BillingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int appointmentId = Integer.parseInt(request.getParameter("appointmentId"));
        double amount = Double.parseDouble(request.getParameter("amount"));
        String paymentStatus = request.getParameter("paymentStatus");

        Billing billing = new Billing();
        billing.setAppointmentId(appointmentId);
        billing.setBillingAmount(amount);
        billing.setPaymentStatus(paymentStatus);

        BillingDAO billingDAO = new BillingDAO();
        try {
            billingDAO.addBilling(billing);
            response.sendRedirect("adminDashboard.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error adding billing.");
            request.getRequestDispatcher("addBilling.jsp").forward(request, response);
        }
    }
}