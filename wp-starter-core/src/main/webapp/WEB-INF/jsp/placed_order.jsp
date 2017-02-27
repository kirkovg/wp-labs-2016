<%--
  Created by IntelliJ IDEA.
  User: Win 8
  Date: 26.11.2016
  Time: 02:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Placed Order</title>
</head>
<body>
    <h3>Order: </h3>
    <label>Pizza Type: </label>${order.pizzaType}    <br>
    <label>Client Name: </label>${order.clientName}    <br>
    <label>Client Address: </label>${order.clientAddress}    <br>
    <label>Order Id: </label>${order.orderId}    <br>
</body>
</html>
