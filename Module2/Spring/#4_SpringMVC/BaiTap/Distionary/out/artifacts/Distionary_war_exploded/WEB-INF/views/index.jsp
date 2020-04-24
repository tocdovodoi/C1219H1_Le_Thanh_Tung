<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 15/04/2020
  Time: 9:27 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Từ điển đơn giản</title>
</head>
<body>
<form action="/dictionary" method="post">
    <label>Vietnamese dictionary</label>
    <br>
    <input type="text" name="name" value="${name}" id="word">
    <input type="submit" value="search" >
</form>
<h2>Từ ${name} có nghĩa là:${word}</h2>
</body>
</html>
