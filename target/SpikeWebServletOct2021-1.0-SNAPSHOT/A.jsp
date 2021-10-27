<%--
  Created by IntelliJ IDEA.
  User: giovanna
  Date: 27/10/21
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Page A</title>
</head>
<body>
<h1>AAAAAAAAAAAAAAAAAA</h1>
<p><%=request.getAttribute("msg")%></p>
<form action="<%=request.getContextPath()%>/ServletController" method="post"/>
<input type="submit" name="action" value="pageA">
<input type="submit" name="action" value="pageB">
<input type="submit" name="action" value="home">
</form>
</body>
</html>
