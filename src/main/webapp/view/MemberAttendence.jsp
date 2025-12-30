<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Members Attendance</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<h1>Members Attendance</h1>

<form action="${pageContext.request.contextPath}/save-Attendance" method="post">

<table class="members-table">
	   <tr>
		<th>Id</th>
		<th>Name</th>
		<th>Gender</th>
		<th>Date</th>
		<th>Status</th>
	   </tr>

	<c:forEach var="member" items="${membersList}">
<tr>
    
    <td>
        ${member.mid}
        <input type="hidden" name="memberId[]" value="${member.mid}">
    </td>

    
    <td>
    ${member.mname}
    <input type="hidden" name="memberName[]" value="${member.mname}">
    </td>

    
    <td>${member.mgender}</td>

   
    <td>
        <%= java.time.LocalDate.now() %>
        <input type="hidden" name="date[]" value="<%= java.time.LocalDate.now() %>">
    </td>

   
    <td>
        <button type="button" class="attendance-btn absent-btn"
                onclick="markAttendance(this, 'Absent')">Absent</button>

        <button type="button" class="attendance-btn present-btn"
                onclick="markAttendance(this, 'Present')">Present</button>

        <input type="hidden" name="status[]" value="Absent">
    </td>
</tr>
</c:forEach>


  </table>

   <br>
  
  


<div class="submit-container">
    <button type="submit" class="submit-btn">Submit Attendance</button>
</div>


</form>
<script>
function markAttendance(btn, status) {
    const td = btn.parentElement;
    const hiddenInput = td.querySelector('input[name="status[]"]');

    td.querySelectorAll('.attendance-btn').forEach(b => {
        b.style.backgroundColor = '';
    });

    if (status === 'Present') {
        btn.style.backgroundColor = 'green';
        hiddenInput.value = 'Present';
    } else {
        btn.style.backgroundColor = 'red';
        hiddenInput.value = 'Absent';
    }
}
</script>




</body>
</html>
