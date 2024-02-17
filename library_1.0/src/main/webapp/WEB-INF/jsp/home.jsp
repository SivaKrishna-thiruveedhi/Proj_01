<%@page import="org.springframework.ui.ModelMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	

<% 
	ModelMap model = null;
	if(request.getAttribute("model") != null){
		model = (ModelMap) request.getAttribute("model");
	}else{
		model = new ModelMap();
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Title</title>
</head>
<body>
	<% if(model.get("wrongCredentials") != null ){ %>
	<h1>${wrongCredentials}<br>If you are new <a href="Register" style="color: red;">Please Register..!!</a></h1>
	<% } else{ %>
		<h1>If you are new <a href="Register" style="color: red;">Please Register..!!</a></h1>
	<%} %>
	<table>
		<form action="login" method="post" onsubmit="return validateForm()">
			<h2>Login</h2>

			<tr>
				<td><label for="username">Username : </label></td>
				<td><input type="text" id="username" name="username" required></td>
			</tr>
			<tr>
				<td><label for="email">Email : </label></td>
				<td><input type="text" id="email" name="email" required></td>
			</tr>
			<tr>
				<td><label for="password">Password : </label></td>
				<td><input type="password" id="password" name="password"
					required></td>
			</tr>
			<tr>
				<td>
					<button type="submit">Login</button>
				</td>
			</tr>

		</form>
	</table>
	<mark></mark>
</body>
<script>
	function validateForm() {
		var username = document.getElementById('username').value;
		var password = document.getElementById('password').value;
		var email = document.getElementById('email').value;
		var emailError = document.getElementById('email');
		var usernameError = document.getElementById('usernameError');
		var passwordError = document.getElementById('passwordError');
		var isValid = true;

		// Validate username
		if (username.trim() === '') {
			usernameError.textContent = 'Username is required';
			isValid = false;
		} else {
			usernameError.textContent = '';
		}

		// Validate password
		if (password.trim() === '') {
			passwordError.textContent = 'Password is required';
			isValid = false;
		} else {
			passwordError.textContent = '';
		}

		// Validate password
		if (email.trim() === '') {
			emailError.textContent = 'Username is required';
			isValid = false;
		} else {
			emailError.textContent = '';
		}
		return isValid;
	}
</script>
</html>