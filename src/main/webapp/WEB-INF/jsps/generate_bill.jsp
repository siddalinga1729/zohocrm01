<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead</title>
</head>
<body>
<h3>Create | Lead</h3>
<form action="savebill" method="post">
<pre>
FirstName:<input type="text" name="firstName" value="${contact.firstName }"/><!--id should match with entity class-->
LastName:<input type="text" name="lastName" value="${contact.lastName }"/>
Email:<input type="text" name="email" value="${contact.email }"/>
Mobile:<input type="text" name="mobile" value="${contact.mobile }"/>
ProductName:<input type="text" name="productname">	
Amount:<input type="text" name="amount">
	<input type="submit" value="Generate Bill">	
</pre></form>
</body>
</html>