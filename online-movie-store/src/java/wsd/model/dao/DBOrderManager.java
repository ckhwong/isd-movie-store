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
             int uID = Integer.parseInt(rs.getString("userID")); 
             int mID = Integer.parseInt(rs.getString("movieID"));
             String date = rs.getString("date");
             String deliveryType = rs.getString("deliveryType");
             double deliveryPrice = Double.parseDouble(rs.getString("deliveryPrice"));
             double origPrice = Double.parseDouble(rs.getString("origPrice")); 
             int discount = Integer.parseInt(rs.getString("discount"));
                          
             orderFromDB = new Order (oID, uID, mID, date, deliveryType, 
                deliveryPrice, origPrice, discount);
         }
        
         rs.close();
        // st.close();
         
         return orderFromDB;
    }

    //Check if a movie exists in the database
    public boolean checkOrder(int orderID, int userID) throws SQLException {
       //setup the select sql query string
        //execute this query using the statement field
        //add the results to a ResultSet
        //search the ResultSet for a student using the parameters
        //verify if the movie exists
        return false;
    }

    //Add a student-data into the database
    public void addOrder(int orderID, int userID, int movieID, String date, 
            String deliveryType, double deliveryPrice,
            double origPrice, int discount) throws SQLException {        
        //code for add-operation
        
        String createQueryString = "insert into Orders" 
                + " values ('" + orderID + "', '" + userID + "', '" + movieID + "', '" 
                + date + "', '" + deliveryType + "', '" + deliveryPrice + "', '" 
                + origPrice + "', '" + discount + "')";
         boolean orderCreated = st.executeUpdate(createQueryString) > 0;
         
         if (orderCreated){
         System.out.println("order created");
         }
         else {
         System.out.println("order not created");
         }
    }

    //update a student details in the database
    public void updateOrder(int orderID, String deliveryType, 
            int discount) throws SQLException {
        //code for update-operation
         
        String updateQueryString = "update Orders set deliveryType = '" + deliveryType 
                + "', discount= '" + discount + "' where orderID='" + orderID + "'";
        boolean orderUpdated = st.executeUpdate(updateQueryString) > 0;
         
         if (orderUpdated){
         System.out.println("order updated");
         }
         else {
         System.out.println("order not updated");
         }
    }
    
    //delete a student from the database
    public void deleteOrder(int orderID) throws SQLException{
        //code for delete-operation
        
        String deleteQueryString = "delete from Orders where orderID= '" + orderID + "' ";
        boolean orderDeleted = st.executeUpdate(deleteQueryString) > 0;
         
         if (orderDeleted){
         System.out.println("order deleted");
         }
         else {
         System.out.println("order not deleted");
         }
    }
}

