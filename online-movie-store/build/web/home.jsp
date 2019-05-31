<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="wsd.controller.*"%>
<!DOCTYPE html>
<html>
    
    <head>
        <title>Online Movie Store</title>
        <link  rel="stylesheet" href="button.css">
        <style type="text/css">
        #head {
	height: 230px;
	width: 100;
	background-color: #CC9933;
	text-align: center;
	position: relative;
        }
        .title {
	font-family: "Arial";
	color: #FFFFFF;
	position: absolute;
	top: 10%;
	left: 50%;
	transform: translate(-50%, -50%);  
	font-size: 36px;
	height: 40px;
	width: 30%;}
        
        #foot {
	width: 100;
	height: 126px;
	background-color: #CC9933;
	position: relative;
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
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/demo.css">
        <script type="text/javascript" src="js/script.js"></script>
        <title>Home Page</title>       
    

    </head>
    <div class="header" id="head">
   <div class="title">Online Movie Store
   <a class="navbar-brand" href="/">
                        
    <img style="display:block; margin:0 auto;" src="images.jpeg" height="150" width="300"> <br>
                    </a>
   </div>
	
  </div>
   
   <body background="bg.jpg" >
                    
     
        
<div id="navigator">
<p class="button"><a href="login.jsp">Log in</a></p>
<p class="button"><a href="register.jsp">Register</a></p>
<p class="button"><a href="movies.jsp">Movies</a>
</div>
          &nbsp;
          
        
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