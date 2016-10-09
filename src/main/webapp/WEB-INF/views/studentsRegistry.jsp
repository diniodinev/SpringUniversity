<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<c:set var="contexPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<button type="button" onclick="location='${contexPath}/${addStudentUrl}'">Add
		Student</button>
	<table border="1">
		<thead>
			<tr>
				<td>Faculty Number</td>
				<td>Name</td>
			</tr>
		</thead>
		<c:if test="${not empty students}">
			<tbody>
				<c:forEach var="s" items="${students}">
					<tr>
						<td>${s.facultyNumber}</td>
						<td>${s.name}</td>
					</tr>
				</c:forEach>

			</tbody>
		</c:if>
	</table>
</body>
</html>