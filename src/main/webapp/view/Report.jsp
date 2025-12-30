<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Reports - RamBo GYM</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <jsp:include page="header.jsp" />
</head>
<body>

<div class="form-container">
  <h2>View Reports</h2>

  <form onsubmit="return goToReport();">
    <label>Select Report Type:</label>

    <select id="reportType" required>
      <option value="">-- Choose Report --</option>

      <option value="/view-AllMembers">Member Report</option>
      <option value="/member-attendance-report">Members Attendance Report</option>
      <option value="/staff-attendance-report">Staff Attendance Report</option>
      <option value="/members-payments-report">Member Payment Report</option>
      <option value="/staff-salary-report">Staff Salary Report</option>
      <option value="/open-MembershipPlan">Plan Subscription Report</option>
      <option value="/open-EquipmentPage">Equipment Report</option>
    </select>

    <input type="submit" value="Show Report">
  </form>
</div>

<script>
function goToReport() {
    var url = document.getElementById("reportType").value;
    if (url === "") {
        alert("Please select a report");
        return false;
    }
    window.location.href = url;
    return false;
}
</script>

</body>
</html>
