package wsd.model.dao;

import java.sql.Connection;

/**
 * Super class of DAO classes that manager connection and operation with the database
 * @author Christopher Wong
 */
public abstract class DB {
    protected String URL = "jdbc:derby://localhost:1527/movie-store";//replace empty-string with jdbc:derby local host url
    protected String db = "movie-store";//name of the database
    protected String dbuser = "app";//db root user
    protected String dbpass = "admin"; //db root password
    protected String driver = "org.apache.derby.jdbc.ClientDriver"; //jdbc client driver - built in with NetBeans
    protected Connection conn; //connection null-instance to be initialized in sub-classes
}
