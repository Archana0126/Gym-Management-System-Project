<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>View Members</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<%@ include file="header.jsp"%>
	<h1>Members Attendance Report</h1>

	<table class="members-table">
		<tr>
			<th>Member Id</th>
			<th>Member Name</th>
			<th>Attendance_Date</th>
			<th>Status</th>
			
		</tr>
		<c:forEach var="memberA" items="${memberAttendance}">
			<tr>
				<td>${memberA.memberId}</td>
				<td>${memberA.memberName}</td>
				<td>${memberA.date}</td>
				<td>${memberA.status}</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>
