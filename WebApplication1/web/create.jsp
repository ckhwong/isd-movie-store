<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<link href="CSS/zhuce.css" rel="stylesheet" type="text/css">
</head>
<body>
  <div id="container">
  　 <div id="top">
      <span id="tit_name">Register</span>
     </div>
     
     
     
     <div id="loginbox">
      <form method="post" action="Register">
        <p style="font-size:16px; font-weight:bold">Username：</p>
        <input type="text" style="width:350px; height:50px; border:1px solid #CCC" id="username" name="username" /><br/>
        <span style="border:2px solid #CCC; background:#F66; line-height:26px; font-size:14px" id="userNameSpan">Username cannot be empty！</span>
        <p style="font-size:16px; font-weight:bold">Password：</p>
        <input type="password" style="width:350px; height:50px; border:1px solid #CCC" id="passwordone" name="passwordone" /><br/>
        <span style="border:2px solid #CCC; background:#F66; line-height:26px; font-size:14px" id="userNameSpan">Password can not more than 20！</span>
        <p style="font-size:16px; font-weight:bold">Confirm Password：</p>
        <input type="text" style="width:350px; height:50px; border:1px solid #CCC" id="passwordtwo" name="passwordtwo" />
        <p style="font-size:16px; font-weight:bold">Phone Number：</p>
        <input type="text" style="width:350px; height:50px; border:1px solid #CCC" id="mail" name="email" /><br/>
        <span style="border:2px solid #CCC; background:#F66; line-height:26px; font-size:14px" id="userNameSpan">Please enter vaild Phone Number！</span>
        <p style="font-size:16px; font-weight:bold"></p>    
        <input type="submit" style="width:150px; height:60px; background:#06F"  value="Sumbit" id="buttontwo" name="buttontwo" /><br/>
        
        </form>
     </div>
      
  </div>
</body>
</html>
