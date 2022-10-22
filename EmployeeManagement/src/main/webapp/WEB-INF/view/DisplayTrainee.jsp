<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ideas2it.model.Trainee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Trainee</title>
</head>
<style>
#trainee {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
	font-size: 10px;
}

#trainee td, #trainee th {
	border: 1px solid #ddd;
	padding: 8px;
}

#trainee tr:nth-child(even) {
	background-color: #f2f2f2;
}

#trainee tr:hover {
	background-color: #ddd;
}

#trainee th {
	padding-top: 2px;
	padding-bottom: 12px;
	text-align: center;
	background-color: #1171ba;
	color: white;
}
</style>
<body>
	<h1 align="center">Trainee Details</h1>
	<table id ="trainee">
		<tr>
			<th><b>Id</b></th>
			<th><b>Name</b></th>
			<th><b>Designation</b></th>
			<th><b>EmailId</b></th>
			<th><b>PhoneNumber</b></th>
			<th><b>Salary</b></th>
			<th><b>DateOfBirth</b></th>
			<th><b>BloodGroup</b></th>
			<th><b>DateOfJoining</b></th>
			<th><b>TrainingPeriod</b></th>
			<th><b>TrainingTechnology</b></th>
			<th><b>TrainingTestMark</b></th>
		</tr>

		<%
			List<Trainee> trainees = (List<Trainee>) request.getAttribute("Trainee");
			if (trainees != null) {
				for (Trainee trainee : trainees) {
			%>
		<tr>
			<td><%=trainee.getId()%></td>
			<td><%=trainee.getName()%></td>
			<td><%=trainee.getDesignation()%></td>
			<td><%=trainee.getEmailId()%></td>
			<td><%=trainee.getPhoneNumber()%></td>
			<td><%=trainee.getSalary()%></td>
			<td><%=trainee.getDateOfBirth()%></td>
			<td><%=trainee.getBloodGroup()%></td>
			<td><%=trainee.getDateOfJoining()%></td>
			<td><%=trainee.getTrainingPeriod()%></td>
			<td><%=trainee.getTrainingTechnology()%></td>
			<td><%=trainee.getTrainingTestMark()%></td>
		</tr>
		<%
			}
			}
			%>
	</table>
	<a href="index">Back to home</a>
</body>
</html>