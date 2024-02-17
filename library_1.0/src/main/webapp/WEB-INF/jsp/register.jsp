<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<form action="register" method="post" onsubmit="return validateForm()">
			<h2>Register</h2>
			<tr>
				<td><label for="username">Username:</label></td>
				<td><input type="text" id="username" name="username" required></td>
			</tr>
			<tr>
				<td><label for="email">Email : </label></td>
				<td><input type="text" id="email" name="email" required></td>
			</tr>
			<tr>
				<td><label for="age">Age : </label></td>
				<td><input type="number" id="age" name="age" required></td>
			</tr>
			<tr>
				<td><label for="password">Password:</label></td>
				<td><input type="password" id="password" name="password"
					required></td>
			</tr>
			<tr>
				<td><label for="confirm-password">Confirm Password:</label></td>
				<td><input type="password" id="confirm-password"
					name="confirm-password" required></td>
			</tr>
			<tr>
				<td>
					<button type="submit">Register</button>
				</td>
			</tr>
		</form>
	</table>
</body>
<script>
	function validateForm() {
		var username = document.getElementById('username').value;
		var email = document.getElementById('email').value;
		var password = document.getElementById('password').value;
		var confirmPassword = document.getElementById('confirm-password').value;

		// Basic validation for username
		if (username.trim() === "") {
			return false;
		}

		// Basic validation for username
		if (email.trim() === "") {
			return false;
		}

		// Basic validation for password
		if (password.trim() === "") {
			return false;
		}

		// Validation for matching passwords
		if (password !== confirmPassword) {
			return false;
		}

		return true; // Submit the form if all validations pass
	}
</script>
</html>