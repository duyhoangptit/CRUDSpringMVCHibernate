<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <fieldset>
        <legend>User Information</legend>
        <s:form method="post" commandName="user" action="insert">
            <table cellspacing="2" cellpadding="2">
                <tr>
                    <td>Username</td>
                    <td><s:input path="username"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><s:password path="password"/></td>
                </tr>
                <tr>
                    <td>Fullname</td>
                    <td><s:input path="fullName"/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><s:input path="email"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><input type = "submit" value="Register"/></td>
                </tr>
            </table>
        </s:form>
    </fieldset>
</body>
</html>
