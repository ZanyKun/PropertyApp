<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="register.test" method="post">
		${existsError}
		${userError}
		<label for="username">Username<span style="color: red">*</span></label><br/>
		<input type="text" name="username" value="${newUser.username}" required="required"/><br/><br/>
		${passError}
		<label for="password1">Password<span style="color: red">*</span></label><br/>
		<input type="password" name="password1" required="required"/><br/><br/>
		${matchError}
		<label for="password2">Confirm Password</label><br/>
		<input type="password" name="password2"/><br/><br/>
		<label for="name">Name<span style="color: red">*</span></label><br/>
		<input type="text" name="name" value="${newUser.name}" required="required"/><br/><br/>
		${emailError}
		<label for="email">Email<span style="color: red">*</span></label><br/>
		<input type="text" name="email" value="${newUser.email}" required="required"/><br/><br/>
		<label for="phoneNum">Phone Number<span style="color: red">*</span></label><br/>
		${phoneError}
		<input type="tel" name="phoneNum" value="${newUser.phoneNum}" required="required"/><br/><br/>
		${userTypeError}
		<label for="User Type">User Type<span style="color: red">*</span></label><br/>
		<label for="Owner">Owner</label>
		<input type="radio" name="userType" value="Owner"/><br/>
		<label for="Dealer">Dealer</label>
		<input type="radio" name="userType"	value="Dealer"/><br/><br/>
		<input type="submit" value="Submit Registration Form"/>
	</form>
</body>
</html>