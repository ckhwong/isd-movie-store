<%-- 
    Document   : logpage
    Created on : 28/05/2019, 3:52:36 PM
    Author     : William Palmer
--%>

<%@page import="wsd.model.dao.DBLogManager"%>
<%@page import="wsd.model.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/demo.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>OMS Log Page</title>
    </head>
    <%
        String log = (String) session.getAttribute("userID");
        
        String forcedUserID = "000001"; // Used by admins for enforcing a particular user ID to be searched
        String checkDate = "29/05/2019"; // The date used to get logs
        Log[] logsToDisplay = new Log[0];
        
        
        
    %>
    <body>
        <h1>Log Page</h1>
        
        <table width="100%" >
            <tr bgcolor="lightgrey" ><td align="right" class="outline">You are logged in as  <%=log%></td></tr>
            <tr><td align="right">
                    <u><a class="link" href="logout.jsp">Logout</a></u>
                </td>
            </tr>                  
        </table>
        
        <p>
            <form name="Get Log" method="POST">
                <pre>
                    <%=forcedUserID%> : <input type="text" name="Enter User ID">
                    <%=checkDate%> : <input type="text" name="dd/MM/yyyy">
                    <input type="submit" name="Search">
                </pre>
            </form>
        </p>
        
        <table border="1" cellspacing="5">
            <thead>
                <tr>
                    <th>UserID</th>
                    <th>Initial Date</th>
                    <th>Initial Time</th>
                    <th>Final Date</th>
                    <th>Final Time</th>
                    <th>Deletion</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="log" items="${logsToDisplay}">
                <tr>
                    <td><c:out value="${log.userID}"></td>
                    <td><c:out value="${log.getInitialDateAsSolitaryString}"></td>
                    <td><c:out value="${log.getInitialDateAsTimeString}"></td>
                    <td><c:out value="${log.getFinalDateAsSolitaryString}"></td>
                    <td><c:out value="${log.getFinalDateAsTimeString}"></td>
                    <td><input type="submit" value="Delete" onClick=""></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <%
            DBLogManager manager = (DBLogManager) session.getAttribute("manager");
            Log log = new Log();
            manager.addOrder(orderID, date, userID, movieID, status);
            session.setAttribute("order", order);
        %>
    </body>
</html>
