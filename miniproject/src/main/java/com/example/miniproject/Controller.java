package com.example.miniproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    Service movieService;

    @PostMapping("/movies/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody(required = true) Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity("New Movie Added Successfully", HttpStatus.CREATED);
    }

    @GetMapping("/movies/get-director/{director}")
    public ResponseEntity<String> getDirector(@PathVariable Movie director) throws SQLException {
        String dir=movieService.getDirector(director);
        return new ResponseEntity(dir,HttpStatus.CREATED);
    }

    @GetMapping("/movies/get-movie/{movie}")
    public ResponseEntity<String> getMovie(@PathVariable Movie movie) throws SQLException {
        String mov=movieService.getMovie(movie);
        return new ResponseEntity(mov,HttpStatus.CREATED);
    }

}
