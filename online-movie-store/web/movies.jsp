<%-- 
    Document   : movies
    Created on : 31/05/2019, 1:22:37 PM
    Author     : ckhwong008
--%>

<%@page import="wsd.model.dao.*"%>
<%@page import="wsd.model.*"%>
<%@page import="wsd.controller.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    DBMovieManager manager = new DBMovieManager();
    List<Movie> movies = manager.getAllMovies();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="css/demo.css"> 
        <script type="text/javascript" src="js/script.js"></script>
        <title>All Movies</title>
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
            <h1>Online Movie Store</h1> <br>
            <button class="button" type="button" onclick="location.href = 'home.jsp'" > Home Page </button><br>
        </center>       
        
        <hr>
        <b><p>To order movie, click on its ID:</p></b>
        <table  width="100%" >
            <tr>
                <th>Movie ID</th>
                <th>Title</th>
                <th>Duration</th>
                <th>Genre</th>
                <th>Price</th>
                <th>Stock</th>
            </tr>
            <% for(Movie movie: movies) { %>
                <tr>
                  <form action="createorder.jsp" method="post">
                      <td><input class="button" type="submit" name="order" value=<%=movie.getMovieID()%>></td>
                    </form>
                    <td><%= movie.getTitle() %></td>
                    <td><%= movie.getDuration() %></td>
                    <td><%= movie.getGenre() %></td>
                    <td><%= movie.getPrice() %></td>
                    <td><%= movie.getStock() %></td>
                </tr>            
            <% } %>
        </table>
        
        <br>
        <jsp:include page="/ConnServlet" flush="true" />
    </body>
</html>
