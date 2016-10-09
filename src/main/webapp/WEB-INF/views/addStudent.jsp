<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add student Form</h1>
	<form:form method="POST" action="addStudentSave"
		modelAttribute="studentModelAttribute">
		<table border="1">
			<thead>
				<tr>
					<td>Faculty Number</td>
					<td>Name</td>
				</tr>
				<tr>
					<td>Faculty Number</td>
					<td><input type="text" name="facultyNumber" /></td>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
			</thead>
		</table>
		<input type=submit id="btn1" name="Submit">
	</form:form>
</body>
</html>