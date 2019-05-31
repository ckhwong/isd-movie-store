/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd.model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import wsd.model.*;

/**
 *
 * @author Christopher Wong
 */
public class DBOrderManager {
    private Statement st;

    public DBOrderManager(Connection conn) throws SQLException {
        st = conn.createStatement();
    }

    //Add a submitted order into the database
    public void addOrder(int orderID, String date, int userID, int movieID,  
            String status) throws SQLException {        
        //code for add-operation
        
        String createQueryString = "INSERT INTO orders VALUES (" + orderID 
                + ", (SELECT movieid FROM movies WHERE movies.movieid=" 
                + movieID + "), (select userid from users where users.userid=" 
                + userID + "), '" + status + "', '" + date + "')";
        
        //insert into Orders values (orderid, 
        //(SELECT movieid from movies WHERE movies.movieid=movieid), 
        //(SELECT userid from users WHERE users.userid=userid), 
        //'status', 'date');
         boolean orderCreated = st.executeUpdate(createQueryString) > 0;
         
         if (orderCreated){
         System.out.println("order created");
         }
         else {
         System.out.println("order not created");
         }
    }

    //Find Order(s) by ID in the database
    public List<Order> getOrders(int userID) {
        List<Order> orders = new ArrayList<>();
        String sql =  "select * from orders where userID="
                + userID;

        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int orderID = rs.getInt("orderID");
                String date = rs.getString("date");
                int movieID = rs.getInt("movieID");
                String status = rs.getString("status");
                Order order = new Order(orderID, date, userID, movieID, status);
                orders.add(order);
            }
        } catch (SQLException e) {
            System.err.print(e);
        }
        return orders;
    }
    
    //change status of order to cancelled from the database
    public void cancelOrder(int orderID, String status) throws SQLException{
        //code for delete-operation
        
        String updateQueryString = "update Orders set status= '" 
                + status + "' where orderID= '" + orderID + "' ";
        boolean orderCancelled = st.executeUpdate(updateQueryString) > 0;
         
         if (orderCancelled){
         System.out.println("order cancelled");
         }
         else {
         System.out.println("order not cancelled");
         }
    }
    
}

