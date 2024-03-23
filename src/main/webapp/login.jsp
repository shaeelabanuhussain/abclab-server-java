<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form action="login" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" pattern="[^@\s]+@[^@\s]+\.[^@\s]+" required></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>