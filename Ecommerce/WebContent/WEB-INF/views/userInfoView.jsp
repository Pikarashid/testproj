<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>User Info</title>
    
    
 </head>
 
 <body>
 <body background = "images/flower.jpg">
    <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
 
    <h3>Hello: ${user.username}</h3>
 
    User Name: <b>${user.username}</b>
   
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>