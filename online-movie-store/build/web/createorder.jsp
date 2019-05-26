<%-- 
    Document   : createorder - 
    Created on : 18/05/2019, 6:42:03 PM
    Author     : Christopher Wong
--%>

<%@ page import="wsd.model.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Order</title>
<link href="CSS/zhuce.css" rel="stylesheet" type="text/css">
</head>
<body>
  <div id="container">
  　 <div id="top">
      <span id="tit_name">Create Order</span>
     </div>
     
     
     
     <div id="createorderbox">
      <form method="post" action="CreateOrder">
        <p style="font-size:16px; font-weight:bold">User ID：</p>
        <input type="text" style="width:350px; height:50px; border:1px solid #CCC" id="userID" name="userID" /><br/>
        <span style="border:2px solid #CCC; background:#F66; line-height:26px; font-size:14px" id="userNameSpan">Username cannot be empty！</span>
        
        <p style="font-size:16px; font-weight:bold">Email：</p>
        <input type="text" style="width:350px; height:50px; border:1px solid #CCC" id="email" name="email" /><br/>
        <span style="border:2px solid #CCC; background:#F66; line-height:26px; font-size:14px" id="userNameSpan"></span>
        
        <p style="font-size:16px; font-weight:bold">Delivery Type: </p>
         <select>
            <option value="pickup">Store Pick-Up: $0</option>
            <option value="delivery">Home Delivery: +$10</option>   
         </select> <br/>
        <span style="border:2px solid #CCC; background:#F66; line-height:26px; font-size:14px" id="userNameSpan">Please enter vaild Phone Number！</span>
        
        <p style="font-size:16px; font-weight:bold"></p>    
        <input type="submit" style="width:150px; height:60px; background:#06F"  value="Sumbit" id="buttontwo" name="buttontwo" /><br/>
        
        </form>
     </div>
      
  </div>
</body>
</html>
