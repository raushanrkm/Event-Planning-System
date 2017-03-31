<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="venueDetails">
		<div>
			<c:set var="image" value="${reservation.hall.id}"></c:set>
			<img alt="HallImage"
				src="/resource/images/${reservation.hall.id}.jpg" />
		</div>
		<label><spring:message code="VenueDetails.form.hallname.label"/> ${reservation.hall.hallname}</label>
		<label><spring:message code="VenueDetails.form.capacity.label"/> ${reservation.hall.capacity}</label>
		<label><spring:message code="VenueDetails.form.name.label"/> ${reservation.hall.venue.name }</label>
		<label><spring:message code="VenueDetails.form.cost.label"/> ${reservation.hall.cost}</label>
		<label><spring:message code="VenueDetails.form.address.label"/> ${reservation.hall.venue.address}</label>

		<div>
			<form:form modelAttribute="reservation">
				<input type="hidden" name="_flowExecutionKey"
					value="${flowExecutionKey}" />
				<input type="submit" value="BooK"
					name="_eventId_detailPageInfoCollected" />
				<input type="submit" value="Back" name="_eventId_backToVenueList" />
				<input type="submit" value="cancel" name="_eventId_cancelled" />
			</form:form>
		</div>
	</div>
</body>
</html>