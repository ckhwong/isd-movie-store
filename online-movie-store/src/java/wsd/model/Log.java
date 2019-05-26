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
    private Date initialDate;
    private Date finalDate;
    
    // constructors
    public Log() {
        super();
    }
    
    public Log(int logID, int userID, Date initialDate, Date finalDate) {
        this.logID = logID;
        this.userID = userID;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }
    
    // public methods
    
    // getters/setters
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
    
    public Date getInitialDate() {
        return initialDate;
    }
    
    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }
    
    public Date getFinalDate() {
        return finalDate;
    }
    
    public void setFinalDate(Date finalDate) {
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
