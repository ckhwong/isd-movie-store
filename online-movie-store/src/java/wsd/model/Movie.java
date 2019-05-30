/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd.model;
import java.util.*;
import java.io.Serializable;
import java.sql.Connection;

/**
 *
 * @author Hans
 */
public class Movie implements Serializable{
    private int movieID;
    private String title;
    private int duration;
    private String genre;
    private double price;
    private int stock;

    public Movie() {
        super();
    }

    public Movie(int movieID, String title, int duration,String genre,
            double price, int stock)
    {
        this.movieID = movieID;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.stock = stock;
    }

    public int getMovieID()
    {
        return movieID;
    }

    public void setMovieID(int movieID)
    {
        this.movieID = movieID;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public int getDuration()
    {
        return duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    
    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }  
}