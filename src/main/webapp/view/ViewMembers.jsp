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
	<h1>All Members List</h1>

	<table class="members-table">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Age</th>
			<th>Address</th>
			<th>Mobile Number</th>
			<th>Membership Type</th>
			<th>Membership Start Date</th>
			<th>Membership End Date</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="user" items="${membersList}">
			<tr>
				<td>${user.mid}</td>
				<td>${user.mname}</td>
				<td>${user.mgender}</td>
				<td>${user.mage}</td>
				<td>${user.maddress}</td>
				<td>${user.mcontact}</td>
				<td>${user.membershipType}</td>
				<td>${user.membershipStartDate}</td>
				<td>${user.membershipEndDate}</td>
				<td><a href="/edit-members?mid=${user.mid}">Update</a></td>
				<td><a href="/delete-member?mid=${user.mid}">Delete</a></td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>
