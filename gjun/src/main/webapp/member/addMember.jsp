<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<form action="../addMemberController" method="post">
	姓名:<input type="text" name="name"><br>
	帳號:<input type="text" name="username"><br>
	密碼:<input type="password" name="password"><br>
	地址:<input type="text" name="address"><br>
	電話:<input type="text" name="phone"><br>
	行動:<input type="text" name="mobile"><br>
	<input type="submit" value="ok">
	</form>
</body>
</html>