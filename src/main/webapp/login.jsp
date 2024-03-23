


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="css/animations.css">
    <link rel="stylesheet" href="css/main.css">  
    <title>Login</title>
</head>
<body>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.io.*,java.util.*" %>
    <%@ page import="javax.servlet.*,javax.servlet.http.*" %>
    <%@ page import="javax.servlet.annotation.WebServlet" %>

    <%-- Initialize session --%>
    <% HttpSession realSession = request.getSession(); %>
    <% session.setAttribute("user", ""); %>
    <% session.setAttribute("usertype", ""); %>

    
    

    <%-- Database connection --%>
    <%@ page import="java.sql.Connection" %>
    <%@ page import="java.sql.DriverManager" %>
    <%@ page import="java.sql.PreparedStatement" %>
    <%@ page import="java.sql.ResultSet" %>
    <%@ page import="java.sql.SQLException" %>

    <%-- <% Connection connection = null;
       String url = "jdbc:mysql://localhost:3306/lab";
       String username = "root";
       String password = "mhsb3";

       try {
           Class.forName("com.mysql.jdbc.Driver");
           connection = DriverManager.getConnection(url, username, password);
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       } catch (SQLException e) {
           e.printStackTrace();
       }

       String error = "";
       if (request.getMethod().equals("POST")) {
           String email = request.getParameter("useremail");
           String userpassword = request.getParameter("userpassword");

           try {
               PreparedStatement statement = connection.prepareStatement("SELECT * FROM webuser WHERE email=?");
               statement.setString(1, email);
               ResultSet resultSet = statement.executeQuery();
               if (resultSet.next()) {
                   String usertype = resultSet.getString("usertype");
                   PreparedStatement checker = null;
                   switch (usertype) {
                       case "p":
                           checker = connection.prepareStatement("SELECT * FROM patient WHERE pemail=? AND ppassword=?");
                           break;
                       case "a":
                           checker = connection.prepareStatement("SELECT * FROM admin WHERE aemail=? AND apassword=?");
                           break;
                       case "d":
                           checker = connection.prepareStatement("SELECT * FROM doctor WHERE docemail=? AND docpassword=?");
                           break;
                   }
                   if (checker != null) {
                       checker.setString(1, email);
                       checker.setString(2, userpassword);
                       ResultSet result = checker.executeQuery();
                       if (result.next()) {
                           session.setAttribute("user", email);
                           session.setAttribute("usertype", usertype);
                           switch (usertype) {
                               case "p":
                                   response.sendRedirect("patient/index.jsp");
                                   break;
                               case "a":
                                   response.sendRedirect("admin/index.jsp");
                                   break;
                               case "d":
                                   response.sendRedirect("doctor/index.jsp");
                                   break;
                           }
                       } else {
                           error = "Wrong credentials: Invalid email or password";
                       }
                   }
               } else {
                   error = "We can't find any account for this email.";
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
    %> --%>

    <center>
        <div class="container">
            <table border="0" style="margin: 0;padding: 0;width: 60%;">
                <tr>
                    <td>
                        <p class="header-text">Welcome Back!</p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p class="sub-text">Login with your details to continue</p>
                    </td>
                </tr>
                <tr>
                    <form action="" method="POST">
                        <td class="label-td">
                            <label for="useremail" class="form-label">Email: </label>
                        </td>
                </tr>
                <tr>
                    <td class="label-td">
                        <input type="email" name="useremail" class="input-text" placeholder="Email Address" required>
                    </td>
                </tr>
                <tr>
                    <td class="label-td">
                        <label for="userpassword" class="form-label">Password: </label>
                    </td>
                </tr>
                <tr>
                    <td class="label-td">
                        <input type="Password" name="userpassword" class="input-text" placeholder="Password" required>
                    </td>
                </tr>
               <%--  <tr>
                    <td><br>
                        <label for="promoter" class="form-label" style="color: rgb(255, 62, 62); text-align: center;"><%= error %></label>
                    </td>
                </tr> --%>
                <tr>
                    <td><br>
                        <label for="promoter" class="form-label" style="color: rgb(255, 62, 62); text-align: center;"></label>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Login" class="login-btn btn-primary btn">
                    </td>
                </tr>
                <tr>
                    <td>
                        <br>
                        <label for="" class="sub-text" style="font-weight: 280;">Don't have an account? </label>
                        <a href="signup.jsp" class="hover-link1 non-style-link">Sign Up</a>
                        <br><br><br>
                    </td>
                </tr>
                    </form>
            </table>
        </div>
    </center>
</body>
</html>
