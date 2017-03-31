<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<select>
<option value="">--Hall--Capcity--Venue--</option>

<c:forEach items="${hallList}" var="item">
<option value= "${item.id}"> "${item.hall}" + "--"+ "${item.capacity}"+ "--" +"${item.venue}"</option>
</c:forEach>
</select>
<input type="submit" id="ShowDetail" value="ShowDetail"/>
</body>
</html>