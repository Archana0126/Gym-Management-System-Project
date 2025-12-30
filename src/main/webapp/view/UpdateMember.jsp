
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Update Member</title>
  <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

  <%@ include file="header.jsp" %>


 

  <div class="form-container">
    <h2>Update Gym Member</h2>
    <form action="/update-Member" method="post">

      <div class="form-group">
        <label for="mid">Member ID:</label>
        <input type="text" id="mid" name="mid" value="${member.mid}" readonly />
      </div>

      <div class="form-group">
        <label for="mname">Full Name:</label>
        <input type="text" id="mname" name="mname" value="${member.mname}" required />
      </div>

      <div class="form-group">
        <label for="mgender">Gender:</label>
        <select id="mgender" name="mgender" required>
          <option value="">Select Gender</option>
          <option value="Male" ${member.mgender == 'Male' ? 'selected' : ''}>Male</option>
          <option value="Female" ${member.mgender == 'Female' ? 'selected' : ''}>Female</option>
          <option value="Other" ${member.mgender == 'Other' ? 'selected' : ''}>Other</option>
        </select>
      </div>

      <div class="form-group">
        <label for="mage">Age:</label>
        <input type="number" id="mage" name="mage" value="${member.mage}" min="1" max="120" required />
      </div>

      <div class="form-group">
        <label for="maddress">Address:</label>
        <input type="text" id="maddress" name="maddress" value="${member.maddress}" required />
      </div>

      <div class="form-group">
        <label for="mcontact">Contact Number:</label>
        <input type="text" id="mcontact" name="mcontact" value="${member.mcontact}" required pattern="[0-9]{10}" title="Enter a 10-digit contact number" />
      </div>

      <div class="form-group">
        <label for="membershipType">Membership Type:</label>
        <select id="membershipType" name="membershipType" required>
          <option value="">Select Membership Type</option>
          <option value="Monthly" ${member.membershipType == 'Monthly' ? 'selected' : ''}>Monthly</option>
          <option value="Quarterly" ${member.membershipType == 'Quarterly' ? 'selected' : ''}>Quarterly</option>
          <option value="Yearly" ${member.membershipType == 'Yearly' ? 'selected' : ''}>Yearly</option>
        </select>
      </div>

      <div class="form-group">
        <label for="membershipStartDate">Start Date:</label>
        <input type="date" id="membershipStartDate" name="membershipStartDate" value="${member.membershipStartDate}" required />
      </div>

      <div class="form-group">
        <label for="membershipEndDate">End Date:</label>
        <input type="date" id="membershipEndDate" name="membershipEndDate" value="${member.membershipEndDate}" required />
      </div>

      <input type="submit" value="Update Member" />
    </form>
  </div>

</body>
</html>
