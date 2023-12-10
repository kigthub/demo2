<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>添加车辆信息</title>
</head>
<body>
<h3>添加车辆信息</h3>
<form action="/demo2/addServlet" method="post">
    车辆ID：<input name="id"><br>
    车辆行驶费用（元）：<input name="money"><br>
    车辆行驶里程（千米）：<input name="roadHaul"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>