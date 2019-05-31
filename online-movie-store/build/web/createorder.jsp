<%-- 
    Document   : createorder - 
    Created on : 18/05/2019, 6:42:03 PM
    Author     : Christopher Wong
--%>

<%@page import="wsd.model.dao.*"%>
<%@page import="wsd.model.*"%>
<%@page import="wsd.controller.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="css/demo.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>Create Order</title>
    </head>
    <%
        //DBMovieManager manager = (DBMovieManager)session.getAttribute("manager");
        String movieID = request.getParameter("order");
        String log = "";
        int guestID = 9999999;

        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");
        
        User user = (User) session.getAttribute("userLogin");

        if (user != null) {
            log = " &lt " + user.getName() + " &gt";
            guestID = user.getID();
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }
        
        
    %>
    <body onload="startTime()"  bgcolor="#CC9933" >
        <div><span class="time" id="time" ></span></div>
        <center>
            <h1>Online Movie Store: Create Order</h1> <br>
            <button class="button" type="button" onclick="location.href = 'home.jsp'" > Home Page </button>
            <button class="button" type="button" onclick="location.href = 'movies.jsp'" > Movies </button>
            <button class="button" type="button" onclick="location.href = 'profile.jsp'" > Account </button><br>
            <h2>Check order details:</h2> 
        </center>
        
        <form action="ordersubmitted.jsp" method="post">
            <center>
                <table cellpadding="5" >
                    <tr>
                        <td>Date:</td>
                        <%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy");%>
                        <td><input type="text" style="text-align: center" name="date" value=<%= df.format(new java.util.Date())%> readonly></td>
                    </tr>
                    <tr>
                        <td><% if (user != null) { %> 
                            User ID:
                            <% } else {%>
                            Guest ID:
                            <% } %></td>
                        <td>
                            <% if (user != null) { %>
                            <input type="text" name="userID" value="<%=user.getID() %>" readonly>
                            <% } else {%>
                            <input type="text" name="userID" value="<%=guestID%>"  readonly>
                            <% } %>
                        </td>
                    </tr>
                    <tr>
                        <td>Movie ID:</td>
                        <td><input type="text" name="movieID" value=<%=movieID%> readonly></td>
                    </tr>
                    <tr><td></td>
                        <td>
                            <input class="button" type="submit" value="Submit"> 
                            &nbsp; 
                            <button class="button" type="button" onclick="location.href = 'movies.jsp'" > Back </button>
                        </td>
                    </tr>
                </table>
            </center>
        </form>
        <jsp:include page="/ConnServlet" flush="true" />
    </body>
</html>
