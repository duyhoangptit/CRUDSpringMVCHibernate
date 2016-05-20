<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User Page</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/add">Register</a>
<table cellpadding="2" cellspacing="2" border="1">
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Fullname</th>
        <th>Email</th>
        <th>Option</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.fullName}</td>
            <td>${user.email}</td>
            <td><a href="${pageContext.request.contextPath}/delete/${user.username}"
                   onclick="return confirm('Are you ok?')">Delete</a>|
                <a href="${pageContext.request.contextPath}/edit/${user.username}">Update</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
