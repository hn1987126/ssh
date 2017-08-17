<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>表单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/form4.action" method="post">
    <input name="user.username" type="text"/><br/><br/>
    <input name="user.password" type="text"/><br/><br/>
    Book<input name="book.bookname" type="text"/>
    <input type="submit" value="提交"/>

</form>
</body>
</html>
