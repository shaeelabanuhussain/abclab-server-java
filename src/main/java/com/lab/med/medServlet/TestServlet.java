package com.lab.med.medServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lab.med.medDao.TestDAO;
import com.lab.med.medEntity.Test;

@WebServlet("/addTest")
public class TestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String testName = request.getParameter("testName");
        String testDescription = request.getParameter("testDescription");

        Test test = new Test();
        test.setTestName(testName);
        test.setTestDescription(testDescription);

        TestDAO testDAO = new TestDAO();
        try {
            testDAO.addTest(test);
            response.sendRedirect("adminDashboard.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error adding test.");
            request.getRequestDispatcher("addTest.jsp").forward(request, response);
        }
    }
}