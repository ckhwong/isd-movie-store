<%-- 
    Document   : Shipments
    Created on : 18/05/2019, 6:42:03 PM
    Author     : Yi Chen
--%>

<%@page import="wsd.model.dao.*"%>
<%@page import="wsd.model.*"%>
<%@page import="wsd.controller.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    DBShipmentManager manager = new DBShipmentManager();
    
    String ID = request.getParameter("ID");
    String date = request.getParameter("date");
    List<Shipment> shipments = manager.getShipment(ID, date);
    
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="css/demo.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>All Shipment</title>
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

    <body  bgcolor="#CC9933" >
        <div><span class="time" id="time" ></span></div>
        <center>
            <h1>Online Movie Store: All Shipments</h1> <br>
            <button class="button" type="button" onclick="location.href = 'home.jsp'" > Home Page </button><br>
        </center>
        
        
        <form>
            <h4>Search</h4>
            <label>Shipment ID</label>
            <input type="number" name="ID" value="<%=ID%>">
            <label>Date</label>
            <input type="text" name="date" value="<%=date%>">
            <button type="submit">Search</button>
        </form>
        
        
        <hr>
        <table  width="100%" >
            <tr>
                <th>Shipment ID</th>
                <th>User ID</th>
                <th>Order ID</th>
                <th>Date</th>
                <th>Address</th>
                <th>Shipment Type</th>
                <th>Action</th>
            </tr>
            <% for(Shipment shipment: shipments) { %>
                <tr>
                    <td><a href="editshipment.jsp?ID=<%= shipment.getID() %>"><%= shipment.getID() %></a></td>
                    <td><%= shipment.getUserID() %></td>
                    <td><%= shipment.getOrderID() %></td>
                    <td><%= shipment.getDate() %></td>
                    <td><%= shipment.getAddress() %></td>
                    <td><%= shipment.getShipmentType()%></td>
                    <td><a href="shipmentdelete.jsp?ID=<%= shipment.getID() %>">Delete</a></td>
                </tr>
            
            <% } %>
        </table>
        
        <br>
        <a href="createshipment.jsp">Create new shipment</a>
        <jsp:include page="/ConnServlet" flush="true" />
    </body>
</html>