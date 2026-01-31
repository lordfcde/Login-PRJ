<%-- 
    Document   : index
    Created on : Jan 19, 2026, 2:03:03 PM
    Author     : vinhh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="container">
            <div class="jumbotron">
                <h1>This is Human Type</h1>
                <h1>Welcome to Saigons</h1>
                <table class="table table-striped">
                    <tr>
                        <td>Type ID</td>
                        <td>Type name</td>   

                    </tr>
                    <!-- For each là sử dụng c: var là khai báo dữ liệu , items là theo Expression Language -->
                    <!--  requestScope đây là bộ nhớ chỉ dùng trong vòng lặp hết tác vụ là clear bo nho-->
                    <c:forEach var="i" items="${requestScope.ds}">
                        <tr>  
                            <td>${i.typeId}</td>
                            <td>${i.typeName}</td>
                            <td>
                                <c:url var = "urlUpdate" value = "update_loai?typeId=${i.typeId}"></c:url>
                                <a href="${urlUpdate}" class="btn btn-primary">Update                                                                    
                               </a>
                                <c:url var="lkDelete" value = "xoa_loai?typeId=${i.typeId} "></c:url>
                                <a href="${lkDelete}"class="btn btn-danger" onclick="return confirm('Are u sure my bro ;')">
                                    Delete</a>
                            </td>
                        </tr>

                    </c:forEach>


                </table>
            </div>

        </div>

    </body>

</html>
