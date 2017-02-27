<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Win 8
  Date: 26.11.2016
  Time: 01:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza sizes</title>
</head>
<body>
    <form action="delivery" method="GET">
        <c:forEach items="${pizzaTypes}" var="i">
            <input type="radio" name="pizzaType" value="${i}"/> ${i} <br>
        </c:forEach>
        <br>
        <button>Submit</button>
    </form>

</body>
</html>
