package com.stackroute.movieservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Movie {
	@Id
	private int movieId;
	private String movieName;
	private String movieDesc;
	private int movieYear;

//	public Movie() {
//
//	}
//
//	public Movie(int movieId, String movieName, String movieDesc, int movieYear) {
//		super();
//		this.movieId = movieId;
//		this.movieName = movieName;
//		this.movieDesc = movieDesc;
//		this.movieYear = movieYear;
//	}
//
//	// movie id
//	public int getMovieId() {
//		return movieId;
//	}
//
//	public void setMovieId(int movieId) {
//		this.movieId = movieId;
//	}
//
//	// movie name
//	public String getMovieName() {
//		return movieName;
//	}
//
//	public void setMovieName(String movieName) {
//		this.movieName = movieName;
//	}
//
//	// movie desc
//	public String getMovieDesc() {
//		return movieDesc;
//	}
//
//	public void setMovieDesc(String movieDesc) {
//		this.movieDesc = movieDesc;
//	}
//
//	public int getMovieYear() {
//		return movieYear;
//	}
//
//	public void setMovieYear(int movieYear) {
//		this.movieYear = movieYear;
//	}

}
