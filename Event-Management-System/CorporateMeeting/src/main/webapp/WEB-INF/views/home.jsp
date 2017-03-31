<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>Home</title>
	
</head>
<body>
<a href="?language=en_US">English</a> | <a href="?language=en_NP">Nepali</a>
<h1>
<spring:message code="Greetings" ></spring:message> ${name }
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
