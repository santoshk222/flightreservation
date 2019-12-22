<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:set var="base" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="userMenu.jsp"></jsp:include>
<title>Login</title>
</head>
<body>
<form action="login" method="post" onsubmit="return validateLogin()" name="frm">
<h3>${msg }</h3>
<pre>
User name: <input type="text" name="username"/>
Password: <input type="text" name="password"/>
<input type="submit" value="Login"/>
</pre>
</form>
</body>
</html>