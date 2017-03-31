
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>
</head>
<body>
	<section>
		<div>
			<div>
	   			<h1> Payment</h1>
	   		</div>
	   	</div>
	
	</section>
	
	<section>
		<form:form modelAttribute="payment" action="goPayment" method="post">
			<div>
				<form:errors path="*" style = "color:red"/>
			</div>
			<div>
				<label for="id"><spring:message code="payment.form.id.label"/></label>
				<form:input type="text" path="id"/>
			</div>>
			<div>
				<label for="paymentMethod"><spring:message code="payment.form.paymentMethod.label"/></label>
				<form:input type="text" path="paymentMethod"/>
				<form:errors path="paymentMethod" style = "color:red"/>
			</div>>
			<div>
				<label for="amount"><spring:message code="payment.form.amount.label"/></label>
				<form:input type="text" path="amount"/>
				<form:errors path="amount" style = "color:red"/>
			</div>>
		</form:form>>
	</section>
</body>
</html>