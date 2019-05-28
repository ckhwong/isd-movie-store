<%-- 
    Document   : createorder - 
    Created on : 18/05/2019, 6:42:03 PM
    Author     : Christopher Wong
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="css/demo.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>Create Order</title>
    </head>
    <body onload="startTime()"  bgcolor="#CC9933" >
        <div><span class="time" id="time" ></span></div>
        <center>
            <h1>Online Movie Store: Create Order</h1> <br>
            <button class="button" type="button" onclick="location.href = 'home.html'" > Home Page </button><br>
            <h2>Enter your order details:</h2> 
        </center>
        <form>
            <center>
                <table cellpadding="5">
                    <tr>
                        <td>Account Type:</td>
                        <td> 
                            <input class="button" type="submit" value="User" name="userAcc">
                            &nbsp; 
                            <input class="button" type="submit" value="Guest" name="guestAcc"><br>
                        </td>
                    </tr>
                </table>
            </center>
        </form>
        <br>
        <form type="hidden" name="submitted" value="yes" action="myorders.jsp" method="post">
            <center>
                <%  if (request.getParameter("guestAcc") != null) { %>
                <b> Guest Account Chosen </b>
                <table cellpadding="5">
                    <tr>
                        <td>Delivery Type:</td>
                        <td>
                            <input type="radio" name="deliveryType" value="pickup"> Store Pick-Up: +$0<br>
                            <input type="radio" name="deliveryType" value="delivery"> Delivery: +$10<br>
                        </td>
                    </tr>
                    <tr>
                        <td>Address for Delivery/Pick-Up: </td>
                        <td>
                            <input type="text" name="address" placeholder="123 Movie St, Sydney"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>State: </td>
                        <td>
                            <input type="text" name="address" placeholder="NSW"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email"></td>
                    </tr>
                    <tr><td></td>
                        <td>
                            <input class="button" type="submit" value="Submit"> 
                            &nbsp; 
                            <button class="button" type="button" onclick="location.href = 'home.html'" > Home Page </button>
                        </td>
                    </tr>
                </table>   
                <%  } else { %>  
                <b> User Account Chosen </b>
                <table cellpadding="5">
                    <tr>
                        <td>User ID:</td>
                        <td><input type="text" name="userID"></td>
                    </tr>
                    <tr>
                        <td>Delivery Type:</td>
                        <td>
                            <input type="radio" name="deliveryType" value="pickup"> Store Pick-Up: +$0<br>
                            <input type="radio" name="deliveryType" value="delivery"> Delivery: +$10<br>
                        </td>
                    </tr>
                    <tr>
                        <td>Address for Delivery/Pick-Up: </td>
                        <td>
                            <input type="text" name="address" placeholder="123 Movie St, Sydney"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>State: </td>
                        <td><input type="text" name="address" placeholder="NSW"><br></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email"></td>
                    </tr>
                    <tr><td></td>
                        <td>
                            <input class="button" type="submit" value="Submit"> 
                            &nbsp; 
                            <button class="button" type="button" onclick="location.href = 'home.html'" > Home Page </button>
                        </td>
                    </tr>
                </table>
                <%  }%>
            </center>
        </form>
    </body>
</html>
