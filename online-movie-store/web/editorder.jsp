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
        int orderID = Integer.parseInt(request.getParameter("order"));
        
        String log = "";
        int guestID = 9999999;

        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");
        
        Order order = (Order) session.getAttribute("order");        
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
        <input type="button" name="goback" value="Go Back" location.href = 'myorders.jsp'">
        <form action="myorders.jsp" method="post">
            <center>
                <table cellpadding="5" >
                    <tr>
                    <td>Order ID</td>
                    <td>Date</td>
                    <td>User ID</td>
                    <td>Movie ID</td>
                    <td>Status</td>
                </tr>
                <tr>
                    <td><input name="orderID" value="<%=orderID%>" readonly></td>
                    <td><input name="date" value="<%=order.getDate()%>" readonly></td>
                    <td><input name="userID" value="<%=order.getUserID()%>" readonly></td>
                    <td><input name="movieID" value="<%=order.getMovieID()%>" readonly></td>
                    <td><input name="status" value="<%=order.getStatus()%>" readonly></td>
                   
                </tr>
                <tr>
                <input type="button" name="cancel" value="Cancel My Order"> 
                <input type="button" name="shipment" value="Create Shipment"> 
                </tr>
                </table>
                    <input type="button" name="goback" value="Go Back" onClick="location.href = 'myorders.jsp'">
            </center>
        </form>
        <jsp:include page="/ConnServlet" flush="true" />
    </body>
</html>
