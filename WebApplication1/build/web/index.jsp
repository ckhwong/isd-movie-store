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
      <span id="tit_name">会员注册</span>
     </div>
     
     <div id="left">
       <img src="img/fruit.jpg" width="100%" height="100%"  alt="水果盛宴"/>
     </div>
     
     <div id="loginbox">
      <form method="post" action="Register">
        <p style="font-size:16px; font-weight:bold">会员名称：</p>
        <input type="text" style="width:350px; height:50px; border:1px solid #CCC" id="username" name="username" /><br/>
        <span style="border:2px solid #CCC; background:#F66; line-height:26px; font-size:14px" id="userNameSpan">用户名不能为空！</span>
        <p style="font-size:16px; font-weight:bold">登陆密码：</p>
        <input type="password" style="width:350px; height:50px; border:1px solid #CCC" id="passwordone" name="passwordone" /><br/>
        <span style="border:2px solid #CCC; background:#F66; line-height:26px; font-size:14px" id="userNameSpan">密码长度不能小于6位！</span>
        <p style="font-size:16px; font-weight:bold">确认密码：</p>
        <input type="text" style="width:350px; height:50px; border:1px solid #CCC" id="passwordtwo" name="passwordtwo" />
        <p style="font-size:16px; font-weight:bold">电子邮箱：</p>
        <input type="text" style="width:350px; height:50px; border:1px solid #CCC" id="mail" name="email" /><br/>
        <span style="border:2px solid #CCC; background:#F66; line-height:26px; font-size:14px" id="userNameSpan">请填写有效的电子邮箱！</span>
        <p style="font-size:16px; font-weight:bold"></p>    
        <input type="submit" style="width:150px; height:60px; background:#06F"  value="提交注册" id="buttontwo" name="buttontwo" /><br/>
        <p style="font-size:20px; font-weight:bold">我已注册，直接 <a href="denglu.jsp"><input type="button" style="width:100px; height:60px; background:#06F"  value="登 陆" id="buttonone" name="buttonone"/> </a></p>
        
        </form>
     </div>
      
  </div>
</body>
</html>
