<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H1>id已存在！</H1>

<input type="button" value="新增" id="add"><br>

<script>
    document.getElementById("add").onclick = function (){
        location.href = "addRoad.jsp"
    }
</script>
</body>
</html>
