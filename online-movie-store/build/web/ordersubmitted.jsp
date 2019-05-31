<%-- 
    Document   : myorders - shows list of order history
    Created on : 21/05/2019, 5:17:27 PM
    Author     : Christopher Wong
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
        <link rel="stylesheet" href="css/demo.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>Order Submitted</title>
    </head>
    <%
        String date = request.getParameter("date");
        int userID = Integer.parseInt(request.getParameter("userID"));
        int movieID = Integer.parseInt(request.getParameter("movieID"));
        //String date = "29/05/2019";
        //int userID = 4448444;
        //int movieID = 55550000;
        int orderID = new Random().nextInt(999999999);
        String status = "Approved";

        //String log;
        /* User user = (User) session.getAttribute("user");

        if (user != null) {
            log = " &lt " + user.getName() + " &gt";
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }*/
    %>
    <body onload="startTime()">
        <div><span class="time" id="time" ></span></div>
        <h2 class="outline">Order History</h2> 
        <table width="100%" >
            <tr bgcolor="lightgrey" ><td align="right" class="outline">You are logged in as Guest Account</td></tr>
            <tr><td align="right">
                    <%if (userID == 9999999) { %>
                    <u><a class="link" href="home.html">Register</a></u> 
                        <%} else { %>
                    <u><a class="link" href="login.html">Account</a></u>
                        <%}%>
                    &emsp;<u><a class="link" href="logout.jsp">Logout</a></u>
                </td>
            </tr>                  
        </table>        
        <hr>
        <% if (userID == 9999999) { %>
        <b>Guest Account</b><br>
        Your finalised order details:
        <table class="userAcc">
            <thead class="h">
                <tr>
                    <td class="a">Order ID</td>
                    <td class="a">Date</td>
                    <td class="a">User ID</td>
                    <td class="a">Movie ID</td>
                    <td class="a">Status</td>
                </tr>
            </thead>
            <tbody >
                <tr>
                    <td class="a"><%=orderID%></td>
                    <td class="a"><%=date%></td>
                    <td class="a" ><%=userID%></td>
                    <td class="a"><%=movieID%></td>
                    <td class="a"><%=status%></td>
                </tr>
            </tbody>
        </table>
        <%
            //Activate the database add-function once DBManager functions are completed
            DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");
            Order order = new Order(orderID, date, userID, movieID, status);
            manager.addOrder(orderID, date, userID, movieID, status);
            session.setAttribute("order", order);
        %>
        <% } else if (request.getParameter("userID") != null) { %>
        <b>Thank You <%{/*user */} %></b><br>
        Your finalised order details:
        <table class="userAcc">
            <thead class="h">
                <tr>
                    <td class="a">Order ID</td>
                    <td class="a">Date</td>
                    <td class="a">User ID</td>
                    <td class="a">Movie ID</td>
                    <td class="a">Status</td>
                </tr>
            </thead>
            <tbody >
                <tr>
                    <td class="a"><%=orderID%></td>
                    <td class="a"><%=date%></td>
                    <td class="a" ><%=userID%></td>
                    <td class="a"><%=movieID%></td>
                    <td class="a"><%=status%></td>
                </tr>
            </tbody>
        </table>
        <%
            //Activate the database add-function once DBManager functions are completed
            DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");
            Order order = new Order(orderID, date, userID, movieID, status);
            System.out.println("" + orderID + " " + date + " " + userID + " " + movieID + " " + status);
            manager.addOrder(orderID, date, userID, movieID, status);
            session.setAttribute("order", order);
        %>
        <%} else { %>
        <p class="outline">Some error occurred</p>
        <%}%>
    </body>
    <jsp:include page="/ConnServlet" flush="true" />
</html>

