<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/17
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
    Welcome to you,${requestScope.name}<%--在request里面获取name做键的值--%>
<%--转发利用requestScope.name获取；重定向利用param.name获取--%>
    ${sessionScope.sessionxyz}<br>
    ${requestScope.modelxyz}
    ${sessionScope.model.name}<br>
    ${requestScope.xm.name}
    ${requestScope.name}<br>
    ${requestScope.string}
</body>
</html>
