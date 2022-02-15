<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserLoginPage</title>
</head>
<body>
<!--  name은 자바로 가고, id는 자바스크립트로 간다.-->
	<form action="/loginPage/loginProc" name="formTag" onsubmit="return doLoginCheck(this);" method="post">
		<div> id : 
			<input type="text" name="user_id" id="user_id">
		</div>
		<div> pwd : 
			<input type="password" name="password" id="password">
		</div>
		<button type="submit">로그인</button>
		<button type="button"  onclick="location.href='/kakaoGetAuthToken'">카카오로그인</button>
	</form>
</body>
<script src="/js/checkAlert.js"></script>
</html>