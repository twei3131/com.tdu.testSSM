<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录页面</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/LIB/AmazeUI/css/amazeui.css">
</head>
<body>
    <button type="button" class="am-btn am-btn-primary btn-loading-example">Submit - Button</button>
    <input type="button" class="am-btn am-btn-primary btn-loading-example" value="Submit - Input" />
    <script type="text/javascript" src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/LIB/AmazeUI/js/amazeui.js"></script>
    <script type="text/javascript">
        $('.btn-loading-example').on('click', function(){
            var $btn = $(this)
            $btn.button('loading');
            setTimeout(function(){
                $btn.button('reset');
                $.post('<%=request.getContextPath()%>/user/addUser.action',{"name":"123","pwd":"123"},function (data) {
                    var obj = JSON.parse(data);
                    alert(obj.result);
                })
            }, 5000);
        });
    </script>
</body>
</html>