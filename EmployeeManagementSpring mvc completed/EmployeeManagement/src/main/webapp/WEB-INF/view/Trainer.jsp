<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="com.ideas2it.model.Trainer"%>
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
	<form:form modelAttribute="trainer" action="createTrainer" method = "post" >
	<form:input type="hidden" name="trainerId" path="trainerId" value="0"/>
	<form:input type="hidden" name="id" path="id" value ="0"/>
		<table>
			<tr>
				<td>Enter your Name</td>
				<td><form:input type="text" name="name" path="name" /></td>
			</tr>
			<tr>
				<td>Enter your Designation</td>
				<td><form:input type="text" name="designation"
					path = "designation"/></td>
			</tr>
			<tr>
				<td>Enter your Email-Id</td>
				<td><form:input type="email" name="emailId" path ="emailId" placeholder="ideas2it@gmail.in" /></td>
			</tr>
			<tr>
				<td>Enter your PhoneNumber</td>
				<td><form:input type="text" name="phoneNumber" path="phoneNumber" /></td>
			</tr>
			<tr>
				<td>Enter your Salary</td>
				<td><form:input  name="salary" path="salary"/></td>
			</tr>
			<tr>
				<td>Enter your DateOfBirth</td>
				<td><form:input type = "date" name="dateOfBirth" path = "dateOfBirth" /></td>
			</tr>
			<tr>
				<td>Choose your BloodGroup</td>
				<td><form:select name="bloodGroup" path="bloodGroup">
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
				<td>Enter your DateOfJoining</td>
				<td><form:input type="date" name="dateOfJoining"
					path = "dateOfJoining"/></td>
			</tr>
			<tr>
				<td>Enter No.Of.Students you train</td>
				<td><form:input type="text" name="numberOfStudents"
					path ="numberOfStudents" /></td>
			</tr>
			<tr>
				<td>Enter your specialisation</td>
				<td><form:input type="text" name="specialisation" path ="specialisation"
					/></td>
			</tr>
			<tr>
				<td><button>Add your skills</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>