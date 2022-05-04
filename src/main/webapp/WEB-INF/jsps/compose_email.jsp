<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
<h3>compose email</h3>
<form action="/sendemail"method="post">
<pre>
Email Id:<input type="text" name="to" value="${email}"><!-- here we don't use lead.email -->

subject:<input type="text" name="subject">

<textarea  name="text" rows="10" cols="80">
</textarea>
<input type="submit" value="SendEmail">
</pre></form>
</body>
</html>