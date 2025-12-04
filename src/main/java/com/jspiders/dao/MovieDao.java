package com.jspiders.dao;

import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;

import java.util.List;

public interface MovieDao {
    void addMovie(MovieEntity movieEntity);
    MovieEntity getMovie(Long movieId);
    List<MovieEntity> getMovieByStatus(MovieStatus status);
    MovieEntity getMovieByTitle(String title);

    void updateMovie(Long movieId);
    void deleteMovie(Long movieId);
}
