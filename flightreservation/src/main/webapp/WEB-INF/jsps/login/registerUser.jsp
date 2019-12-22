<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="base" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>
<jsp:include page="userMenu.jsp"></jsp:include>
<script type="text/javascript" src="${base }/js/sk.js"></script>
</head>
<body>
<h2>Register as a new user</h2>
<h3><b>${msg }</b></h3>
<form action="saveUser" method="post" onsubmit="return validateForm()" name="frm">
<pre>
Firstname: <input type="text" name="firstname"/>
Last name: <input type="text" name="lastname"/>
Email: <input type="text" name="email"/>
Password: <input type="text" name="password"/>
Confirm Password: <input type="text" name="confirmPassword"/>
<input type="submit" value="Register"/>
</pre>
</form>
</body>
</html>