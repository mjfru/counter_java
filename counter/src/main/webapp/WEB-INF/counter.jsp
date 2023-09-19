<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Counter</title>
</head>
<body>
	<h2>You have visited localhost:8080 <c:out value="${visits}"/> time(s).</h2>
	<a href="/">Test another visit?</a>
</body>
</html>