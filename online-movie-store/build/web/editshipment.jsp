<%-- 
    Document   : Edit Shipment Form
    Created on : 18/05/2019, 6:42:03 PM
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
        <title>Edit Shipment</title>
    </head>
    <%
        DBShipmentManager manager = new DBShipmentManager();
        Shipment shipment = manager.findShipment(Integer.parseInt(request.getParameter("ID")));

    %>
    <body  bgcolor="#CC9933" >
        <div><span class="time" id="time" ></span></div>
        <center>
            <h1>Online Movie Store: Create Shipment for order</h1> <br>
            <button class="button" type="button" onclick="location.href = 'home.html'" > Home Page </button><br>
            <h2>Enter shipment details:</h2> 
        </center>
        <form action="shipmentupdated.jsp" method="post">
            <center>
                <table cellpadding="5" >
                    <tr>
                        <td>Date:</td>
                        <td><input type="date" name="date" value="<%= shipment.getDate() %>"></td>                                   
                    </tr>
                    <tr>
                        <td>Shipment ID:</td>
                        <td><input type="number" name="ID" value="<%=shipment.getID()%>" readonly required></td>
                    </tr>
                    <tr>
                        <td>User ID:</td>
                        <td><input type="number" name="userID" value="<%=shipment.getUserID()%>" required></td>
                    </tr>
                    <tr>
                        <td>Order ID:</td>
                        <td><input type="number" name="orderID" value="<%=shipment.getOrderID()%>" required></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type="text" name="address" value="<%=shipment.getAddress()%>" required></td>
                    </tr>
                    <tr>
                        <td>Shipment type</td>
                        <td><input type="text" name="shipmentType" value="<%=shipment.getShipmentType()%>" required></td>
                    </tr>
                    <tr><td></td>
                        <td>
                            <input class="button" type="submit" value="Update"> 
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