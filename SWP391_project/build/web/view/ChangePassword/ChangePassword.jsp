<%-- 
    Document   : ChangePassword
    Created on : Oct 1, 2022, 11:05:38 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${empty isError}">
            <form action="./changePassword" method="post">
            New password: <input type="password" name="newPass"><br/>
            Confirm password: <input type = "password" name = "cfNewPass"><br/> 
            <input type="submit" value="CONFIRM">
        </form>
        </c:if>
        <c:if test="${not empty isError}">
            <p>Incorrect password</p>
            <form action="./changePassword" method="post">
            New password: <input type="password" name="newPass"><br/>
            Confirm password: <input type = "password" name = "cfNewPass"><br/> 
            <input type="submit" value="CONFIRM">
        </form>
        </c:if>
    </body>
</html>
