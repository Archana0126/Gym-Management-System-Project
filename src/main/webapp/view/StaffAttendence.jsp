<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Staffs Attendance</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<h1>Staffs Attendance</h1>

<form action="${pageContext.request.contextPath}/save-StaffAttendance" method="post">

<table class="members-table">
	   <tr>
		<th>Id</th>
		<th>Name</th>
		<th>Role</th>
		<th>Date</th>
		<th>Status</th>
	   </tr>

	<c:forEach var="staff" items="${staffList}">
<tr>
    
    <td>
        ${staff.sid}
         <input type="hidden" name="staffId[]" value="${staff.sid}">
    </td>

    
    <td>
    ${staff.sname}
    <input type="hidden" name="staffName[]" value="${staff.sname}">
    </td>

    
    <td>
    ${staff.srole}
    <input type="hidden" name="staffName[]" value="${staff.sname}">
    </td>

   
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
