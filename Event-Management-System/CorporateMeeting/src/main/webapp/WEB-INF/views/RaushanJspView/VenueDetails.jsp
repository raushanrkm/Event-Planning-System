<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="venueDetails">
<div>
<c:set var=image value="${hall.id}"></c:set>
<img alt="HallImage" src="/resource/img/raushanimage/${image}.jpg"/> 
</div>
<p>Hall Name= ${hall.name} </p>
<p>Hall Capacity=${hall.capacity}</p>
<p>Venue Name=${hall.Venue }</p>
<p>Facilites=${hall.facilaties}</p>
<p>Base Cost=${hall.cost}</p>
<p>Hall Adress:${hall.address}</p>
<div>
<input type="submit" value="Back">
<input type="submit" value="BooK">


</div>
</div>



</body>
</html>