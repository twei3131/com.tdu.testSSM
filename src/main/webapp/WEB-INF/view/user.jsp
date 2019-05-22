<%--
  Created by IntelliJ IDEA.
  User: twei3131
  Date: 2019-05-22
  Time: 09:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<button id="btn">action</button>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
    $("#btn").on('click',function () {
        $.post('<%=request.getContextPath()%>/user/getUserById.action',{"uid":"${uid}"},function (data) {
            var obj = data;
            alert(obj.nick)
        });
    });
</script>
</body>
</html>
