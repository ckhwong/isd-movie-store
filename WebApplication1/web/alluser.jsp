
<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%

            String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost:3306/userinfo?useSSL=false";
            String USER = "root";
            String PASS = "tzw980221";
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from usertable");
            out.println("<table border=\"1\">");
            out.println("<tr>");
            out.println("<td>id</td><td>username</td><td>phoneNumber</td>");
            out.println("</tr>");
            while (rs.next()) {
                out.println("<tr>");

                out.println("<td>" + rs.getInt("userid") + "</td><td>" + rs.getString("username") + "</td><td>" + rs.getString("phonenumber") + "</td>");
                out.println("</tr>");

            }
        %>
    </body>
</html>
