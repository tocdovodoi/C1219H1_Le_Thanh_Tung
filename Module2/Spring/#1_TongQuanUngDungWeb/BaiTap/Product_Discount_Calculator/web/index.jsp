<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 09/04/2020
  Time: 8:45 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product Discount Calculator</title>
<%--  <link rel="stylesheet" type="text/css" href="crc/style.css" />--%>
  <style>
    #content{
      width: 450px;
      margin: 0 auto;
      padding: 0px 20px 20px;
      background: white;
      border: 2px solid navy;
    }

    h1{
      color: navy;
    }

    label{
      width: 10em;
      padding-right: 1em;
      float: left;
    }

    #data input{
      float: left;
      width: 15em;
      margin-bottom: .5em;
    }

    #buttons input{
      float: left;
      margin-bottom: .5em;
    }
    br{
      clear: left;
    }
  </style>
</head>
<body>
<div id="content">
  <h1>Product Discount Calculator</h1>
  <form action="/calculator" method="post">
    <div id="data">
      <label>Product Description:</label>
      <input type="text" name="description"/><br/>
      <label>List Price:</label>
      <input type="text" name="price"/><br/>
      <label>Discount Percent:</label>
      <input type="text" name="discount"/>(%)<br/>
    </div>
    <div id="buttons">
      <label>&nbsp;</label>
      <input type="submit" value="Calculate Discount"/>
    </div>
  </form>
</div>
</body>
</html>
