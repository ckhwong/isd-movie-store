<%-- 
    Document   : shipmentsbmitted
    Created on : 31/05/2019, 9:57:24 AM
    Author     : ckhwong008
--%>
<%@page import="wsd.model.dao.*"%>
<%@page import="wsd.model.*"%>
<%@page import="wsd.controller.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String date = request.getParameter("date");
        int ID = Integer.parseInt(request.getParameter("ID"));
        int userID = Integer.parseInt(request.getParameter("userID"));
        int orderID = Integer.parseInt(request.getParameter("orderID"));
        String address = request.getParameter("address");
        String shipmentType = request.getParameter("shipmentType");
        System.out.println("here2");

        DBShipmentManager manager = new DBShipmentManager();
        manager.addShipment(ID, orderID, userID, date, address, shipmentType);

        response.sendRedirect("shipments.jsp");
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
