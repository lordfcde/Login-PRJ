<%-- 
    Document   : suaLoai
    Created on : Jan 29, 2026, 1:34:52 PM
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
         <h1>Update Human Type</h1>
        <form class="form-horizontal"  method="post" action="update_loai">
            <div class="form-group">
                <label class="control-label col-sm-2" for="id">ID:</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" id="id" name ="id" placeholder="Enter id"
                           value ="${requestScope.ud.typeId}" required=""  readonly=""/>
                           
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="name">Type Name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="name" name="name"  placeholder="Enter Name"
                          value ="${requestScope.ud.typeName}"  required="">
                </div>
            </div>


            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Save to Database</button>
                </div>
            </div>
                <input type="hidden" value ="${requestScope.ud.typeId}">
                <div><!-- comment -->
                   
        </form>
    </body>
</html>
