<%-- 
    Document   : create shipment
    Created on : 21/05/2019, 2:45:03 PM
    Author     : Yi Chen
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
        <title>Create Shipment</title>
    </head>
    <%
        //String log;
        // User user = (User) session.getAttribute("user");
        //DBOrderManager manager = (DBOrderManager)session.getAttribute("manager");
        String userID = "5555";
        /* if (user != null) {
            log = " &lt " + user.getName() + " &gt";
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }*/

        // Movie movie = (movie) session.getAttribute("movie"); 
        String orderID = "1352";
        Random random = new Random();
        String ID = "" + random.nextInt(10000);
    %>
    <body  bgcolor="#CC9933" >
        <div><span class="time" id="time" ></span></div>
        <center>
            <h1>Online Movie Store: Create Shipment for order</h1> <br>
            <button class="button" type="button" onclick="location.href = 'home.html'" > Home Page </button><br>
            <h2>Enter shipment details:</h2> 
        </center>
        <form action="shipmentsubmitted.jsp" method="post">
            <center>
                <table cellpadding="5" >
                    <tr>
                        <td>Date:</td>
                         <%java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd"); %>
                         <td><input type="date" name="date" value=<%= df.format(new java.util.Date()) %> readonly></td>
                    </tr>
                    <tr>
                        <td>Shipment ID:</td>
                        <td><input type="number" name="ID" value=<%=ID%> required></td>
                    </tr>
                    <tr>
                        <td>User ID:</td>
                        <td><input type="number" name="userID" value=<%=userID%> required></td>
                    </tr>
                    <tr>
                        <td>Order ID:</td>
                        <td><input type="number" name="orderID" value=<%=orderID%> required></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type="text" name="address" value="" required></td>
                    </tr>
                    <tr>
                        <td>Shipment type</td>
                        <td><input type="text" name="shipmentType" value="" required></td>
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
        <jsp:include page="/ConnServlet" flush="true" />
    </body>
</html>