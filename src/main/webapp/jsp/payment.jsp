<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>
</head>
<body>
	<!--<form:form id="paymentForm" modelAttribute="pay"
		action="paymentProcess" method="post">-->

		<table align="center">
			<tr>
				<td><form:label path="cardNumber">Card Number</form:label></td>
				<td><form:input path="cardNumber" name="cardNumber"
						id="cardNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="exMonth">exMonth</form:label></td>
				<td><form:password path="exMonth" name="exMonth" id="exMonth" /></td>
			</tr>
			<tr>
				<td><form:label path="exYear">FirstName</form:label></td>
				<td><form:input path="exYear" name="exYear" id="exYear" /></td>
			</tr>
			<tr>
				<td><form:label path="nameOnCard">LastName</form:label></td>
				<td><form:input path="nameOnCard" name="nameOnCard"
						id="nameOnCard" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button <a href="paymentSuccessful.jsp"></a> >Pay Now</form:button></td>

			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="search.jsp">Home</a></td>
			</tr>
		</table>
	<!--</form:form>-->

</body>
</html>