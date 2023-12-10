<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>删除车辆信息</title>
</head>
<body>
<h3>删除车辆信息</h3>
<form action="/demo2/deleteServlet" method="post">

    车辆ID：<input name="id" value="${road.id}"><br>
    车辆行驶费用（元）：<input name="money" value="${road.money}"><br>
    车辆行驶里程（千米）：<input name="roadHaul" value="${road.roadHaul}"><br>

    <input type="submit" value="删除">
</form>
</body>
</html>