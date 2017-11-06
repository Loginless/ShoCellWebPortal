<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Registration Form</title>
</head>
<body>
<h1>User Information</h1>
<form name="Name Input Form" action="/RegistrationController" method="get">
    Enter Login:
    <input type="text" name="userLogin" value=""/>
    Enter Password:
    <input type="text" name="userPassword" value=""/>
    <input type="submit" value="OK" />
</form>
</body>