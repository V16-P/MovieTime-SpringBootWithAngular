package com.example.MovieTime.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="MovieTable")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_Id")
	private int  movieId;
	
	@Column(name="movie_Name", nullable = false)
	private String movieName;
	
	@Column(name="movie_ImagePath")
	private String movieImagePath;
	
	@Column(name="movie_Price", nullable = false)
	private Float moviePrice;
	
	@Column(name="movie_LanguageCategory", nullable = false)
	private String movieLanguageCategory;
	
	@Column(name="movie_VideoPath")
	private String movieVideoPath;
	
	@Lob
	@Column(name="movie_Content", nullable = false)
	private String movieContent;
	
	@Column(name="movie_GenreCategory", nullable = false)
	private String movieGenreCategory;
	
	
	@OneToMany(mappedBy="movie", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Ticket>ticket;
	
   /*	@OneToMany(mappedBy="MovieTable")
	private Set<Ticket>ticke;*/
	
	
	public Movie() {
		
	}

public Movie(int movieId, String movieName, String movieImagePath, Float moviePrice, String movieLanguageCategory,
		String movieVideoPath, String movieContent, String movieGenreCategory) {
	super();
	this.movieId = movieId;
	this.movieName = movieName;
	this.movieImagePath = movieImagePath;
	this.moviePrice = moviePrice;
	this.movieLanguageCategory = movieLanguageCategory;
	this.movieVideoPath = movieVideoPath;
	this.movieContent = movieContent;
	this.movieGenreCategory = movieGenreCategory;
}

public int getMovieId() {
	return movieId;
}

public void setMovieId(int movieId) {
	this.movieId = movieId;
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public String getMovieImagePath() {
	return movieImagePath;
}

public void setMovieImagePath(String movieImagePath) {
	this.movieImagePath = movieImagePath;
}

public Float getMoviePrice() {
	return moviePrice;
}

public void setMoviePrice(Float moviePrice) {
	this.moviePrice = moviePrice;
}

public String getMovieLanguageCategory() {
	return movieLanguageCategory;
}

public void setMovieLanguageCategory(String movieLanguageCategory) {
	this.movieLanguageCategory = movieLanguageCategory;
}

public String getMovieVideoPath() {
	return movieVideoPath;
}

public void setMovieVideoPath(String movieVideoPath) {
	this.movieVideoPath = movieVideoPath;
}

public String getMovieContent() {
	return movieContent;
}

public void setMovieContent(String movieContent) {
	this.movieContent = movieContent;
}

public String getMovieGenreCategory() {
	return movieGenreCategory;
}

public void setMovieGenreCategory(String movieGenreCategory) {
	this.movieGenreCategory = movieGenreCategory;
}

@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieImagePath=" + movieImagePath
			+ ", moviePrice=" + moviePrice + ", movieLanguageCategory=" + movieLanguageCategory + ", movieVideoPath="
			+ movieVideoPath + ", movieContent=" + movieContent + ", movieGenreCategory=" + movieGenreCategory + "]";
}

   
}
