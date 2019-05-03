<%-- 
    Document   : newjsp1
    Created on : May 8, 2017, 11:11:37 PM
    Author     : stelios
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Upload Image</title>
    </head>
    
    <body>
    
        <b>Upload | <a href="view.jsp">View</a></b><br/><br/>
        
        <form action="NewServlet" method="post" enctype="multipart/form-data">
            <input type="file" name="image" required="required"/><br/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
