/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd.model.dao;

import java.sql.*;
import wsd.model.Order;

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
         
             int oID = Integer.parseInt(rs.getString("orderID"));
             String date = rs.getString("date");
             int uID = Integer.parseInt(rs.getString("userID"));
             int mID = Integer.parseInt(rs.getString("movieID"));
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
    public void showOrder(int userID) throws SQLException {
        //code for update-operation
         
        String updateQueryString = "SELECT * FROM APP.MOVIES FETCH FIRST 100 ROWS ONLY";
        boolean orderUpdated = st.executeUpdate(updateQueryString) > 0;
         
         if (orderUpdated){
         System.out.println("order list shown");
         }
         else {
         System.out.println("order list not shown");
         }
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

