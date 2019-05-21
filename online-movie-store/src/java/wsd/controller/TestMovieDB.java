/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd.controller;

import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class TestMovieDB {
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            DBConnector connector = new DBConnector(); //Create a connection and initialize DB conn-field
            Connection conn = connector.openConnection(); //Get the protected connection instance from DB superclass to share for the application classes
            DBManager db = new DBManager(conn); //DBManger instance provide users with access to CRUD operations
            
            int key = (new Random()).nextInt(9999999);
            int ID = key; 
            System.out.print("Movie Title: ");
            String title = in.nextLine();
            System.out.print("Genre: ");
            String genre = in.nextLine();
            System.out.print("Duration ");
            String durationString = in.nextLine();
            int duration = Integer.parseInt(durationString);
            System.out.print("Year: ");
            String yearString = in.nextLine();
            int year = Integer.parseInt(yearString);
            System.out.print("Price: ");
            String priceString = in.nextLine();
            double price = Double.parseDouble(priceString);
            System.out.print("Stock: ");
            String stockString = in.nextLine();
            int stock = Integer.parseInt(stockString);
            db.addMovie(ID, title, genre, duration, year, price, stock); //This method must be completed in DBManager class
            System.out.println("Movie is added to the database.");
            connector.closeConnection(); //Professional practice is to close connection to database once operations are finalized
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestMovieDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
