<%-- 
    Document   : MovieManagement
    Created on : May 28, 2019, 1:47:07 PM
    Author     : Hans
--%>

<%@page import="wsd.model.*" contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<%@page import="wsd.model.dao.*"%>
<%@page import="wsd.model.*"%>
<%@page import="wsd.controller.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Management</title>
    </head>
    <%
        //Movie movie = (Movie)session.getAttribute("Movie");
        //String movie = (String) session.getAttribute("MovieID");
            /**int MovieID = Integer.parseInt(request.getParameter("movieID"));
            String Title = request.getParameter("title");
            int Duration = Integer.parseInt(request.getParameter("duration"));
            String Genre = request.getParameter("genra");
            double Price = Double.parseDouble(request.getParameter("price"));
            int Stock = Integer.parseInt(request.getParameter("stock"));
    */%>
    <body onload="startTime()">
        <table border="20" width="20" cellspacing="20" cellpadding="20">
            <form method="post" action="movieDetails.jsp">
            <thead>
                <tr style="color: blue">
                    <th>MovieID</th>
                    <th>Title</th>
                    <th>Duration</th>
                    <th>Genre</th>
                    <th>Price</th>
                    <th>Stock</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="MovieID" name="MovieID"></td>
                    <td><input type="Title" name="Title"></td>
                    <td><input type="Duration" name="Duration"></td>
                    <td><input type="Genre" name="Genre"></td>
                    <td><input type="Price" name="Price"></td>
                    <td><input type="Stock" name="stock"></td>
                </tr>
            </tbody>
        </table>
        <table align="center">
        <td>
        <input type="submit" value="Add" name="AddMovie" /><input type="submit" value="Update" name="AddMovie" /><input type="submit" value="Delete" name="AddMovie" />
        </td>
        </table>
            </form>

    </body>
    </html>>
