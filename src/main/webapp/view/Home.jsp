<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Home - RamBo GYM</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<jsp:include page="header.jsp" />



</head>
<body>
	<h1>Welcome to RamBo GYM Management System</h1>
	


	<div class="dashboard-cards">
		<div class="dashboard-card">
			<h3>ADD MEMBER</h3>
			<a href="/open-AddMembers">Go</a>
		</div>
		
		<div class="dashboard-card">
			<h3>ADD STAFF</h3>
			<a href="/open-AddStaff">Go</a>
		</div>
		
		<div class="dashboard-card">
			<h3>VIEW EQUIPMENT</h3>
			<a href="/open-EquipmentPage">Go</a>
		</div>
		<div class="dashboard-card">
			<h3>MEMBER ATTENDANCE </h3>
			<a href="/get-MemberAttendance">Go</a>
		</div>
		
		<div class="dashboard-card">
			<h3>STAFF ATTENDANCE</h3>
			<a href="/get-StaffAttendance">Go</a>
		</div>
		
		
	</div>



</body>
</html>
