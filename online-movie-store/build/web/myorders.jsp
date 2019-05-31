<%-- 
    Document   : myorders
    Created on : 30/05/2019, 8:20:44 PM
    Author     : ckhwong008
--%>

<%@page import="java.util.List"%>
<%@page import="wsd.model.Order"%>
<%@page import="wsd.model.dao.DBOrderManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <%
        //String log;
        // User user = (User) session.getAttribute("user");
        int userID = 55550000;

        /*if (user != null) {
            log = " &lt " + user.getName() + " &gt";
        } else {
            log = " &lt " + "Guest User" + " &gt";
        }*/
    %>
    <body>

    </body>
    <form method="post">

        <table border="2">
            <tr>
                <td>Order ID</td>
                <td>Date</td>
                <td>User ID</td>
                <td>Movie ID</td>
                <td>Status</td>
                <td>Status</td>
            </tr>
            <tr>
                <%                    
                    DBOrderManager manager = (DBOrderManager) session.getAttribute("manager");
                    //List<Order> list = manager.showOrder(userID);
                %>
            </tr>
        </table>
    </form>
</html> 
