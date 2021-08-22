<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
 <script type="text/javascript" src="js/app.js"></script>
</head>
<body>
<c:set var="now" value="<%=new java.util.Date()%>" />
<p><fmt:formatDate type = "date" pattern="EEEE" value = "${now}" />, the <fmt:formatDate type = "date" pattern="dd" value = "${now}" /> of <fmt:formatDate type = "date" pattern="MMMM" value = "${now}"/>, <fmt:formatDate type = "date" pattern="YYYY" value = "${now}"/></p>
</body>
</html>