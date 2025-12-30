<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Add Staff Member</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

	<%@ include file="header.jsp"%>

	<div class="form-container">
		<h2>Add Staff Member</h2>
		<form action="/verify-StaffRegistrationDetails" method="post">

			<div class="form-group">
				<label for="sid">Staff ID:</label> <input type="number" id="sid"
					name="sid" placeholder="Staff ID" required />
			</div>

			<div class="form-group">
				<label for="sname">Full Name:</label> <input type="text" id="sname"
					name="sname" placeholder="Full Name" required />
			</div>

			<div class="form-group">
				<label for="srole">Role:</label> <select id="srole" name="srole"
					required>
					<option value="">Select Role</option>
					<option value="Manager">Manager</option>
					<option value="Fitness Trainer">Fitness Trainer</option>
					<option value="Yoga Instructor">Yoga Instructor</option>
					<option value="Receptionist">Receptionist</option>
					<option value="Maintenance Staff">Maintenance Staff</option>
					<option value="Equipment Technician">Equipment Technician</option>
					<option value="Dietitian">Dietitian</option>
				</select>
			</div>


			<div class="form-group">
				<label for="saddress">Address:</label> <input type="text"
					id="saddress" name="saddress" placeholder="Address" required />
			</div>

			<div class="form-group">
				<label for="scontact">Contact Number:</label> <input type="text"
					id="scontact" name="scontact" placeholder="Contact Number" required
					pattern="[0-9]{10}" title="Enter a 10-digit contact number" />
			</div>

			<div class="form-group">
				<label for="ssalary">Salary:</label> <input type="number"
					id="ssalary" name="ssalary" placeholder="Salary" min="0" required />
			</div>

			<input type="submit" value="Add Staff" />
		</form>
	</div>

</body>
</html>
