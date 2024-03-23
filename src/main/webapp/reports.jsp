<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Reports</title>
</head>
<body>
	<h1>Reports</h1>
	<table border="1">
		<tr>
			<th>Report ID</th>
			<th>Patient ID</th>
			<th>Appointment ID</th>
			<th>Test ID</th>
			<th>Test Name</th>
			<th>Result Value</th>
			<th>Result Date</th>
			<th>Report URL</th>
		</tr>
		<c:forEach var="report" items="${reports}">
		<tr>
			<td>${report.reportId}</td>
			<td>${report.patient.patientId}</td>
			<td>${report.appointment.appointmentId}</td>
			<td>${report.appointment.test.testId}</td>
			<td>${report.appointment.test.testName}</td>
			<td>${report.resultValue}</td>
			<td>${report.resultDate}</td>
			<td>${report.reportUrl}</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<a href="patientDashboard">Patient Dashboard</a>
</body>
</html>