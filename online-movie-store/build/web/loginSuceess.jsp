<%@page import="wsd.model.*"%>
<%@page import="wsd.model.dao.*"%>
<%@page import="wsd.controller.*"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Success Page</title>
    </head>
    <body>

        <%
            //Activate the database search-validate once DBManager functions are completed
            DBConnector connector  = new DBConnector();
            Connection conn = connector.openConnection(); 
            DBUserManager db = new DBUserManager(conn);
            
            int ID = Integer.parseInt(request.getParameter("ID"));
            String password = request.getParameter("password");            
            User user = db.findUser(ID, password);
            
            //Student student = new Student("ID","name","email","password","phone");
            
           
                session.setAttribute("userLogin", user);
                response.sendRedirect("loginWelcome.jsp");                        
           
            
        %>
        
    </body>
</html>
