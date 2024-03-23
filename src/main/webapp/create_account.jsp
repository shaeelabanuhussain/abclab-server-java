<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/animations.css">  
    <link rel="stylesheet" href="css/main.css">  
    <link rel="stylesheet" href="css/signup.css">
        
    <title>Create Account</title>
    <style>
        .container{
            animation: transitionIn-X 0.5s;
        }
    </style>
</head>
<body>
<%
    // Unset all the server-side variables
    session.invalidate();
    session = request.getSession(true);

    // Set the new timezone
    java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("Asia/Kolkata"));
    java.util.Date date = new java.util.Date();
    session.setAttribute("date", date);

    // Import database and other necessary declarations here
%>

    <center>
        <div class="container">
            <table border="0" style="width: 69%;">
                <tr>
                    <td colspan="2">
                        <p class="header-text">Let's Get Started</p>
                        <p class="sub-text">It's Okay, Now Create User Account.</p>
                    </td>
                </tr>
                <tr>
                    <td class="label-td" colspan="2">
                        <label for="newemail" class="form-label">Email: </label>
                    </td>
                </tr>
                <tr>
                    <td class="label-td" colspan="2">
                        <input type="email" name="newemail" class="input-text" placeholder="Email Address" required>
                    </td>
                </tr>
                <!-- Add other form elements as needed -->
                <tr>
                    <td colspan="2">
                        <span style="color: red;"><c:out value="${error}" /></span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="reset" value="Reset" class="login-btn btn-primary-soft btn" >
                    </td>
                    <td>
                        <input type="submit" value="Sign Up" class="login-btn btn-primary btn">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <br>
                        <label for="" class="sub-text" style="font-weight: 280;">Already have an account&#63; </label>
                        <a href="login.jsp" class="hover-link1 non-style-link">Login</a>
                        <br><br><br>
                    </td>
                </tr>
            </table>
        </div>
    </center>
</body>
</html>
