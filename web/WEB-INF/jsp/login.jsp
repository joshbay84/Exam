<%--
  Created by IntelliJ IDEA.
  User: joshuaantony
  Date: 12/7/14
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title></title>
</head>
<body>
This is login page. As can be seen, its totally decoupled to any server side components. All this specifies
is the path and commandName. path indicates the property in the Modal that nees to be set.
  <spring:form commandName="loginObj">
    <spring:input path="userName"/>
    <spring:input path="password"/>
    <spring:input path="confirmPassword"/>
    <input type="submit" value="login"/>
  </spring:form>

</body>
</html>
