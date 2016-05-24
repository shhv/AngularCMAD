<html>
<head>
<meta charset="UTF-8">
<title>Sign In form</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600' rel='stylesheet' type='text/css'>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="js/style.js"></script>
<script src="js/login.js"></script>
</head>
  	<body>
		<div id="tabs">
			<ul>
				<li onClick="showLogin()" id="loginbutton">Login</li>
				<li onClick="showReg()" id="regbutton">Register</li>
				<li onClick="showRP()" id="rstPass">Reset Password</li>
			</ul>
		</div> <!-- end tabs div -->
		<div id="wrapper">
			<div id="login-wrapper">
				<h1 style="color: #FFF; width: 360px; margin-left: 20px; font-family: Segoe UI Light; font-weight: 100;">Login</h1>
				<div id="info">Please enter your username and password to login</div>
					<input type="text" id="login-text" placeholder="Username" />
					<input type="password" id="login-pass" placeholder="Password" />
				<input type="button" name ="login" value="Login" id="login-button" />
			</div> <!-- end login-wrapper div -->
			<div id="reg-wrapper">
				<h1 style="color: #FFF; width: 360px; margin-left: 20px; font-family: Segoe UI Light; font-weight: 100;">Register</h1>
				<div id="info">Please enter a username and password to register</div>
					<input type="text" id="login-text" placeholder="Username" />
					<input type="password" id="login-pass" placeholder="Password" />
				<input type="button" value="Sign Up" id="login-button" />			
			</div> <!-- end reg-wrapper div -->
			<div id="rp-wrapper">
				<h1 style="color: #FFF; width: 360px; margin-left: 20px; font-family: Segoe UI Light; font-weight: 100;">Reset Password</h1>
				<div id="info">Enter your email and birthday to reset your password</div>
					<input type="text" id="login-text" placeholder="Email" />
					<input type="text" id="login-pass" placeholder="Birthday" />
				<input type="button" value="Send" id="login-button" />			
			</div> <!-- end rp-wrapper div -->
		</div> <!-- end wrapper div -->
      <p style="text-align: center;">
	</body>
</html>