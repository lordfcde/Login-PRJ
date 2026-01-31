<%-- 
    Document   : hinhtron
    Created on : Jan 19, 2026, 2:08:41 PM
    Author     : vinhh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="menu.jspf" %>
    
     
        <h1>Tính toán hình tròn </h1>
        <form method="post" action="TinhHinhTron">
            <p>Bán kính</p>
            <input type ="number" name="radius"  >
            <p>
                <input type="submit" value="Tính toán">
            </p>
        </form>
</html>
