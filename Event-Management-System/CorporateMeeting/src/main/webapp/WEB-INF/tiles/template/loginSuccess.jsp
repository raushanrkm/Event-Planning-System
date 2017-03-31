<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>

<h2>Welcome  ${name }</h2>
<form action="<spring:url value="/checkin"></spring:url>" method="post">
<div>
<input type="submit" value="Start New Reservation"/>
</div>
</form>
