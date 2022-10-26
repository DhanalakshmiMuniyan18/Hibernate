<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deleteEmployee</title>

</head>
<body bgcolor="#80bfff">
<form:form action="DeleteEmployee" method="POST">
	<table align="center">
	<h1 align="center">Delete Employee</h1>
	<tr>
		<td><b>Enter your Id<b></td>
				<td><input id = "id" name="id" path="id"/></td>
	</tr>
		<tr>
			<td><button>Delete</button>
		</tr>
	</table>	
	</form:form>
</body>
</html>