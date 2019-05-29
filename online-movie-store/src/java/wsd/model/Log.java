/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd.model;

import java.util.Date;
import java.io.Serializable;
import java.text.SimpleDateFormat;
/**
 *
 * @author William Palmer
 */
public class Log implements Serializable {
    
    // private variables
    private int logID;
    private int userID;
    private String initialDate;
    private String finalDate;
    
    // constructors
    public Log() {
        super();
    }

    public Log(int logID, int userID, String initialDate, String finalDate) {
        this.logID = logID;
        this.userID = userID;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }
      
    // misc. convenience methods
    
    // Get the initial date as a String that shows only the date
    public String getInitialDateAsSolitaryString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(initialDate);
    }
    
    // Get the initial time that the login took place
    public String getInitialDateAsTimeString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(initialDate);
    }
    
    // Get the final date as a String that shows only the date
    public String getFinalDateAsSolitaryString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(finalDate);
    }
    
    // Get the time that the user logged out or closed session
    public String getFinalDateAsTimeString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(finalDate);
    }
    
    
    
}
