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
	<form action="/user">
        <label for="your_name">Your Name</label>
        <input type="text" id="your_name" name="your_name">

        <p>Dojo Location</p>
        <select name="location">
            <option value="Charlotte">Charlotte</option>
            <option value="Chicago">Chicago</option>
            <option value="San Jose">San Jose</option>
        </select>

        <p>Favorite Language</p>
        <select name="Language">
            <option value="Java">Java</option>
            <option value="Python">Python</option>
            <option value="MERN">MERN</option>
        </select>

        <p>Comment (optional)</p>
        <textarea name="description"></textarea>

        

        <input type="submit" value="submit">
    </form>
</body>
</html>