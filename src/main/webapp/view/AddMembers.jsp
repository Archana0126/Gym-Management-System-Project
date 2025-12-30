<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Add Members</title>
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
</head>
<body>

  <%@ include file="header.jsp" %>
  
 

  <div class="form-container">
    <h2>Add Gym Member</h2>
    <form action="/verify-MembersRegistrationDetails" method="post">

      <div class="form-group">
        <label for="mid">Member ID:</label>
        <input type="text" id="mid" name="mid" placeholder="Member ID" required />
      </div>

      <div class="form-group">
        <label for="mname">Full Name:</label>
        <input type="text" id="mname" name="mname" placeholder="Full Name" required />
      </div>

      <div class="form-group">
        <label for="mgender">Gender:</label>
        <select id="mgender" name="mgender" required>
          <option value="">Select Gender</option>
          <option value="Male">Male</option>
          <option value="Female">Female</option>
          <option value="Other">Other</option>
        </select>
      </div>

      <div class="form-group">
        <label for="mage">Age:</label>
        <input type="number" id="mage" name="mage" placeholder="Age" min="1" max="120" required />
      </div>

      <div class="form-group">
        <label for="maddress">Address:</label>
        <input type="text" id="maddress" name="maddress" placeholder="Address" required />
      </div>

      <div class="form-group">
        <label for="mcontact">Contact Number:</label>
        <input type="text" id="mcontact" name="mcontact" placeholder="Contact Number" required pattern="[0-9]{10}" title="Enter a 10-digit contact number" />
      </div>

      <div class="form-group">
        <label for="membershipType">Membership Type:</label>
        <select id="membershipType" name="membershipType" required>
          <option value="">Select Membership Type</option>
          <option value="Monthly">Monthly</option>
          <option value="Quarterly">Quarterly</option>
          <option value="Yearly">Yearly</option>
        </select>
      </div>

      <div class="form-group">
        <label for="membershipStartDate">Start Date:</label>
        <input type="date" id="membershipStartDate" name="membershipStartDate" required />
      </div>

      <div class="form-group">
        <label for="membershipEndDate">End Date:</label>
        <input type="date" id="membershipEndDate" name="membershipEndDate" required />
      </div>

      <input type="submit" value="Add Member" />
    </form>
  </div>

</body>
</html>
