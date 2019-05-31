<%-- 
    Document   : myorders
    Created on : 30/05/2019, 8:20:44 PM
    Author     : ckhwong008
--%>

<%@page import="java.sql.*"%>
<%@page import="wsd.model.dao.*"%>
<%@page import="java.util.List"%>
<%@page import="wsd.model.*"%>
<%@page import="wsd.model.dao.DBOrderManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/demo.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>Order Submitted</title>
            <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
    </head>
    <%
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");

        String log;
        User user = (User) session.getAttribute("user");

        if (user != null) {
            log = " &lt " + user.getName() + " &gt";
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }

        List<Order> orders = manager.getOrders(user.getID());
    %>
    <body>
        <div><span class="time" id="time" ></span></div>
        <center>
            <h1>Online Movie Store</h1> <br>
            <button class="button" type="button" onclick="location.href = 'home.jsp'" > Home Page </button>
            <button class="button" type="button" onclick="location.href = 'profile.jsp'" > Account </button>
            <button class="button" type="button" onclick="location.href = 'movies.jsp'" > Movies </button><br>
        </center>      
          
        <h2 class="outline">Order History</h2><br>
        <p><b>Select Order ID Create Shipment Form or Cancel</b></p><br>
            <table border="2">
                <tr>
                    <td>Order ID</td>
                    <td>Date</td>
                    <td>User ID</td>
                    <td>Movie ID</td>
                    <td>Status</td>
                </tr>
                <% for (Order order : orders) {%>
                <tr>
                    <form action="editorder.jsp" method="post">
                      <td><input class="button" type="submit" name="order" value=<%=order.getOrderID()%>></td>
                    </form>
                    <td><%= order.getDate()%></td>
                    <td><%= order.getUserID()%></td>
                    <td><%= order.getMovieID()%></td>
                    <td><%= order.getStatus()%></td>
                    <td></td>
                    <td><input type="button" name="cancel" value="cancel"></td>

                </tr>
                <% }%>
            </table>
    </body>
</html> 
