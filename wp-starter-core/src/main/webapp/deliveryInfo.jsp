<%--
  Created by IntelliJ IDEA.
  User: Win 8
  Date: 20.11.2016
  Time: 00:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Delivery Info</h1>
    <form action="/AddressInfo.do" method="post">
        <label>Name: </label><input type="text" name="name"/>  <br>
        <label>Address: </label><input type="text" name="clientAddress"/> <br>
        <br>
        <button>Submit</button>
    </form>
</body>
</html>
