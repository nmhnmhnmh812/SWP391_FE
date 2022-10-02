<%-- 
    Document   : ConfirmAuthentication
    Created on : Oct 1, 2022, 9:33:22 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Happy Programming</title>
    </head>
    <body>
        <c:if test="${empty isError}">
            <form action="./ConfirmAuthentication" method="post">
            Your password: <input type="password" name="oldPass"><br/>
            
            <input type="submit" value="SAVE">
            </form>
        </c:if>
        <c:if test="${not empty isError}">
            <p>Incorrect password</p>
            <form action="./ConfirmAuthentication" method="post">
            Your password: <input type="password" name="oldPass"><br/>
            
            <input type="submit" value="SAVE">
            </form>
        </c:if>
    </body>
</html>
