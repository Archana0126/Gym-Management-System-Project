<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Staffs Salary Report</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<%@ include file="header.jsp"%>
	<h1>Staffs Salary Report</h1>

	<table class="members-table">
		<tr>
			<th>Staff ID</th>
            <th>Staff Name</th>
            <th>Salary Amount</th>
            <th>Salary Date</th>
            <th>Salary Mode</th>
            <th>Salary Month</th>
            <th>Remarks</th>
			
		</tr>
		<c:forEach var="s" items="${staffSalaryR}">
    <tr>
        <td>${s.staffId}</td>
        <td>${s.staffName}</td>
        <td>${s.salaryAmount}</td>
        <td>${s.salaryDate}</td>
        <td>${s.salaryMode}</td>
        <td>${s.salaryMonth}</td>
        <td>${s.remarks}</td>
    </tr>
</c:forEach>

	</table>

</body>
</html>
