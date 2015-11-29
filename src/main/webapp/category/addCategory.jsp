<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>addCategory</title>
</head>
<body>
	<form action="/jeesky/category/addCategoryAction">
		<input id="name" name="name" required placeholder="请输入站点名" /> <br />
		<input id="title" name="title" required placeholder="请输入站点缩写" /><br />
		<input type="submit">
	</form>
</body>
</html>