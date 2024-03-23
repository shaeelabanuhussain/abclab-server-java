<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Patient Dash board</title>
</head>
<body>
	<h1>Welcome, ${patient.firstName} ${patient.lastName}!</h1>
	<p>Your ID: ${patient.patientId}</p>
	<p>Your Email: ${patient.email}</p>
	<p>Your Phone: ${patient.phone}</p>
	<p>Your Address: ${patient.address}</p>
	<br>
	<a href="appointment">Appointments</a> |
	<a href="tests">Tests</a> |
	<a href="billing">Billing</a> |
	<a href="reports">Reports</a> |
	<a href="logout">Logout</a>
</body>
</html>