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

    //Find order by ID in the database
    public Order findOrder(int orderID) throws SQLException {
        //setup the select sql query string
        String searchQueryString = "select * from Orders where Order ID='" 
                + orderID + "'";
        //execute this query using the statement field
       //add the results to a ResultSet
         ResultSet rs = st.executeQuery(searchQueryString);
        //search the ResultSet for a student using the parameters
         boolean hasOrder = rs.next();
         Order orderFromDB = null;
                 
         if(hasOrder){
         
             int oID = rs.getInt("orderID");
             String date = rs.getString("date");
             int uID = rs.getInt("userID");
             int mID = rs.getInt("movieID");
             String status = rs.getString("status");
               
             orderFromDB = new Order (oID, date, uID, mID, status);
         }
        
         rs.close();
        // st.close();
         
         return orderFromDB;
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

    //update order details in the database
    public List<Order> showOrder(int userID) throws SQLException {
        //code for update-operation
         
        String updateQueryString = "SELECT * FROM ORDERS FETCH FIRST 100 ROWS ONLY";
        ResultSet rs = st.executeQuery(updateQueryString);
        //search the ResultSet for an order using the parameters
        boolean hasOrder = rs.next();
         
        List<Order> list = new ArrayList<>();
        if (hasOrder) {
            System.out.println("hasOrder");
            //while(hasOrder){
                list.add(new Order(rs.getInt("orderid"), rs.getString("date"),
                        rs.getInt("userid"), rs.getInt("movieid"), rs.getString("status")));
            //}
         }
        else  {
            System.out.println("No orders found");
        }
        return list;
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

