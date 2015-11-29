<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>addCategory</title>
</head>
<body>
	<table>
		<c:forEach items="${clist}" var="category">
			<tr>
				<td>${category.name }</td>
				<td>${category.title }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>