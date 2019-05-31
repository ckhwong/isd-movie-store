<%-- 
    Document   : logpage
    Created on : 28/05/2019, 3:52:36 PM
    Author     : William Palmer
--%>

<%@page import="wsd.model.dao.*"%>
<%@page import="wsd.model.*"%>
<%@page import="wsd.controller.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
                    <%=forcedUserID%> : <input type="text" name="forcedUserID" id="forcedUserID">
                    <%=checkDate%>    : <input type="text" name="checkDate" id="checkDate">
                    <button onClick="search()">Search</button>
                </pre>
            </form>
        </p>
        
        <div class="logTable">
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
                    <td><button onClick="deleteLog(${log.getLogID})">Delete</button></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        </div>
        <%
            DBLogManager manager = (DBLogManager) session.getAttribute("manager");
            
            // For Logging in
            session.setAttribute("logondt", "30/05/2019" + "-" + "19:47:31");
            
            // On log out
            //manager.createLog(logID, userID, session.getAttribute("logondt"), finalDate);
            
        %>
        <script>
            // Client side view function to invoke updating the page and deletion of a log
            // Function for forcing logs to update on the page.
            function updateLocalLogs() {
                // Check if forcedUserID contains anything
                if (forcedUserID !== "" || forcedUserID !== null) {
                    // Get the logs from the specific user ID supplied with the date.
                    logsToDisplay = manager.getLogs(forcedUserID, checkDate);
                    
                } else {
                    // Otherwise, Get the logs pertaining to the date for the current user ID
                    /*logsToDisplay = manager.getLogs(userID, checkDate);*/
                }
                
                
            }
            
            // Searching function. Will update the local logs before displaying them in the table
            function search() {
                // Update the local log repository
                updateLocalLogs();
                
                // Update the table to display the local log repository
                
                
                
            }
            
            // Deletion function. Will prompt a deletion of the log IF the user is an admin
            function deleteLog(int delLogID) {
                // Parse the delLogID to the manager
                manager.deleteLog(delLogID);
                
                // Update local log repository
                updateLocalLogs();
                
                // Update the table to display the local log repository
                
            }
            
            
        </script>
        
        
        <jsp:include page="/LogConnServlet" flush="true" />
    </body>
</html>
