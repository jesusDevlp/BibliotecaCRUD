<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" ; charset="UTF-8">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat&display=swap"
	rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat&display=swap"
	rel="stylesheet">
<title>Inicio</title>
</head>
<body>
	<%
		String x = (String) request.getAttribute("msj");
	String a = "";
	if (x != null) {
		a = x;
	}
	%>

	<form action="ServletLogin" name="frmsesion" method="post"
		class="form-box">
		<h1 class="form-title">Welcome. Please login.</h1>
		<input type="text" name="txtlogin" placeholder="Username"> <input
			type="password" name="txtclave" placeholder="Password">
		<button type="submit">Login</button>
		
	</form>


</body>
</html>