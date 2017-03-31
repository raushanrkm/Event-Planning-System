<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="reservation">
		<form:select id="hall" path="hall.id">
			<form:option value="0" label="--Select hall list" />
			<form:options items="${hallList}" itemLabel="hallname" itemValue="id" />
		</form:select>
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		<input type="submit" id="ShowDetail" value="ShowDetail"
			name="_eventId_venueSelected" />
		<input type="submit" value="Back" name="_eventId_backToDatePickerPage"/>
		<input type="submit" value="cancel" name="_eventId_cancelled"/>
	</form:form>
</body>
</html>