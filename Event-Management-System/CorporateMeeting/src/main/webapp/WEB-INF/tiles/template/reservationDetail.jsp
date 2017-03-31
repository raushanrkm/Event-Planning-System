<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your reservation details:</h1>
	<div>
	<p>
	<label><spring:message code="reservationDetail.form.customer.label"/> '${reservation.customer}'</label>
    <label><spring:message code="reservationDetail.form.hall.label"/> '${reservation.hall}'</label>
    <label><spring:message code="reservationDetail.form.totalCost.label"/> '${reservation.totalCost}'</label>
	</p>
	</div>
</body>
</html>