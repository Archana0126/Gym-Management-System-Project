<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>


	
<body>
   <h1>Welcome to RamBo Fitness Club</h1>

   <div class="login-container">
    <h2>Please Login to RamBo GYM</h2>
    <form action="open-HomePage" method="POST">
      <input type="text" name="username" placeholder="Username" required>
      <input type="password" name="password" placeholder="Password" required>
      <input type="submit" value="Login">
    </form>
    <div class="register-link">
      Don't have an account? <a href="/open-ContactToAdminPage">Contact To Admin</a>
    </div>
  </div>


</body>

</html>
