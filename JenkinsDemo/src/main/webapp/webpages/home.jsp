<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Form</h1>
	<form method="post" action="details">
		<label>Enter Employee Name</label>
		<input type="text" name="emp_name">
		<label>Enter Employee ID</label>
		<input type="number" name="emp_id">
		<label>Enter Employee Email</label>
		<input type="text" name="emp_email">
		<label>Enter Employee Phone Number</label>
		<input type="text" name="emp_no">
		<input type="submit" value="REGISTER">
	</form>	
</body>
</html>