<%-- 
    Document   : shipmentdelete
    Created on : 26/05/2019, 10:03:08 AM
    Author     : Yi Chen
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
        <title>Delete Shipment</title>
    </head>
    <%
        int ID = Integer.parseInt(request.getParameter("ID"));

        DBShipmentManager manager = new DBShipmentManager();
        manager.deleShipment(ID);

        response.sendRedirect("shipments.jsp");
    %>
    <body>
        <h1>Shipment Deleted.</h1>
    </body>
</html>
