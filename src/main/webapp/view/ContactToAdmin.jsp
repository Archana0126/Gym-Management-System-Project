<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Contact Admin - RamBo GYM</title>
<link rel="stylesheet" href="css/style.css">

</head>
<body>

	<div class="form-container">
		<h2>Contact Admin</h2>

		<form action="/" method="POST">
			<div class="form-group">
				<label for="name">Your Name:</label> <input type="text" id="name"
					name="name" placeholder="Enter your full name" required>
			</div>


			<div class="form-group">
				<label for="email">Your Email:</label> <input type="text" id="email"
					name="email" placeholder="Enter your email address" required>

			</div>

			<div class="form-group">
				<label for="mcontact">Contact Number:</label> <input type="text"
					id="mcontact" name="mcontact" placeholder="Contact Number" required
					pattern="[0-9]{10}" title="Enter a 10-digit contact number" />
			</div>

			<div class="form-group">
				<label for="subject">Subject:</label> <input type="text"
					id="subject" name="subject" placeholder="Subject of your message"
					required>
			</div>

			<div class="form-group">
				<label for="message">Your Message:</label> <input type="text"
					id="message" name="message"
					placeholder="Write your message here..." rows="5" required>

			</div>
			<input type="submit" value="Submit">

			
				<a href="/">Back To Login</a>
			

		</form>

	</div>


</body>
</html>
