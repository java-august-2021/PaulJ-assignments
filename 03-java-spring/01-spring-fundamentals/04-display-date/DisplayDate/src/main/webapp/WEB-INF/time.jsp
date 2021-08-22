<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time</title>
<link rel="stylesheet" type="text/css" href="css/style2.css">
<script type="text/javascript" src="js/app2.js"></script>
</head>
<body>
<c:set var="now" value="<%=new java.util.Date()%>" />
<p><fmt:formatDate type = "time" pattern="hh:mm aa" value = "${now}" /></p>
</body>
</body>
</html>