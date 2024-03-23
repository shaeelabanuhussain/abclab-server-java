<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
      
    <link rel="stylesheet" href="css/animations.css">
    <link rel="stylesheet" href="css/main.css">  
    <link rel="stylesheet" href="css/index.css">
    <title>ABC Lab</title>
    <style>
    
         body {
            background-image: url('images/c2.jpg');
            background-size: cover; /* Adjust the background size as needed */
        }
        table{
            animation: transitionIn-Y-bottom 0.5s;
        }
    </style>
</head>
<body>
    <div class="full-height">
        <center>
            <table border="0">
                <tr>
                    <td width="80%">
                        <font class="edoc-logo">ABClab </font>
                        <font class="edoc-logo-sub">| Lab Test</font>
                    </td>
                    <td width="10%">
                       <a href="login.jsp"  class="non-style-link"><p class="nav-item">LOGIN</p></a>
                    </td>
                    <td  width="10%">
                        <a href="signup.jsp" class="non-style-link"><p class="nav-item" style="padding-right: 10px;">REGISTER</p></a>
                    </td>
                </tr>
                
                <tr>
                    <td  colspan="3">
                        <p class="heading-text">Welcome to ABC Laboratories.</p>
                    </td>
                </tr>
                
                <tr>
                    <td  colspan="3">
                        <p class="sub-text2">Providing excellence in medical testing and care for our patients! Make your appointment now.</p>
                      
                    </td>
                </tr>
                
                <tr>
                    <td colspan="3">
                        <center>
                            <a href="login.jsp" >
                                <input type="button" value="Make Appointment" class="login-btn btn-primary btn" style="padding-left: 25px;padding-right: 25px;padding-top: 10px;padding-bottom: 10px;">
                            </a>
                        </center>
                    </td>
                </tr>
                <tr>
                    <div class="bannerr">
                        <p class="text-center fs-2" style="font-weight: bold; font-size: 2rem;">Our services</p>
                        <div class="banner-section">
                            <h2>Diagnostic Testing</h2>
                            <p>We offer a wide range of diagnostic tests for accurate and reliable results.</p>
                        </div>
                        <div class="banner-section">
                            <h2>Specialized Testing</h2>
                            <p>Specialized tests to cater to the unique needs of our patients.</p>
                        </div>
                        <div class="banner-section">
                            <h2>Rapid Turnaround</h2>
                            <p>Fast and efficient testing services with quick turnaround times.</p>
                        </div>
                    </div>
                </tr>

                <tr>
                    <div class="container">
                        <div class="appointment-banner">
                            <p class="banner-title text-center fs-2">How to Book an Appointment</p>
                            <div class="step-container">
                                <div class="step">
                                    <span class="step-number">1</span>
                                    <h2>Choose Your Test</h2>
                                    <p>Select the specific test you need to book an appointment for.</p>
                                </div>
                                <div class="step">
                                    <span class="step-number">2</span>
                                    <h2>Select Date & Time</h2>
                                    <p>Pick a convenient date and time for your medical test.</p>
                                </div>
                                <div class="step">
                                    <span class="step-number">3</span>
                                    <h2>Confirmation</h2>
                                    <p>Receive a confirmation and prepare for your appointment.</p>
                                </div>
                          </div>
                       </div>
                    </div>
                 </tr>
                <tr>
                    <td colspan="3">
                       
                    </td>
                </tr>
            </table>
            <p class="sub-text2 footer-hashen">All rights reserved</p>
        </center>
    </div>
</body>
</html>
