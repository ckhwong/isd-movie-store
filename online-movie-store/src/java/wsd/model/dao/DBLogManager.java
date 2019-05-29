/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd.model.dao;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import wsd.model.Log;

/**
 *
 * @author William Palmer
 */
public class DBLogManager {

    // private variables
    private Statement st;

    // constructors
    public DBLogManager(Connection conn) throws SQLException {
        st = conn.createStatement();
    }

    // methods
    // Check if a given date is valid
    public boolean isValidDate(String checkDate) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(checkDate.trim());
        } catch (ParseException pe) {
            return false;
        }

        return true;
    }

    // Create a log to enter into the database
    public void createLog(int logID, int userID, Date initialDate, Date finalDate) throws SQLException {

        String createQueryString = "insert into Logs"
                + "values ('" + logID + "', '" + userID + "', '"
                + initialDate + "', '" + finalDate + "')";

        boolean logCreated = st.executeUpdate(createQueryString) > 0;

        if (logCreated) {
            System.out.println("logged");
        } else {
            System.out.println("log denied.");
        }

    }

    // Delete a specific log from the database by logID
    public void deleteLog(int logID) throws SQLException {

        String deleteQueryString = "delete from Logs where logID= '" + logID + "' ";

        boolean logDeleted = st.executeUpdate(deleteQueryString) > 0;

        if (logDeleted) {
            System.out.println("deleted.");
        } else {
            System.out.println("deletion denied.");
        }

    }

    // Get all logs for a specific user
    public Log[] getLogs(int userID) throws SQLException {

        Log[] logList;

        String searchQueryString = "select * from Logs where userID='"
                + userID + "'";

        ResultSet rs = st.executeQuery(searchQueryString);

        int resultInt = 0;

        int resultCount = 0;
        if (rs.last()) {
            resultCount = rs.getRow();
            rs.beforeFirst();
        }

        logList = new Log[resultCount];

        while (rs.next()) {

            int lID = Integer.parseInt(rs.getString("logID"));
            int uID = Integer.parseInt(rs.getString("userID"));
            String iDate = rs.getString("initialDate");
            String fDate = rs.getString("finalDate");

            logList[resultInt] = new Log(lID, uID, iDate, fDate);

            resultInt++;
        }

        return logList;

    }

    // Get all Logs for a specific user with a specific initial login date
    public Log[] getLogs(int userID, String checkDate) throws SQLException {

        if (isValidDate(checkDate)) {

            Log[] logList;

            String searchQueryString = "select * from Logs where userID='"
                    + userID + "'";

            ResultSet rs = st.executeQuery(searchQueryString);

            int resultInt = 0;

            int resultCount = 0;
            if (rs.last()) {
                resultCount = rs.getRow();
                rs.beforeFirst();
            }

            logList = new Log[resultCount];

            while (rs.next()) {

                int lID = Integer.parseInt(rs.getString("logID"));
                int uID = Integer.parseInt(rs.getString("userID"));
                String iDate = rs.getString("initialDate");
                String fDate = rs.getString("finalDate");

                logList[resultInt] = new Log(lID, uID, iDate, fDate);

                resultInt++;
            }

            String comparatorString = "";

            resultCount = 0;
            resultInt = 0;
            while (resultCount < logList.length) {
                comparatorString = logList[resultCount].getInitialDateAsSolitaryString();
                if (comparatorString.equals(checkDate)) {
                    resultInt++;
                }

                resultCount++;
            }

            Log[] finalLogList = new Log[resultInt];

            resultCount = 0;
            resultInt = 0;
            while (resultCount < logList.length) {
                comparatorString = logList[resultCount].getInitialDateAsSolitaryString();
                if (comparatorString.equals(checkDate)) {
                    finalLogList[resultInt] = logList[resultCount];
                    resultInt++;
                }

                resultCount++;
            }

            return finalLogList;
        }

        return new Log[0];

    }

}
