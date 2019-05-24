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
    private int userID;
    private int movieID;
    private String orderDate;
    private double orderOrigPrice;
    private int orderDiscount;
    private double orderFinalPrice;
    private String orderDeliveryType;
    
    public Order() {
        super();
    }

    public Order(int orderID, int userID, int movieID, String orderDate, 
            double orderOrigPrice, int orderDiscount, String orderDeliveryType) {
        this.orderID = orderID;
        this.userID = userID;
        this.movieID = movieID;
        this.orderDate = orderDate;
        this.orderOrigPrice = orderOrigPrice;
        this.orderDiscount = orderDiscount;
        this.orderDeliveryType = orderDeliveryType;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
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

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderOrigPrice() {
        return orderOrigPrice;
    }

    public void setOrderOrigPrice(double orderOrigPrice) {
        this.orderOrigPrice = orderOrigPrice;
    }

    public int getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(int orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public double getOrderFinalPrice() {
        calcFinalPrice();
        return orderFinalPrice;
    }
    
    public void calcFinalPrice() {
        double origPrice = getOrderOrigPrice();
        int discount = getOrderDiscount();
        double discountPercent = 1 - discount/100;
        orderFinalPrice = origPrice * discountPercent;
    }
    
    public String getOrderDeliveryType() {
        return orderDeliveryType;
    }

    public void setOrderDeliveryType(String orderDeliveryType) {
        this.orderDeliveryType = orderDeliveryType;
    }
    
}
