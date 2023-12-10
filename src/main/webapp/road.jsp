<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<input type="button" value="新增" id="add"><br>
<hr>
<table border="1" cellspacing="0" width="80%">
    <tr>
        <th>车辆ID</th>
        <th>车辆行驶费用（元）</th>
        <th>车辆行驶里程（千米）</th>
        <th>操作</th>
    </tr>


    <c:forEach items="${roadList}" var="road" varStatus="status">
        <tr align="center">
            <td>${road.id}</td>
            <td>${road.money}</td>
            <td>${road.roadHaul}</td>

            <td><a href="/demo2/selectByIdUpdateServlet?id=${road.id}">修改</a>
                <a href="/demo2/selectByIdDeleteServlet?id=${road.id}">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>
<script>
    document.getElementById("add").onclick = function (){
        location.href = "addRoad.jsp"
    }
</script>

</body>
</html>