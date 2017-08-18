<%--
  Created by IntelliJ IDEA.
  User: chenyi9
  Date: 2017/8/17
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <%--el表达式取--%>
    <c:forEach items="${list}" var="user">
        ${user.username}
        ${user.password}
    </c:forEach>

    <%--ognl获取context里的数据，写ognl时需要写#，写#context中key的名称.域对象名称--%>
    <s:property value="#request.hahaname"></s:property>

    <%-- ognl表达式%的使用--%>
    <%--想得到Action中的 request.setAttribute("hahaname", "cjh"); 设置的值 --%>
    <s:textfield name="usname" value="%{#request.hahaname}"/>
    <%--这两个是一样的--%>
    <input type="text" name="usname2" value="${request.hahaname}"/>

    <%--使用struts标签查看值栈结构--%>
    <%--<s:debug></s:debug>--%>

    <s:form >
        <%--文本框--%>
        <s:textfield name="n" label="姓名"></s:textfield>
        <%--密码--%>
        <s:password name="p" label="密码"></s:password>
        <%--单选输入项--%>
        <s:radio list="{'女','男'}" name="sex" label="性别"></s:radio>
        <s:radio list="#{'nv':'女','nan':'男'}" name="sex" label="性别"></s:radio>
        <%--复选输入框--%>
        <s:checkboxlist list="{'女','男'}" name="sex" label="性别"></s:checkboxlist>
        <%--下拉列表--%>
        <s:select list="{'女','男'}" name="sex" label="性别"></s:select>
        <%--上传--%>
        <s:file name="file" label="上传附件"></s:file>
        <%--隐藏域--%>
        <s:hidden name="hid" value="abcd"></s:hidden>
        <%--文本域--%>
        <s:textarea rows="10" cols="20" name="resume" label="文本域"></s:textarea>
        <%--提交按钮--%>
        <s:submit value="提交"></s:submit>
        <%--重置按钮--%>
        <s:reset value="重置"></s:reset>


    </s:form>

</body>
</html>
