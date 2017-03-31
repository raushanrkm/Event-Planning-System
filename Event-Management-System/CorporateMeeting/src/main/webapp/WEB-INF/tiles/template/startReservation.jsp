<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Start New Reservation</h1>
	<div>
		<form:form modelAttribute="reservation">
			<input type="hidden" name="_flowExecutionKey"
				value="${flowExecutionKey}" />
			<input type="submit" value="Pick Date"
				name="_eventId_reservationStarted" />
			<input type="submit" value="cancel" name="_eventId_cancelled" />
		</form:form>
		<a href="<spring:url value="/loginSuccess"></spring:url>"><button>Go back To Home</button></a>
	</div>
</body>
</html>