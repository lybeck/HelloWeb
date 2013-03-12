<%-- 
    Document   : index
    Created on : 12-Mar-2013, 09:43:31
    Author     : llybeck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="upper.jspf" %>

<h3>Entry Form</h3>

<form name="Name Input Form" action="response.jsp">
    Enter your name:
    <input type="text" name="name" />
    <input type="submit" value="OK" />
</form>

<%@include file="lower.jspf" %>
