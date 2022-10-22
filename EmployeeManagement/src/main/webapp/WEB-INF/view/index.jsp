<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>EmployeeManagement</title>
<style>
h1 {
	text-align: center;
}

.button {
	text-align: center;
	text-decoration: none; padding : 20px;
	margin: 10px 20px;
	color: blue;
	width: 100%;
	padding: 25px 25px;
	border-radius: 50%;
	background-color: white;
	padding: 20px;
}
a{
text-decoration:none;
}
</style>
</head>
<body bgcolor="#80bfff">
	<h1>Employee Management</h1>
	<table>
		<tr>
			<td>
				<button class="button">
					<a href="Trainer"><b>Create_TrainerAccount</a>
				</button>
			</td>
		</tr>
		<td>
			<button class="button">
				<a href="Trainee"><b>Create_TraineeAccount</a>
			</button>
		</td>
		</tr>
		<tr>
			<td>
				<button class="button">
					<a href="DisplayTrainer"><b>Display_Trainer</a>
				</button>
			</td>
		</tr>
		<tr>
			<td>
				<button class="button">
					<a href="DisplayTrainee"><b>Display_Trainee</a>
				</button>
			</td>
		</tr>
		<tr>
			<td>
				<button class="button">
					<a href="GetEmployee"><b>Update _Employee</a>
				</button>
			</td>
		</tr>
		<tr>
			<td>
				<button class="button">
					<a href="DeleteEmployee"><b>Delete_Employee</a>
				</button>
			</td>
		</tr>
	</table>
</body>
</html>