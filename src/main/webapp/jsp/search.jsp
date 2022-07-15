<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search for Flights</title>
</head>
<body>
	<table>
		<tr>
			<td><a href="login">Admin login</a></td>
		</tr>

	</table>
	<form:form id="serForm" modelAttribute="availableFlights"
		action="searchProcess" method="post">

		<table align="center">
			<tr>
				<td><form:label path="source">Source</form:label></td>
				<td><form:input path="source" name="source" id="source" /></td>
			</tr>
			<tr>
				<td><form:label path="destination">Destination</form:label></td>
				<td><form:input path="destination" name="destination"
						id="destination" /></td>
			</tr>
			<tr>
				<td><form:label path="journeyDate">Date</form:label></td>
				<td><form:input path="journeyDate" name="journeyDate"
						id="journeyDate" /></td>
			</tr>
			<tr>
				<td><form:label path="numberOfSeats">No. of Seats</form:label></td>
				<td><form:input path="numberOfSeats" name="numberOfSeats"
						id="numberOfSeats" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button id="search" name="search">Search</form:button></td>
			</tr>
			<tr></tr>

		</table>
	</form:form>
	
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>


</body>
</html>