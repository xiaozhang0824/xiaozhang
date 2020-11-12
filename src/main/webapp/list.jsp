<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/8/21
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>商品名称</td>
        <td>商品规格</td>
        <td>商品价格</td>
        <td>商品类型</td>
        <td>商品数量</td>
        <td>购买数量</td>
    </tr>
    <c:forEach items="${list}" var="goods" varStatus="var">
    <tr>
        <td>${goods.gid}
        <input type="checkbox" name="goodsList[${var.index}].gid" value="${goods.gid}">
        </td>
        <td>${goods.gname}</td>
        <td>${goods.guige}</td>
        <td>${goods.gprice}</td>
        <td>${goods.tname}</td>
        <td>${goods.gcount}</td>
        <td><input type="text" name="goodsList[${var.index}].buyCount"></td>
    </tr>
</table>
</body>
</html>
