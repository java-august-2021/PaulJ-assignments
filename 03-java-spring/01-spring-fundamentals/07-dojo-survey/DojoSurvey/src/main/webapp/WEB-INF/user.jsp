<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Submitted Info:</h1>
<p>Name: <c:out value="${your_name}"/></p>
<p>Dojo Location:<c:out value="${location}"/></p>
<p>Favorite Language: <c:out value="${language}"/></p>
<p>Comments: <c:out value="${description}"/></p>
<a href="/"><button>Go Back</button></a>
</body>
</html>