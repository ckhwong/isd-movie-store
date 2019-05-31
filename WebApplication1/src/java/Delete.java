
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

public class Delete extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "text/html; charset=utf-8");

        String username = request.getParameter("userid");

        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/userinfo?useSSL=false";
        String USER = "root";
        String PASS = "tzw980221";
        Connection conn = null;
        Statement stmt = null;

        PrintWriter out = response.getWriter();
        
        try {
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 打开链接
            System.out.println("Connect to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // 执行查询
            stmt = conn.createStatement();
           
            if (!username.equals("")) {
                String sql = "delete from usertable where userid="+username;
                int numberOfUpdated = stmt.executeUpdate(sql);
                if (numberOfUpdated==0){
                    out.println("User does not existed");
                }else{
                    out.println("User has been deleted with userid: "+username);
                }
                
                

            } else {
                out.println("Information is wrong, please enter again！");
            }

//            rs.close();
            stmt.close();
            conn.close();
        } 
        catch (SQLException se) {

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
