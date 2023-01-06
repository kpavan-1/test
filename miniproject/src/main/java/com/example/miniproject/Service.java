package com.example.miniproject;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

public class Service {

    @Autowired
    Repository repository;

    public void addMovie(Movie movie) {
        repository.addMovie(movie);
    }

    public String getMovie(Movie movie) throws SQLException {
     return repository.getMovieName(movie);
    }
    public String getDirector(Movie director) throws SQLException {
      return repository.getDirectorName(director);
    }
}
