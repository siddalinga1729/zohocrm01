<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu_lead.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
</head>
<body>
	<h3>All Contacts</h3>
	<table border="2">
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email Id</th>
			<th>leadSource</th>
			<th>Mobile</th>
			<th>Billing</th>
		</tr>
		<c:forEach items="${contacts}" var="contact">
			<tr>
				<td>${contact.id}</td><!-- names should match with entity -->
				<td><a href="getLeadById?id=${contact.id}">${contact.firstName}</a></td>
				<td>${contact.lastName}</td>
				<td>${contact.email}</td>
				<td>${contact.leadSource}</td>
				<td>${contact.mobile}</td>
				<td><a href="getcontactById?id=${contact.id}">Billing details</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>