/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd.model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import wsd.controller.LogConnServlet;
import wsd.model.Shipment;

public class DBShipmentManager {

    private Statement st;

    public DBShipmentManager() {
        DBConnector db = null;
        try {
            db = new DBConnector();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LogConnServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection conn = db.openConnection();
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DBShipmentManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public DBShipmentManager(Connection conn) throws SQLException {
        st = conn.createStatement();
    }

    //Find shipment by ID in the database
    public Shipment findShipment(int shipmentID) throws SQLException {
        //setup the select sql query string
        String searchQueryString = "select * from Shipments where ID="
                + shipmentID;
        //execute this query using the statement field
        //add the results to a ResultSet
        ResultSet rs = st.executeQuery(searchQueryString);
        //search the ResultSet for a student using the parameters
        boolean hasShipment = rs.next();
        Shipment shipmentFromDB = null;

        if (hasShipment) {

            int ID = Integer.parseInt(rs.getString("ID"));
            String date = rs.getString("date");
            int uID = Integer.parseInt(rs.getString("userID"));
            int orderID = Integer.parseInt(rs.getString("orderID"));
            String address = rs.getString("address");
            String shipmentType = rs.getString("shipmentType");

            shipmentFromDB = new Shipment(ID, orderID, uID, date, address, shipmentType);
        }

        rs.close();
        // st.close();

        return shipmentFromDB;
    }

    public List<Shipment> getAllShipment() {
        List<Shipment> shipments = new ArrayList<Shipment>();
        String sql = "select * from shipments";

        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int ID = Integer.parseInt(rs.getString("ID"));
                String date = rs.getString("date");
                int uID = Integer.parseInt(rs.getString("userID"));
                int orderID = Integer.parseInt(rs.getString("orderID"));
                String address = rs.getString("address");
                String shipmentType = rs.getString("shipmentType");
                Shipment shipment = new Shipment(ID, orderID, uID, date, address, shipmentType);
                shipments.add(shipment);
            }
        } catch (SQLException e) {
            System.err.print(e);
        }
        return shipments;
    }

    public List<Shipment> getShipment(String shipmentID, String date) {
        List<Shipment> shipments = getAllShipment();
        if (shipmentID == null && date == null) {
            return shipments;
        }
        if (shipmentID.isEmpty() && date.isEmpty()) {
            return shipments;
        }

        List<Shipment> results = new ArrayList<>();
        for (Shipment shipment: shipments) {
            if(shipmentID !=null && !shipmentID.isEmpty() && shipment.getID() == Integer.parseInt(shipmentID)) {
                results.add(shipment);
            }
            else if(date != null && shipment.getDate().equals(date)) {
                results.add(shipment);
            }
        }
        return results;
    }

    //Add a submitted shipment into the database
    public void addShipment(int shipmentID, int orderID, int userID, String date,
            String address, String shipmentType) throws SQLException {
        //code for add-operation
        String createQueryString = "INSERT INTO shipments VALUES (" + shipmentID
                + ", " + userID + ", " + orderID + ", '" + date + "', '" + address + "', '" + shipmentType + "')";
        boolean shipmentCreated = st.executeUpdate(createQueryString) > 0;

        if (shipmentCreated) {
            System.out.println("shipment created");
        } else {
            System.out.println("shipment not created");
        }
    }

    //update shipment details in the database
    public void updateShipment(int shipmentID, int orderID, int userID, String date,
            String address, String shipmentType) throws SQLException {
        //code for update-operation

        String updateQueryString = "update Shipments set ID = " + shipmentID
                + ", orderID= " + orderID + ", userID = " + userID 
                + ", date = '"+ date + "', address = '" + address + "', "
                + " shipmentType = '" + shipmentType + "' where ID=" + shipmentID + "";
        System.out.println(updateQueryString);
        st.executeUpdate(updateQueryString);

    }

    //change status of shipment to cancelled from the database
    public void deleShipment(int shipmentID) throws SQLException {
        //code for delete-operation

        String updateQueryString = "delete from Shipments where ID = " + shipmentID;
        st.executeUpdate(updateQueryString);
    }
}
