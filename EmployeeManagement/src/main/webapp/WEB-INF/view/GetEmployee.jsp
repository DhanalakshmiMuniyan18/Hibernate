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
<form:form action="/GetEmployee" modelAttribute="employee" method="POST">
	<table align="center">
	<h1 align="center">Employee Management</h1>
	<tr>
		<td><b>Enter your Id<b></td>
				<td><input type = "text" name="id" path="id"/></td>
	</tr>
		<tr>
			<td><button>Submit</button>
		</tr>
		<tr><td><h3>${status}</h3></td></tr>
		<tr>
			<td><a href ="index"><b>Back to home</a></td>
		</tr>			
	</table>	
	</form:form>
</body>
</html>