/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd;

import java.io.Serializable;

/**
 *
 * @author Christopher Wong
 */
public class Movie implements Serializable{
    private int movieID;
    private String title;
    private String genre;
    private String year;
    private double price;
    private int stock;

    public Movie() {
        super();
    }

    public Movie(int movieID, String title, String genre, String year, 
            double price, int stock) {
        this.movieID = movieID;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.price = price;
        this.stock = stock;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int MovieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }  
}
