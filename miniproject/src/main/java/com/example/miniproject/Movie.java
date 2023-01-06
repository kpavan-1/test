package com.example.miniproject;



import javax.persistence.*;

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //Auto-generated

    @Column(name = "movieName", nullable = false)
    private String movieName;

    @Column(name = "directorName", nullable = false)
    private String directorName;

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Movie(int id, String movieName, String directorName) {
        this.id = id;
        this.movieName = movieName;
        this.directorName = directorName;
    }

    public Movie() {
    }
}

