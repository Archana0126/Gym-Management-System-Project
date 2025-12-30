<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Staff Salary Payment</title>
  <link rel="stylesheet" href="css/style.css" />
</head>
<body>

  <div class="form-container">
    <h2>Staff Salary Payment</h2>
    <form action="/verify-StaffSalaryDetails" method="post">

      <div class="form-group">
        <label for="staffId">Staff ID:</label>
        <input type="number" id="staffId" name="staffId" placeholder="Enter Staff ID" required />
      </div>
      
       <div class="form-group">
        <label for="staffId">Staff Name:</label>
        <input type="text" id="staffName" name="staffName" placeholder="Enter Staff Name" required />
      </div>

      <div class="form-group">
        <label for="salaryAmount">Salary Amount:</label>
        <input type="number" step="0.01" id="salaryAmount" name="salaryAmount" placeholder="Enter Salary Amount" required />
      </div>

      <div class="form-group">
        <label for="paymentDate">Payment Date:</label>
        <input type="date" id="paymentDate" name="paymentDate" required />
      </div>

      <div class="form-group">
        <label for="paymentMode">Payment Mode:</label>
        <select id="paymentMode" name="paymentMode" required>
          <option value="">Select Payment Mode</option>
          <option value="Cash">Cash</option>
          <option value="Bank Transfer">Bank Transfer</option>
        </select>
      </div>

      <div class="form-group">
        <label for="salaryMonth">Salary Month:</label>
        <input type="month" id="salaryMonth" name="salaryMonth" placeholder="e.g., 2025-05" required />
      </div>

      <div class="form-group">
        <label for="remarks">Remarks:</label>
        <input type="text" id="remarks" name="remarks" placeholder="Any remarks (optional)" />
      </div>

      <input type="submit" value="Submit Salary Payment" />

    </form>
  </div>

</body>
</html>
