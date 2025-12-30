<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Edit Staff</title>
  <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

<%@ include file="header.jsp" %>

<div class="form-container">
  <h2>Edit Staff Details</h2>

  <form action="/update-staff" method="post">
  
    <div class="form-group">
      <label for="sid">Staff ID:</label>
      <input type="text" id="sid" name="sid" value="${staff.sid}" readonly />
    </div>

    <div class="form-group">
      <label for="sname">Full Name:</label>
      <input type="text" id="sname" name="sname" value="${staff.sname}" required />
    </div>

    <div class="form-group">
      <label for="srole">Role:</label>
      <input type="text" id="srole" name="srole" value="${staff.srole}" required />
    </div>

    <div class="form-group">
      <label for="saddress">Address:</label>
      <input type="text" id="saddress" name="saddress" value="${staff.saddress}" required />
    </div>

    <div class="form-group">
      <label for="scontact">Contact:</label>
      <input type="text" id="scontact" name="scontact" value="${staff.scontact}" required pattern="[0-9]{10}" title="Enter a 10-digit contact number" />
    </div>

    <div class="form-group">
      <label for="ssalary">Salary:</label>
      <input type="number" id="ssalary" name="ssalary" value="${staff.ssalary}" required min="0" />
    </div>

    <input type="submit" value="Update Staff" />
  </form>
</div>

</body>
</html>
