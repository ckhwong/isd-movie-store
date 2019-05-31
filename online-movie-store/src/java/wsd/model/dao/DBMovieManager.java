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
import wsd.model.*;

/**
 *
 * @author Christopher Wong
 */
public class DBMovieManager {
    private Statement st;

    public DBMovieManager() {
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

    public DBMovieManager(Connection conn) throws SQLException {
        st = conn.createStatement();
    }
    
    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        String sql = "select * from movies";

        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int ID = rs.getInt("movieID");
                String title = rs.getString("title");
                int duration = rs.getInt("duration");
                String genre = rs.getString("genre");
                double price = rs.getDouble("price");
                int stock = rs.getInt("stock");
                Movie movie = new Movie(ID, title, duration, genre, price, stock);
                movies.add(movie);
            }
        } catch (SQLException e) {
            System.err.print(e);
        }
        return movies;
    }
}

