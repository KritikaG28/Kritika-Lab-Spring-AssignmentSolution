<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<head>
<body>
	<div class="container">

		<hr>
		<!-- logout button -->
		<a href="/StudentManagement/logout"
			class="btn btn-primary btn-sm mb-3 mx-auto" style="float: right;">
			Logout </a>
		<h3>HTTP Status 403 - Access is denied</h3>
		<h3>${msg}</h3>
		<hr>
		<a href="/StudentManagement/students/list">Click here to view the
			list of students</a>
	</div>
</body>
</head>
</html>