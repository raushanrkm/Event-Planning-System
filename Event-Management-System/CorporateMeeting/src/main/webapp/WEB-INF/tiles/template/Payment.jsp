<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<label> paymetMethod: </label> <select>
			<option value=''>---Select PaymentMethod---</option>
			<option value='credit'>credit</option>
			<option value='debit'>debit</option>
		</select>
		<div>
			<form:form modelAttribute="reservation">
				<input type="hidden" name="_flowExecutionKey"
					value="${flowExecutionKey}" />
				<input type="submit" value="Back" name="_eventId_backToReservation" />
				<input type="submit" value="Done" name="_eventId_paymentConfirmed" />
				<input type="submit" value="cancel" name="_eventId_cancelled"/>
			</form:form>
		</div>
	</div>
</body>
</html>