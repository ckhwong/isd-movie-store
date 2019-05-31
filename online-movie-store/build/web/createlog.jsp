<%-- 
    Document   : createorder - 
    Created on : 31/05/2019, 12:04:12 PM
    Author     : William Palmer
--%>

<%@page import="wsd.model.dao.*"%>
<%@page import="wsd.model.*"%>
<%@page import="wsd.controller.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="css/demo.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>Create Log</title>
    </head>
    <%
        //String log;
        // User user = (User) session.getAttribute("user");
        //DBLogManager manager = (DBLogManager)session.getAttribute("manager");
        String userID = "0001";
        String logID = "0000100001";
        String logonDate = "29/05/2019 13:42:12";
        String logoutDate = "30/05/2019 01:21:04";
    %>
    <body bgcolor="#CC9933" >
        <div><span class="time" id="time" ></span></div>
        <center>
            <h1>Online Movie Store: Create Log [ADMIN]</h1> <br>
            <button class="button" type="button" onclick="location.href = 'home.html'" > Home Page </button><br>
            <h2>New Log Details:</h2> 
        </center>
        <form action="logpage.jsp" method="post">
            <center>
                <table cellpadding="5" >
                    <% {/*if (movie != null) {*/ } %>
                    <tr>
                        <td>Date:</td>
                         <%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
                         <td><input type="text" style="text-align: center" name="date" value=<%= df.format(new java.util.Date()) %> readonly></td>
                    </tr>
                    <tr>
                        <td>User ID:</td>
                        <td><input type="text" name="userID" value=<%=userID%>></td>
                    </tr>
                    <% {/*if (movie != null) {*/ } %>
                    <tr>
                        <td>Log ID:</td>
                        <td><input type="text" name="logID" value=<%=logID%>></td>
                    </tr>
                    <% {/*}*/ } %>
                    <tr>
                        <td>Logon Date:</td>
                        <td><input type="text" name="logonDate" value=<%=logonDate%>></td>
                    </tr>
                    
                    <tr>
                        <td>Logout Date:</td>
                        <td><input type="text" name="logoutDate" value=<%=logoutDate%>></td>
                    </tr>
                    
                    <tr><td></td>
                        <td>
                            <input class="button" type="submit" value="Submit"> 
                            &nbsp; 
                            <button class="button" type="button" onclick="location.href = 'home.html'" > Home Page </button>
                        </td>
                    </tr>
                </table>
            </center>
        </form>
        <jsp:include page="/LogConnServlet" flush="true" />
    </body>
</html>
