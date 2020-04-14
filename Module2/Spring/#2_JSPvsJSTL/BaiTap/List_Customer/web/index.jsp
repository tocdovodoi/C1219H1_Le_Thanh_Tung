<%@ page import="java.util.List" %>
<%@ page import="controller.Customer" %><%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 10/04/2020
  Time: 11:37 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sách Khách Hàng</title>
</head>
<body>
<%
    List<Customer> list = Customer.getList();
    request.setAttribute("listCustomers", list);
%>
<div class="container">
    <h2>Danh Sách Khách Hàng</h2>
    <table>
        <thead>
        <tr>
            <th>Họ Tên</th>
            <th>Ngày Sinh</th>
            <th>Địa Chỉ</th>
            <th>Hình Ảnh</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="cus" items="${listCustomers}">
            <tr>
                <td><c:out value="${cus.name}"></c:out></td>
                <td><c:out value="${cus.birthday}"></c:out></td>
                <td><c:out value="${cus.address}"></c:out></td>
<%--                <td><img src="https://static.gamehub.vn/img/files/2018/05/15/GameHubVN-top-nhung-cai-nhat-cua-cac-nhan-vat-trong-anime-manga-p2-1.jpg" width="100px" height="100px"></td>--%>
                <td><img src="static/image/1.jpg" width="100px" height="100px"></td>
<%--                Mặc định thư mực static để chứa tài nguyên--%>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
