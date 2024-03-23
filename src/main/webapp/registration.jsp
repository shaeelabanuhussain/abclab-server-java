<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Registration</title>
</head>
<body>
	<h1>Register</h1>
	<form action="register" method="post">
		<table>
			<tr>
				<td>First Name:</td>
	<td><input type="text" name="firstName" required></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" required></td>
			</tr>
			<tr>
				<td>Email:</td>
				 <td><input type="email" name="email" pattern="[^@\s]+@[^@\s]+\.[^@\s]+" required></td>
			</tr>
			<tr>
				<td>Phone:</td>
				 <td><input type="tel" name="phone" pattern="[0][0-9]{9}" required></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><textarea name="address" required></textarea></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="confirmPassword" required></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>