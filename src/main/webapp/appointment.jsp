<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Appointments</title>
</head>
<body>
	<h1>Appointments</h1>
	<table border="1">
		<tr>
			<th>Appointment ID</th>
			<th>Test ID</th>
			<th>Test Name</th>
			<th>Appointment Date</th>
			<th>Appointment Time</th>
			<th>Technician ID</th>
			<th>Doctor ID</th>
			<th>Status</th>
		</tr>
		<c:forEach var="appointment" items="${appointments}">
		<tr>
			<td>${appointment.appointmentId}</td>
			<td>${appointment.test.testId}</td>
			<td>${appointment.test.testName}</td>
			<td>${appointment.appointmentDate}</td>
			<td>${appointment.appointmentTime}</td>
			<td>${appointment.technician.technicianId}</td>
			<td>${appointment.doctor.doctorId}</td>
			<td>${appointment.status}</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<a href="addAppointment">Add Appointment</a> |
	<a href="patientDashboard">Patient Dashboard</a>
</body>
</html>