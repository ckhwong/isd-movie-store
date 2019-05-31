<%@page contentType="text/html" import="model.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="a.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>Welcome Page</title>
    </head> 
    <style type="text/css">
*{
	margin: 0;
	padding: 0;
}
#wrap {
	height: 719px;
	width: 100;
	background-image: url(4.jpg);
	background-repeat: no-repeat;
	background-position: center center;
	position: relative;
}
#head {
	height: 120px;
	width: 100;
	background-color: #CC9933;
	text-align: center;
	position: relative;
}
#foot {
	width: 100;
	height: 126px;
	background-color: #CC9933;
	position: relative;
}
#wrap .logGet {
	height: 408px;
	width: 368px;  
	position: absolute;
	background-color: #FFFFFF;
	top: 20%;
	right: 15%;
}
.logC a button {
	width: 100%;
	height: 38px;
	background-color: #ee7700;
	border: none;
	color: white;
	font-size: 18px;
}
.logE a button {
	width: 100%;
	height: 58px;
	background-color: #ee7700;
	border: none;
	color: red;
	font-size: 25px;
}
.logGet .logD.logDtip .p1 {
	display: inline-block;
	font-size: 28px;
	margin-top: 30px;
	width: 86%;
}
#wrap .logGet .logD.logDtip {
	width: 86%;
	border-bottom: 1px solid #ee7700;
	margin-bottom: 20px;
	margin-top: 0px;
	margin-right: auto;
	margin-left: auto;
}
.logGet .lgD img {
	position: absolute;
	top: 12px;
	left: 8px;
}
.logGet .lgD input {
	width: 100%;
	height: 20px;
	text-indent: 2.5rem;
}
#wrap .logGet .lgD {
	width: 86%;
	position: relative;
	margin-bottom: 5px;
	margin-top: 5px;
	margin-right: auto;
	margin-left: auto;
}
#wrap .logGet .logC {
	width: 86%;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
}
#wrap .logGet .logE {
	width: 86%;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
}
 
 
.title {
	font-family: "Arial";
	color: #FFFFFF;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);  
	font-size: 36px;
	height: 40px;
	width: 30%;
}
 
.copyright {
	font-family: "Arial";
	color: #FFFFFF;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);  
	height: 60px;
	width: 40%;
	text-align:center;
}
	
 
#foot .copyright .img {
	width: 100%;
	height: 24px;
	position: relative;
	

}
#foot .copyright p {
	height: 24px;
	width: 100%;
}
</style>

    <%
        User user = (User)session.getAttribute("userLogin");
        String log;
        if (user != null) {
           
            log =  user.getEmail() ;
        } else {
         
            log = " &lt " + "Guest User" + " &gt";
        }

    %>
     <body background="bg.jpg" >
      <% if(user != null) { %>
<div class="header" id="head">
  <div class="title">Online Movie Store</div>
 
</div>
<h2 class="outline">Welcome</h2> 
        <table width="100%" >
            <tr bgcolor="lightgrey" ><td align="right" class="outline">You are logged in as  <%=log%></td></tr>
            <tr><td align="right">
                    <%if (user != null) { %>
                   
                    <u><a class="link" href="home.jsp">Home</a></u> 
                        <%} else { %>
                    <u><a class="link" href="register.jsp">Register</a></u>
                        <%}%>
                    &emsp;<u><a class="link" href="logout.jsp">Logout</a></u>
                </td>
            </tr>                  
        </table>
                    
        <div class="wrap" id="wrap">
 <div class="logGet">
            
 
        
   <div class="logD logDtip">
    <p class="p1">Hello, <%= user.getEmail() %></p>
   </div>
                        <div class="lgD">
				Your ID is: <%= user.getID()%>
			</div>
                        &emsp;
                        <div class="lgD">
				Your email is : <%= user.getName()%>
			</div>
                        &emsp;
                        <div class="lgD">
				Your password: <%= user.getPassword()%>
			</div>
                        &emsp;
                        <div class="lgD">
				Your phone Number : <%= user.getPhone()%>
			</div>
                        &emsp;
                        <div class="lgD">
				Your Delivery Address : <%= user.getAddress()%>
			</div>
                                        
                       
                        &nbsp;
   
                       
        
       <%            
            session.setAttribute("user",user);
        %>
        
       
    <div class="logC">
    <a href='profile.jsp' target="_self"><button>User profile </button></a>
    </div> 
        
         <%}else{%>
        <body background="bg.jpg" >
<div class="header" id="head">
  <div class="title">Online Movie Store</div>
 
</div>
        <div class="wrap" id="wrap">
 <div class="logGet">
   <div class="logD logDtip">
    <p class="p1">User ID or password is wrong!</p>
   </div>
    <div class="logC">
    <a href='login.jsp' target="_self"><button>Login page </button></a>
    </div>
        <%}%> 
         &nbsp;
         
         </div>
         </div>
         <div class="footer" id="foot">
  <div class="copyright">
    <p>Online Movie Store &copy; 2019</p>
    <div class="img">
		<i class="icon"></i><span></span>
	</div>
	
	
 
 
  </div>
	
</div>
         </body>
</html>
