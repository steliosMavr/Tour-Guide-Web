



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <link rel="stylesheet" href="view/MyCss/css/Adminpage.css">
        <title>Admin Page</title>

    </head>
    <body>
         <jsp:include page="Header.jsp"></jsp:include>
         <jsp:include page="Sidebar.jsp"></jsp:include>
        

        <c:if test="${sessionScope.user != 'true'}">
            <c:redirect url="LoginForm.jsp"/>
        </c:if>

       
         <div class="main_content">
             
             asdsdsd
             
         </div>
   

    </body>
</html>
