<%-- 
    Document   : Login
    Created on : Jan 29, 2026, 2:30:55 PM
    Author     : vinhh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="Style/login.css"/>
    </head>
 
    
    <body>

<h2>Login Form</h2>

<form action="MainController?action=dn" method="post">
  <div class="imgcontainer">
    <img src="https://bhd.1cdn.vn/thumbs/600x315/2024/10/25/cover(1).jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pwd" required>
        
    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container">
       
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
    <c:if test="${not empty requestScope.err}">
        <div class="container" style="background-color:#f1f1f1"><!-- comment -->
            <p style = "color: red">${requestScope.err}</p>
            </div>        
    </c:if>
 
</form>

</body>
</html>
