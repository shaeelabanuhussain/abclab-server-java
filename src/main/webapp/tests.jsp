<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Tests</title>
</head>
<body>
	<h1>Tests</h1>
	<table border="1">
		<tr>
			<th>Test ID</th>
			<th>Test Name</th>
			<th>Test Description</th>
		</tr>
		<c:forEach var="test" items="${tests}">
		<tr>
			<td>${test.testId}</td>
			<td>${test.testName}</td>
			<td>${test.testDescription}</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<a href="patientDashboard">Patient Dashboard</a>
</body>
</html>