<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>

    <div class="col-sm-6  border border-dark">
    <form action="/languages/edit" method="POST">
        {% csrf_token %}
        <div class="row">
        <label for="name" class="form-label col-md-4">Name</label>
        <input type="text" id="first_name" name="name">
        </div>
        <div class="row">
        <label for="creator" class="form-label col-md-4">Creator</label>
        <input type="text" id="creator" name="creator">
        </div>
        <div class="row">
        <label for="currentVersion" class="form-label col-md-4">Version</label>
        <input type="number" id="currentVersion" name="currentVersion">
        </div>
    </form>
    </div>
</body>
</html>