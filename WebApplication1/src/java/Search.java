
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Search extends HttpServlet {

    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "text/html; charset=utf-8");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/userinfo?useSSL=false";
        String USER = "root";
        String PASS = "tzw980221";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        PrintWriter out = response.getWriter();
        try {
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 打开链接
            System.out.println("Connect to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // 执行查询
            stmt = conn.createStatement();
            String sql = "";

            if (username.length() == 0 && email.length() == 0) {
                out.println("no info provided!");
            } else if (username.length() == 0) {
                sql = "select * from usertable where phonenumber=\"" + email + "\"";
            } else if (email.length() == 0) {
                sql = "select * from usertable where username=\"" + username + "\"";
            } else {
                sql = "select * from usertable where username=\"" + username + "\" and phonenumber=\"" + email + "\"";
            }

            rs = stmt.executeQuery(sql);

            out.println("id\t,username\t,phoneNumber<br></br>");
            while (rs.next()) {
                out.println(rs.getInt("userid") + "," + rs.getString("username") + "," + rs.getString("phonenumber") + "<br></br>");
            }

//            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLIntegrityConstraintViolationException sicve) {
            out.println("user already exists!");
        } catch (SQLException se) {

            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
