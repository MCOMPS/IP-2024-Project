<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Person Information</h2>

	<form action="calculateBMIUsingRequestParam" method="get">
		<label for="name">Name:</label> <input type="text" id="name"
			name="name" required><br> <label for="yob">Year
			of Birth:</label> <input type="number" id="yob" name="yob" required><br>

		<label for="height">Height (in meters):</label> <input type="number"
			step="0.01" id="height" name="height" required><br> <label
			for="weight">Weight (in kilograms):</label> <input type="number"
			step="0.01" id="weight" name="weight" required><br> <input
			type="submit" value="Submit">
	</form>
</body>
</html>