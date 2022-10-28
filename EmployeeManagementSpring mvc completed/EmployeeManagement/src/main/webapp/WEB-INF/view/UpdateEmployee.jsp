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
	<form:form action="UpdatedEmployee" modelAttribute="employee" method="post">
		<table>
		<tr>
            <td>Your EmployeeId</td>
            <td><form:input type ="number" name="id"  path ="id" readOnly = "readOnly"/></td>
        </tr>
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
			<td><form:input type="text" name="phoneNumber" path ="phoneNumber" placeholder="10-digits"
				pattern="[6-9]{1}[0-9]{9}" /></td>
		</tr>
		<tr>
			<td>Enter your Salary</td>
			<td><form:input type="number" name="salary" path = "salary"/></td>
		</tr>
		<tr>
        	<td>Your DateOfBirth</td>
        	<td><form:input type = "date" name="dateOfBirth" path = "dateOfBirth"  readOnly = "readOnly"/></td>
        </tr>
        <tr>
        	<td>Choose your BloodGroup</td>
        	<td><form:select name="bloodGroup" path="bloodGroup" >
        	<form:option value="A+" path="A+"/>A+</option>
            <form:option value="A-" path = "A-"/>A-</option>
        	<form:option value="B+" path="B+"/>B+</option>
        	<form:option value="B-" path = "B-"/>B-</option>
        	<form:option value="O+" path = "O+"/>O+</option>
            <form:option value="O-" path = "O-"/>O-</option>
        	<form:option value="AB+" path = "AB+"/>AB+</option>
        	<form:option value="AB-" path = "AB-"/>AB-</option>
        	</form:select></td>
        </tr>
        <tr>
            <td>Your DateOfJoining</td>
        	<td><form:input type="date" name="dateOfJoining"
           		  path = "dateOfJoining" readOnly = "readOnly"/></td>
        </tr>
		</table>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>