<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:set var="base" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%-- <jsp:include page="${base }/user/userMenu.jsp"></jsp:include> --%>
<title>Flight reservation</title>
</head>
<body>
<form action="${base }/searchFlight" method="post">
<pre>
From : <input type="text" name="from"/>
To : <input type="text" name="to"/>
Departure Date : <input type="text" name="departureDate"/>
<input type="submit" value="Search"/>
</pre>
</form>
</body>
</html>