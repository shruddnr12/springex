<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/springex/user/login" method ="post">
		email: <input type = "text" name="email"/>
		<br>
		password: <input type = "password" name = "password"/>		
		<br>
		<input type="submit"	value="로그인"/>
	</form>
</body>
</html>