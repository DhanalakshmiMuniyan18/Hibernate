<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOC TYPE html>
<html>
<head>
<title>Trainer Skill</title>
</head>
<h1>Trainer Skill</h1>
<body bgcolor="#80bfff">
	<form:form action="createSkill" modelAttribute="skill">
	<input type="hidden" name="id" path="id" value="${id}"/>
    <form:input type="hidden" name="skillId" path="skillId"/>
	    <table>
	        <tr>
	           <td>Enter your skill</td>
	           <td><form:input type="text" name="skillSet" path = "skillSet"/></td>
            </tr>
            <tr>
               <td>Have you done certification or not</td>
               <td><name = "skillCertification" path = "skillCertification" >
                   <form:radiobutton path = "skillCertification" value = "True"/><label for="Yes">Yes</label></td>
               <td><form:radiobutton path = "skillCertification" value = "No"/>No</td>
              </tr>
            <tr>
               <td>Choose your Proficiency Level</td>
               <td><name = "skillProficiency" path = "skillProficiency" >
               <form:radiobutton path = "skillProficiency" value = "Beginner"/>Beginner</td>
               <td><form:radiobutton path = "skillProficiency" value = "Intermediate"/>Intermediate</td>
               <td><form:radiobutton path = "skillProficiency" value = "Expert"/>Expert</td>
            </tr>
        </table>
		<button type="submit">Submit</button>
	</form:form>
</body>

</html>
