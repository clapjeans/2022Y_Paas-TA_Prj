<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserLoginPage</title>
</head>
<body>
	<form action="/loginPage/loginProc" method="post">
		<div> id : 
			<input type="text" name="user_id">
		</div>
		<div> pwd : 
			<input type="password" name="password">
		</div>
		<button type="submit">로그인</button>
	</form>
</body>
</html>