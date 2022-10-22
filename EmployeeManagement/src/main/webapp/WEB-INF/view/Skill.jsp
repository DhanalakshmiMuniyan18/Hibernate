<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="com.ideas2it.model.Skills"%>
<!DOCTYPE html>
<html>
<head>
<title>Trainer Skill</title>
</head>
<h1>Trainer Skill</h1>
<body >
	<form:form action="createSkill" modelAttribute="skill">
	    <input type="hidden" name="id" path="id" value="${id}">
	    <br>
	    <form:input type="hidden" path="skillId" name="skillId"/>
	    <table>
	    <tr>
                            <tr>
                                <th>Skill Name</th>
                                <th>Certified or not</th>
                                <th>Proficiency Level</th>
                            </tr>
                            <tr>
                                <td>
                                    <td><input type="text" name="skillSet" path="skillSet"/></td>
                                    <td><input type="text" name="skillCertification" path="skillCertification"/></td>
                                    <td><input type="text" name="skillProficiency" path="skillProficiency"/></td>
                                </td>
                            </tr>
        				</tr>
        				</table>
		<button type="submit">Submit</button>
	</form:form>
</body>

</html>
