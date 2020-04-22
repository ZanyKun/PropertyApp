<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="authenticate.test" method="post">
		<label for="username">Username</label><br/>
		<input type="text" name="username"/><br/><br/>
		<label for="password">Password</label><br/>
		<input type="password" name="password1"/><br/><br/>
		<input type="submit" value="Log In"/>
	</form>
	${userError}
	${passError}
</body>
</html>