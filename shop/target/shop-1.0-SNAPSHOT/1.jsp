<%--
  Created by IntelliJ IDEA.
  User: ĐỨC DUY
  Date: 17/11/2019
  Time: 05:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

out.println(request.getAttribute("username"));
out.println(request.getAttribute("age"));
%>
</body>
</html>
