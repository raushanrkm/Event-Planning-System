<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/raushanjs/datepicker.js"/>"></script>
</head>
<body>


${reservation.totalCost }

<form:form modelAttribute="reservation" >
	<form:input id="datepicker" path="Schedule.date" />

<%-- <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/> --%>
	<input type="submit" id="AvailableVenue" value="AvailableVenue"
		name="_eventId_datePicked" />
	<button type="submit" value="cancel" name="_eventId_cancelled" >Cancel</button>
</form:form>

</body>
</html>