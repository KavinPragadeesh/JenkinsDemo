<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${emp_name} Details</h1>
	
	<div>
		<table>
			<tr>
				<th>ID
				<th>Email
				<th>Phone
			</tr>
			<tr>
				<td>${emp_id}
				<td>${emp_email}
				<td>${emp_no}
			</tr>
		</table>
	</div>
</body>
</html>