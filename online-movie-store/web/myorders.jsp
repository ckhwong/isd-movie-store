<%-- 
    Document   : myorders - shows list of order history
    Created on : 21/05/2019, 5:17:27 PM
    Author     : Christopher Wong
--%>

<%@page import="wsd.model.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/demo.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>My Orders</title>
    </head>
    <%
        String log;
        Order order = (Order) session.getAttribute("order");

        if (order != null) {
            log = " &lt " + order.getUserID() + " &gt";
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }
    %>
    <body onload="startTime()">
        <div><span class="time" id="time" ></span></div>
        <h2 class="outline">Order History</h2> 
        <table width="100%" >
            <tr bgcolor="lightgrey" ><td align="right" class="outline">You are logged in as  <%=log%></td></tr>
            <tr><td align="right">
                    <%if (order != null) { %>
                    <u><a class="link" href="edit_user.jsp">Account</a></u> 
                        <%} else { %>
                    <u><a class="link" href="register.jsp">Register</a></u>
                        <%}%>
                    &emsp;<u><a class="link" href="logout.jsp">Logout</a></u>
                </td>
            </tr>                  
        </table>        
        <hr>
        <% if (order != null) { %>
        <table class="account">
            <thead class="h">
                <tr>
                    <td class="a">Order ID</td>
                    <td class="a">User ID</td>
                    <td class="a">Movie ID</td>
                    <td class="a">Date</td>
                    <td class="a">Delivery Type</td>
                    <td class="a">Delivery Price</td>
                    <td class="a">Original Price</td>
                    <td class="a">Discount %</td>
                    <td class="a">Final Price</td>
                </tr>
            </thead>
            <tbody >
                <tr>
                    <td class="a">${order.orderID}</td>
                    <td class="a" >${order.userID}</td>
                    <td class="a">${order.movieID}</td>
                    <td class="a">${order.date}</td>
                    <td class="a">${order.deliveryType}</td>
                    <td class="a">${order.deliveryPrice}</td>
                    <td class="a">${order.origPrice}</td>
                    <td class="a">${order.discount}</td>
                    <td class="a">${order.finalPrice}</td>
                </tr>
            </tbody>
        </table>
        <% session.setAttribute("orderEdit", order); %>
        <%}else{ %>
        <p class="outline">Welcome Guest Student</p>
        <%}%>
    </body>
</html>

