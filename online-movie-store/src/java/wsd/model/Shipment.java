/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
*/
package wsd.model;

public class Shipment {
   private int ID;
   private int orderID;
   private String date;
   private int userID;
   private String address;
   private String shipmentType;

   public int getID() {
       return ID;
   }
   public void setID(int ID) {
       this.ID = ID;
   }
   public Shipment(int ID, int orderID, int userID, String date, String address, String shipmentType) {
       this.ID = ID;
       this.orderID = orderID;
       this.date = date;
       this.userID = userID;
       this.address = address;
       this.shipmentType = shipmentType;
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
   public String getAddress() {
       return address;
   }
   public void setAddress(String address) {
       this.address = address;
   }
   public String getShipmentType() {
       return shipmentType;
   }
   public void setShipmentType(String shipmentType) {
       this.shipmentType = shipmentType;
   }
}  
   

