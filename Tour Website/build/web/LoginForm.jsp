<%-- 
    Document   : LoginForm
    Created on : Apr 20, 2017, 8:26:44 PM
    Author     : stelios
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>


<html>
    <head>
        <title>Login Form</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="view/MyCss/css/loginform.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    </head>
    <body>

        <form method="POST" action="LoginServlet">

            <div class="imgContainer">
                <img src="view/MyCss/images/login.png"  alt="Avatar" class="avatar">
            </div>

            
                <div class="form-group">
                    <label>Username:</label>
                    <input type="text" class="form-control"  placeholder="Enter Username" name="userName">
                </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
                </div>
             <div class="form-group">
                <button type="submit" class="btn btn-default" id="bttn">Submit</button>
             </div>

        </form>



    </body>
</html>

