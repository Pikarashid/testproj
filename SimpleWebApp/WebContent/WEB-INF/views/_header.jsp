<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<div style="background-image: url('img/img13.jpg'); height: 55px; padding: 5px;">
  <div style="float: left">
     <h1>~ Hello There Welcome ~</h1>
  </div>
 
  <div style="float: right; padding: 10px; text-align: right; color: pink;">
 
     <!-- User store in session with attribute: loginedUser -->
     Hello <b>${loginedUser.userName}</b>
   <br/>
     Search <input name="search">
 
  </div>
 
</div>