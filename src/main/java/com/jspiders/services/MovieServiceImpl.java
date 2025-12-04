package com.jspiders.services;

import com.jspiders.dao.MovieDaoImpl;
import com.jspiders.dto.MovieDto;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;

public class MovieServiceImpl implements MovieService{

   private MovieDaoImpl movieDao = new MovieDaoImpl();
    @Override
    public void addMovie(MovieDto movieDto) {

        //covert movieDto to movieEntity
        MovieEntity movieEntity=new MovieEntity();

        //mapping movieDto to movieEntity

        movieEntity.setTitle(movieDto.getTitle());
        movieEntity.setLanguage(movieDto.getLanguage());
        movieEntity.setDuration(movieDto.getDuration());
        movieEntity.setCertification(movieDto.getCertificate());
        movieEntity.setStatus(movieDto.getStatus());
        movieEntity.setCreatedBy(movieDto.getCreatedBy());

        movieDao.addMovie(movieEntity);

    }

    @Override
    public MovieEntity getMovie(Long movieId) {
        return null;
    }


}
