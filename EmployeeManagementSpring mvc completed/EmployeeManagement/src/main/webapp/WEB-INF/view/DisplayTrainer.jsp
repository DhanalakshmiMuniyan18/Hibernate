<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ideas2it.model.Trainer"%>
<%@page import="com.ideas2it.model.Skill"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Trainee</title>
</head>
<style>
#trainer {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
	font-size: 10px;
}

#trainer td, #trainer th {
	border: 1px solid #ddd;
	padding: 8px;
}

#trainer tr:nth-child(even) {
	background-color: #f2f2f2;
}

#trainer tr:hover {
	background-color: #ddd;
}

#trainer th {
	padding-top: 2px;
	padding-bottom: 12px;
	text-align: center;
	background-color: #1171ba;
	color: white;
}
</style>
<body>
	<h1 align="center">Trainer Details</h1>
	<table id="trainer">
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
			<th><b>NO.Of.Students</b></th>
			<th><b>Specialisation</b></th>
			<th><b>Skill</b></th>
			<th><b>SkillCertification</b></th>
			<th><b>skillProficiency</b></th>
		</tr>

		<%List<Trainer> trainers = (List<Trainer>) request.getAttribute("Trainer"); 
		
		if (trainers != null) {
		 for(Trainer trainer:trainers) {  %>
		<tr>
			<td><%=trainer.getId()%></td>
			<td><%=trainer.getName()%></td>
			<td><%=trainer.getDesignation()%></td>
			<td><%=trainer.getEmailId()%></td>
			<td><%=trainer.getPhoneNumber()%></td>
			<td><%=trainer.getSalary()%></td>
			<td><%=trainer.getDateOfBirth()%></td>
			<td><%=trainer.getBloodGroup()%></td>
			<td><%=trainer.getDateOfJoining()%></td>
			<td><%=trainer.getNumberOfStudents()%></td>
			<td><%=trainer.getSpecialisation()%></td>
			<%Set<Skill> skills = trainer.getSkills();
			   if(skills != null) {
			   for(Skill skill : skills) {%>
			<td><%=skill.getSkillSet()%></td>
			<td><%=skill.getSkillCertification()%></td>
			<td><%=skill.getSkillProficiency()%></td>
		</tr>

		<%}
		 }
		 }
		 } %>
	</table>
</body>
</html>