package com.example.MovieTime.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.MovieTime.Entity.Movie;
//localhost:8080/MovieTime/movie
@RepositoryRestResource(path="movie")
@CrossOrigin("http://localhost:4200")
public interface MovieDao extends JpaRepository<Movie, Integer>{
 public List<Movie> findByMovieName(String movieName);

}
