package com.example.miniproject;



import java.sql.*;

public class Repository {
    public Connection connection;
    public Repository() throws SQLException {
        getConnection();
        createTable();
    }

    public Connection getConnection() throws SQLException {
        if(connection==null){
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","Pavan@123");
        }
        return connection;
    }

    public void createTable() throws SQLException {
        String sql = "create table if not exists movie(id INT primary key auto_increment,movieName VARCHAR(30), name VARCHAR(30))";
        Statement st = connection.createStatement();
        boolean return_value = st.execute(sql);
    }

    public void addMovie(Movie movie){
        String sql = "insert into movie(movieName,directorName) values("+movie.getMovieName()+",'"+movie.getDirectorName()+"')";
    }
    public String getDirectorName(Movie name) throws SQLException {
        String sql = "Select directorName from movie where movieName=name ";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return sql;
    }

    public String getMovieName(Movie name) throws SQLException {
        String sql = "Select movieName from movie where directorName=name ";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return sql;
    }

}
