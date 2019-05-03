
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>  
    <link rel="stylesheet" href="view/MyCss/css/Sidebar.css"/>
</head>


<div class="sidebar">
    <ul id="nav">
        <li ><a class="list" onclick="changeContent('Dashboard')"   href="AdminPage.jsp">Dashboard</a></li>
        <li>
            <a  class="list">Database &#9662</a>           
            <ul class="dropdown">
                <li data-type="databaseUpdate"><a href="<c:url value="/DatabaseShow?action=load"/>">Database Update Panel</a></li>
                <li><a  href="DatabaseConfig.jsp">Database Config Panel </a></li>
                <li><a id="DatabaseShow" href="<c:url value="/DatabaseShow?action=show"/>" >Database Show   Panel</a></li>

            </ul>
        </li>
    </ul>

</div>
