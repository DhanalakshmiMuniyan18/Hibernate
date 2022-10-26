<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getEmployee</title>

</head>
<body bgcolor="#80bfff">
	<table align="center">
	<h1 align="center">Employee Management</h1>
	<form action ="updateEmployee">
    <tr>
		<td><b>Enter your Id<b></td>
		<td><input id = "id" name="id" path="id"/></td>
	</tr>
	<br>
	<tr>
		<td><button>Update</button>
	</tr>
	</table>
	</form>
</body>
</html>