<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Billing</title>
</head>
<body>
	<h1>Billing</h1>
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
			<th>Bill Amount</th>
			<th>Payment Status</th>
		</tr>
		<c:forEach var="billing" items="${billings}">
		<tr>
			<td>${billing.appointment.appointmentId}</td>
		<td>${billing.appointment.test.testId}</td>
			<td>${billing.appointment.test.testName}</td>
			<td>${billing.appointment.appointmentDate}</td>
			<td>${billing.appointment.appointmentTime}</td>
			<td>${billing.appointment.technician.technicianId}</td>
			<td>${billing.appointment.doctor.doctorId}</td>
			<td>${billing.appointment.status}</td>
			<td>${billing.billAmount}</td>
			<td>${billing.paymentStatus}</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<a href="patientDashboard">Patient Dashboard</a>
</body>
</html>