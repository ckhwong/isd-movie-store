package wsd.model.dao;

import wsd.model.User;
import java.sql.*;

/**
 *
 * @author George
 * 
 * DBManager is the primary DAO class to interact with the database and perform CRUD operations with the db.
 * Firstly, complete the existing methods and implement them into the application.
 * 
 * So far the application uses the Read and Create operations in the view.
 * Secondly, improve the current view to enable the Update and Delete operations.
 */
public class DBUserManager {

    private Statement st;

    public DBUserManager(Connection conn) throws SQLException {
        st = conn.createStatement();
    }

    //Find student by ID in the database
    public User findUser(int ID, String password) throws SQLException {
        //setup the select sql query string
        String searchQueryString = "select * from users where userID=" + ID + " AND password= '" + password + "' ";
        //execute this query using the statement field
       //add the results to a ResultSet
         ResultSet rs = st.executeQuery(searchQueryString);
        //search the ResultSet for a student using the parameters
         boolean hasUser = rs.next();
         User userFromDB = null;
                 
         if(hasUser){
         
             int sID = Integer.parseInt(rs.getString("userID"));
             String sPassword = rs.getString("password"); 
             String sEmail = rs.getString("email");
             String sName = rs.getString("name");
             String sPhone = rs.getString("phoneno");
             
             userFromDB = new User (sID, sEmail, sName, sPassword, sPhone);
         }
        
         rs.close();
        // st.close();
         
         return userFromDB;
         
    }

    //Add a student-data into the database
    public void addUser(int ID, String name, String email, String password, String phone) throws SQLException {        
        //code for add-operation
        
         String createQueryString = "INSERT INTO users " + " VALUES (" + ID +", '"+name+"','"+password+"','"+phone+"','"+email+"')";
         
         
        boolean orderCreated = st.executeUpdate(createQueryString) > 0;
         
         if (orderCreated){
         System.out.println("user created");
         }
         else {
         System.out.println("user not created");
         }
             
    }

    //update a student details in the database
    public void updateUser(int ID, String name, String email, String password, String phone) throws SQLException {
        //code for update-operation
        
        String updateQueryString = "update users set  name= '" + name + "', email= '" + email + "', password = '"  + password + "', phoneno = '" + phone + "' where userID=" + ID + " ";
        boolean recrodUpdated = st.executeUpdate(updateQueryString) > 0;
         
         if (recrodUpdated){
         System.out.println("record updated");
         }
         else {
         System.out.println("record not updated");
         }
       
    }
    
    //delete a student from the database
    public void deleteUser(int ID) throws SQLException{
        //code for delete-operation
        
        String deleteQueryString = "delete from users where userID= " + ID + " ";
        boolean recrodDeleted = st.executeUpdate(deleteQueryString) > 0;
         
         if (recrodDeleted){
         System.out.println("record deleted");
         }
         else {
         System.out.println("record not deleted");
         }
    }
}

