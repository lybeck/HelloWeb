<%-- 
    Document   : response
    Created on : 12-Mar-2013, 09:52:25
    Author     : llybeck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="upper.jspf" %>


<jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
<jsp:setProperty name="mybean" property="name" />
<h3>Hello, <jsp:getProperty name="mybean" property="name" />!</h3>

<%@include file="lower.jspf" %>
