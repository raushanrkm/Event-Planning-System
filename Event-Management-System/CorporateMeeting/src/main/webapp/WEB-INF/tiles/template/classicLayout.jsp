<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title><tiles:insertAttribute name="title" /></title>

<link href="<spring:url value="/resources/css/Style.css"></spring:url>" type="text/css" rel="stylesheet" />

</head>
<body>
	<div class="header">
		<tiles:insertAttribute name="heading" />
	</div>
	<div class="menu">
		<ul>
			<tiles:insertAttribute name="navigation" />
		</ul>
	</div>
<div class="tagline">
<tiles:insertAttribute name="tagline" />
</div>
	<div class="body">

		<tiles:insertAttribute name="body" />
	</div>
	<div class="footer">
		<tiles:insertAttribute name="footer" />
	</div>

</body>
</html>