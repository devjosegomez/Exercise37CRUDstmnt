<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
<link rel="stylesheet" href="./css/styles.css" />
</head>
<body>
	<h2>Create with Preparate Statement</h2>
	
	<form action="createServlet" method="post">
	<p>
		<label for="txtIdEmployee">IdEmployee:</label><br />
		<input type="text" id="txtIdEmployee" name="txtIdEmployee" disabled/>
	</p>
	<p>
		<label for="txtNameEmployee">Name Employee:</label><br />
		<input type="text" id="txtNameEmployee" name="txtNameEmployee"/>
	</p>
	<p>
		<label for="txtAgeEmployee">Age Employee:</label><br />
		<input type="range" id="txtAgeEmployee" name="txtAgeEmployee"/ min="18" max="100">
	</p>
	<p>
		<label for="txtAddressEmployee">Address Employee:</label><br />
		<input type="text" id="txtAddressEmployee" name="txtAddressEmployee"/>
	</p>
	<p>
		<label for="txtSalaryEmployee">Salary Employee:</label><br />
		<input type="text" id="txtSalaryEmployee" name="txtSalaryEmployee"/>
	</p>
	<p>
		<label for="txtDepartmentEmployee">Department Employee:</label><br />
		<input type="text" id="txtDepartmentEmployee" name="txtDepartmentEmployee"/>
	</p>
		<input type="submit"  value="Create product"/>
	</form>
	<br />
	<a href=""><input type="button" value="Back to main menu" /></a>
<script src="./js/script.js"></script>
</body>
</html>