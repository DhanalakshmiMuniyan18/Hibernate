<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="com.ideas2it.model.Trainer"%>
	<%@page import="com.ideas2it.model.Skill"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
h1 {
	text-align: center;
}

table {
	height: 50%
}

td {
	height: 50px
}
</style>
</head>
<body bgcolor="#80bfff">
	<h1>Trainer Form</h1>
	<form:form action="createTrainer" modelAttribute="trainer" method="post">
		<table>
			<tr>
			<td><form:input type="hidden" name="id" path="id" value ="0"/></td>
			</tr>
            <tr>
				<td>Enter your Name</td>
				<td><form:input type="text" name="name" path = "name"/></td>
			</tr>
</body>
</html>