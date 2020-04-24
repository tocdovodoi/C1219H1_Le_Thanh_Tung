<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><html>
<head>
    <title>Your Condiments</title>
</head>
<body>
<form action="save" method="get">
    <h1>Your Condiments</h1>
    <c:forEach items="${condimentsArr}" var="condiment">
       <c:out value="${condiment}"/><br>
     </c:forEach>
</form>
</body>
</html>
