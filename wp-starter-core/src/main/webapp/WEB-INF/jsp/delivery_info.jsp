<%--
  Created by IntelliJ IDEA.
  User: Win 8
  Date: 26.11.2016
  Time: 01:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delivery Info</title>
</head>
<body>
    <form action="placeOrder" method="GET">
        <label>Name: </label>  <input type="text" name="clientName"/>  <br>
        <label>Address: </label>  <input type="text" name="clientAddress"/> <br>
        <br>
        <button>Submit</button>
    </form>
</body>
</html>
