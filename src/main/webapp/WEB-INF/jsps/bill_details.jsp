<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
</head>
<br>
<body>
<h3>Billing Details</h3>
	Id:${billing.id}
	<br> FirstName:${billing.firstName}
	<br> LastName:${billing.lastName}
	<br> Email:${billing.email}
	<br> LeadSource:${billing.leadSource}
	<br> Mobile:${billing.mobile }
	<br>ProductName:${billing.productName }
	<br>Amount:${billing.amount }

</body>
</html>