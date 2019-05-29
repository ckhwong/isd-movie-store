/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd.model;

import java.io.Serializable;
/**
 *
 * @author Christopher Wong
 */
public class Order implements Serializable{

    private int orderID;
    private String date;
    private int userID;
    private int movieID;
    private String status;
    
    public Order() {
        super();
    }

    public Order(int orderID, String date, int userID, int movieID, String status) {
        this.orderID = orderID;
        this.date = date;
        this.userID = userID;
        this.movieID = movieID;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
