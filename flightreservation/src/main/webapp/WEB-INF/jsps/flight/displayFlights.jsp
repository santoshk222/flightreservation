<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:set var="base" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"  type="text/css" href="${base}/css/style.css">
<title>Available Flights</title>
</head>
<body>
<table class="minimalistBlack">
<tr>
<th>flight Name </th>
<th>operating Airlines</th>
<th> arrival City  </th>
<th>departure City </th>
<th>date Of Departure </th>
<th>estimated DepartureTime </th>
<th><a href="selectFlight">Select</a></th>
</tr>
<c:forEach items="${flightsList }" var="flight">
<tr>
<td>${flight.flightName }</td>
<td>${flight.operatingAirlines }</td>
<td> ${flight.arrivalCity } </td>
<td>${flight.departureCity }</td>
<td>${flight.dateOfDeparture }</td>
<td>${flight.estimatedDepartureTime }</td>
<td><a href="selectFlight">Select</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>