<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="css/animate.css">
	<!-- Custom  Stylesheet -->
	<link rel="stylesheet" href="css/style.css">


</head>

<style>
    h1{
    color: pink;
    }
    
    h2{
    color: white;
    }
    </style>
    

	
<body>
<form method="POST" action="${pageContext.request.contextPath}/login">
	<div class="container">
		<div class="top">
			<h1 id="title" class="hidden"><span id="logo">E-commrce</span></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Log In</h2>
			</div>
			<label for="username">UserName</label>
			<br/>
			<input type="text" id="username" name="username" value="${user.username}">
			<br/>
			<label for="password">Password</label>
			<br/>
			<input type="password" id="password" name="password" value="${user.password}">
			<br/>
			<button type="submit">Log In</button>
			<br/>
				<p style="color: red;">${errorString}</p>
			<a href="#"><p class="small">Forgot your password?</p></a>
		</div>
	</div>
	</form>
	
	
		
</body>

 <script>
	$(document).ready(function () {
    	$('#logo').addClass('animated fadeInDown');
    	$("input:text:visible:first").focus();
	});
	$('#username').focus(function() {
		$('label[for="username"]').addClass('selected');
	});
	$('#username').blur(function() {
		$('label[for="username"]').removeClass('selected');
	});
	$('#password').focus(function() {
		$('label[for="password"]').addClass('selected');
	});
	$('#password').blur(function() {
		$('label[for="password"]').removeClass('selected');
	});
</script>

</html>