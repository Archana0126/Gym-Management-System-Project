<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Member Payment</title>
  <link rel="stylesheet" href="css/style.css" />
</head>
<body>


  <div class="form-container">
    <h2>Member Payment</h2>
    <form action="/verify-MemberPaymentDetails" method="post">

      <div class="form-group">
        <label for="memberId">Member ID:</label>
        <input type="number" id="memberId" name="memberId" placeholder="Enter Member ID" required />
      </div>
      
      <div class="form-group">
        <label for="memberName">Member Name:</label>
        <input type="text" id="memberName" name="memberName" placeholder="Enter Member Name" required />
      </div>

      <div class="form-group">
        <label for="amountPaid">Amount Paid:</label>
        <input type="number" step="0.01" id="amountPaid" name="amountPaid" placeholder="Enter Amount" required />
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
          <option value="UPI">UPI</option>
          <option value="Bank Transfer">Bank Transfer</option>
          <option value="Credit Card">Credit Card</option>
        </select>
      </div>

      <div class="form-group">
        <label for="paymentFor">Payment For:</label>
        <input type="text" id="paymentFor" name="paymentFor" placeholder="e.g., Monthly Membership" required />
      </div>

      <div class="form-group">
        <label for="remarks">Remarks:</label>
        <input type="text" id="remarks" name="remarks" placeholder="Any remarks (optional)" />
      </div>

      <input type="submit" value="Submit Payment" />

    </form>
  </div>

</body>
</html>
