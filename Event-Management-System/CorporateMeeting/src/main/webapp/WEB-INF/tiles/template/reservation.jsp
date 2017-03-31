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
	<h2>Reservation</h2>
	<div id=reservation>
		<label><spring:message code="reservation.form.totalCost.label"/> "${reservation.totalCost}"</label>
	</div>
	<div>
		<form:form modelAttribute="reservation">
			<input type="hidden" name="_flowExecutionKey"
				value="${flowExecutionKey}" />
			<input type="submit" value=Back name="_eventId_backToDetailPage" />
			<input type="submit" value="Pay & Confirm"
				name="_eventId_reservationConfirmed" />
			<input type="submit" value="cancel" name="_eventId_cancelled" />
		</form:form>
	</div>
</body>
</html>