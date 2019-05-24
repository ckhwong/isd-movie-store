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

    //Find movie by ID in the database
    public Order findOrder(int orderID) throws SQLException {
        //setup the select sql query string
        //execute this query using the statement field
        //add the results to a ResultSet
        //search the ResultSet for a student using the parameters
        
        return null;
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
            double origPrice, int discount, String deliveryType) throws SQLException {        
        //code for add-operation
    }

    //update a student details in the database
    public void updateMovie(int ID, String title, String genre, int duration, 
            int year, double price, int stock) throws SQLException {
        //code for update-operation
    }
    
    //delete a student from the database
    public void deleteMovie(String ID) throws SQLException{
        //code for delete-operation
    }
}

