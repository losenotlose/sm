<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<form action="index.html" method="get">
		<input name="name">
		<input name="age">
		<input type="submit" value="提交">
	</form>
	<form action="index.html" method="post">
		<input name="name">
		<input name="age">
		<input type="submit" value="提交">
	</form>
</body>
</html>