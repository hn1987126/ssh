<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>表单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/form3.action" method="post">
    <input name="username" type="text"/><br/>
    <input name="password" type="text"/>
    <input type="submit" value="提交"/>

</form>
</body>
</html>
