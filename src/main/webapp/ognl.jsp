<%--
  Created by IntelliJ IDEA.
  User: chenyi9
  Date: 2017/8/17
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--用的是struts标签库，里面用的是ognl表达式--%>
    <s:property value="'haha'.length()"/>

    <%--获取字符串变量--%>
    <s:property value="uname"/>
    <%--获取对象--%>
    <s:property value="user.username"></s:property>
    <s:property value="user.password"></s:property>
    <%--获取 List--%>
    <s:property value="list[0].username"></s:property>
    <s:property value="list[1].username"></s:property>

    <%--遍历list集合--%>
    <s:iterator value="list">
        <s:property value="username"></s:property>
        <s:property value="password"></s:property>
    </s:iterator>

    <%--遍历list另外一种方式--%>
    <s:iterator value="list" var="user">
        <s:property value="#user.username"></s:property>
        <s:property value="#user.password"></s:property>
    </s:iterator>

    <%--获取set设置的值，是取那个name属性  stack.set("username", "ght"); --%>
    <s:property value="username"/>

    <%--获取push设置的值，  stack.push("chenyi"); --%>
    <s:property value="[0].top"/>

    <%--使用struts标签查看值栈结构--%>
    <%--<s:debug></s:debug>--%>
</body>
</html>
