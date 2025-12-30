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
	<h1>All Staff List</h1>

<table class="members-table">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Role</th>
    <th>Address</th>
    <th>Contact</th>
    <th>Salary</th>
    <th>Update</th>
    <th>Delete</th>
  </tr>

  <c:forEach var="staff" items="${staffsList}">
    <tr>
      <td>${staff.sid}</td>
      <td>${staff.sname}</td>
      <td>${staff.srole}</td>
      <td>${staff.saddress}</td>
      <td>${staff.scontact}</td>
      <td>${staff.ssalary}</td>
      <td><a href="/edit-staff?sid=${staff.sid}">Update</a></td>
      <td><a href="delete-staff?sid=${staff.sid}">Delete</a></td>
    </tr>
  </c:forEach>
</table>


</body>
</html>
