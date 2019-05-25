
/*This stand-alone application test the connection to the db once setup in DB class
 *It performs an add-function of a Student to the database
 *To use this app, you should complete the addStudent method in DBManager class
 *
 *
 *@author Christopher Wong
**/
package wsd.controller;

import wsd.model.dao.DBOrderManager;
import wsd.model.dao.DBConnector;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import wsd.model.Order;

public class TestOrderDB {
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            DBConnector connector = new DBConnector(); //Create a connection and initialize DB conn-field
            Connection conn = connector.openConnection(); //Get the protected connection instance from DB superclass to share for the application classes
            DBOrderManager db = new DBOrderManager(conn); //DBManger instance provide users with access to CRUD operations
            
            int key = (new Random()).nextInt(999999);
            int orderID = key; 
            System.out.print("User ID: ");
            int userID = Integer.parseInt(in.nextLine());
            System.out.print("Movie ID: ");
            int movieID = Integer.parseInt(in.nextLine());
            System.out.print("Date: ");
            String date = in.nextLine();
            System.out.print("Delivery Type: ");
            String deliveryType = in.nextLine();
            System.out.print("Delivery Price: ");
            double deliveryPrice = Double.parseDouble(in.nextLine());
            System.out.print("Original Price: ");
            double origPrice = Double.parseDouble(in.nextLine());
            System.out.print("Discount Percent: ");
            int discount = Integer.parseInt(in.nextLine());
            db.addOrder(orderID, userID, movieID, date, deliveryType, deliveryPrice,
            origPrice, discount); //This method must be completed in DBManager class
            
            Order order = db.findOrder(orderID); //This method must be completed in DBManager class
            
           if (order != null) {
            System.out.println("Order is found in the database." + order.getOrderID() 
                    + order.getUserID() + order.getMovieID());
            }
             if (order != null) {
            db.deleteOrder(orderID); // This method must be completed in DBManager class
            System.out.println("Student is deleted from the database.");
            }
            
            
            connector.closeConnection(); //Professional practice is to close connection to database once operations are finalized
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestOrderDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

