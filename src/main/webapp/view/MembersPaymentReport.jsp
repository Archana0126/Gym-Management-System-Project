<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Members Payment Report</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<%@ include file="header.jsp"%>
	<h1>Members Payment Report</h1>

	<table class="members-table">
		<tr>
			<th>Member ID</th>
            <th>Member Name</th>
            <th>Payment Amount</th>
            <th>Payment Date</th>
            <th>Payment Mode</th>
            <th>Payment For</th>
            <th>Remarks</th>
			
		</tr>
		<c:forEach var="memberPR" items="${memberPaymentR}">
			<tr>
				<td>${memberPR.memberId}</td>
                <td>${memberPR.memberName}</td>
                <td>${memberPR.amountPaid}</td>
                <td>${memberPR.paymentDate}</td>
                <td>${memberPR.paymentMode}</td>
                <td>${memberPR.paymentFor}</td>
                <td>${memberPR.remarks}</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>
