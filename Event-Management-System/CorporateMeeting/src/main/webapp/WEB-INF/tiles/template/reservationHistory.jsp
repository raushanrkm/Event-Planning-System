<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>

		<h1>Reservation Detail</h1>
	<ul>
	
			<c:set var="tempo" value="/reservation/" />
			<c:forEach items= '${reservationList}' var = "reservation">
            
            <li>
           <%--   <c:set var="tempo" value="${tempo}${reservation.id}" /> --%>
            
             Reservation Date:
             <a href="<spring:url value="${tempo }${reservation.id}" ></spring:url>" > 
              
              <c:out value="${reservation.schedule.date}" />
             
              
              </a>
              
               </li>
			</c:forEach>
		</ul>	
	