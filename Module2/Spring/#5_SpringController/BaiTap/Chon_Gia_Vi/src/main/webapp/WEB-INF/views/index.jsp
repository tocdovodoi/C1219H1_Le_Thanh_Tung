<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 22/04/2020
  Time: 10:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8" %>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>Sandwich Condiment</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="save", method="post">
    <label>
        <input type="checkbox" name="condiment" value="Lettuce" >Lettuce
    </label>
    <label>
        <input type="checkbox" name="condiment" value="Tomato">Tomato
    </label>
    <label>
        <input type="checkbox" name="condiment" value="Mustard">Mustard
    </label>
    <label>
        <input type="checkbox" name="condiment" value="Sprouts">Sprouts
    </label>
    <br>
    <input type="submit" value="Save">
</form>
</body>
</html>
