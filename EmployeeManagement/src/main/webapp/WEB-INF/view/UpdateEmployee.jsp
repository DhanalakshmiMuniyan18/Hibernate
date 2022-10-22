<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.ideas2it.model.Trainee"%>
<!DOCTYPE html>
<html>
<head>
<title>EmployeeManagement</title>
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
	<h1>Trainee Form</h1>
	System.out.println("employee"+""+ employee);
	<form:form action="UpdateEmployee" modelAttribute="employee" method="post">
		<table>
		   <tr>
				<td>Enter your Name</td>
				<td><form:input type="text" name="name" path="name"/></td>
			</tr>
			<tr>
				<td>Enter your Designation</td>
				<td><form:input type="text" name="designation" path="designation"/></td>
			</tr>
			<tr>
				<td>Enter your Email-Id</td>
				<td><form:input type="email" name="emailId" path="emailId"
					placeholder="ideas2it@gmail.in" /></td>
			</tr>
			<tr>
				<td>Enter your PhoneNumber</td>
				<td><form:input type="text" name="phoneNumber" path ="phoneNumber" size="10"
					style="width: 300px; height: 20px" placeholder="6928398223"
					pattern="[6-9]{1}[0-9]{9}" /></td>
			</tr>
			<tr>
				<td>Enter your Salary</td>
				<td><form:input type="number" name="salary" path = "salary"/></td>
			</tr>
			<tr>
				<td>Enter your bloodgroup</td>
                <td><form:input type="text" name="bloodGroup" path="bloodGroup"/></td>

			</tr>

			<button type="submit">Submit</button>
		</table>
	</form:form>
	<a href ="index"><b>Back to home</b></a>
</body>
</html>