<%--
  Created by IntelliJ IDEA.
  User: 天下共主
  Date: 2019/12/12
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<span>用户登录</span>
<form action="check_Users.do" method="post">
    用户名：<input type="text" name="uname" id="uname"/><br/>
    密码：<input type="password" name="passwd" id="passwd"/><br/>
    <input type="submit" value="登录"/><br/>
</form>
</body>
</html>
