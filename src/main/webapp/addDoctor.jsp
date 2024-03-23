<%@ page import="com.lab.med.medDao.DoctorDAO" %>
<%@ page import="com.lab.med.medEntity.Doctor" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Doctor</title>
</head>
<body>
    <h1>Add Doctor</h1>
    <%@ page isErrorPage="true" %>
    <%@ page import="java.sql.SQLException" %>
    <%@ page import="java.io.IOException" %>
    
    <% 
    String errorMessage = (String) request.getAttribute("errorMessage");
    if (errorMessage != null) {
    %>
        <p style="color: red;"><%= errorMessage %></p>
    <%
    }
    %>

    <form action="addDoctor" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone" required><br><br>

        <input type="submit" value="Add Doctor">
    </form>
</body>
</html>
