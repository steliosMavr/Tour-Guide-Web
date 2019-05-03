

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>  
    <link rel="stylesheet" href="view/MyCss/css/Header.css"/>
</head>
<div id="header"> 
    <div class="logo"><a href="Main.jsp">Admin<span>Panel</span></a> </div>
    <a href="<c:url value="/LoginServlet?action=logout"/>">
    <img  src="view/MyCss/images/logout.png"  width="42" height="42" >
    </a>


</div>
