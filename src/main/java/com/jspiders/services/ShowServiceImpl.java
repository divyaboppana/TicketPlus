package com.jspiders.services;

import com.jspiders.dao.AuditoriumDaoImpl;
import com.jspiders.dao.MovieDaoImpl;
import com.jspiders.dao.ShowDaoImpl;
import com.jspiders.dto.MovieDto;
import com.jspiders.dto.ShowDto;
import com.jspiders.entity.AuditoriumEntity;
import com.jspiders.entity.MovieEntity;
import com.jspiders.entity.ShowEntity;
import com.jspiders.enums.ShowStatus;

import java.time.LocalDate;
import java.util.Scanner;

public class ShowServiceImpl implements ShowService{
    static Scanner s=new Scanner(System.in);
    private ShowDaoImpl showDao=new ShowDaoImpl();

    @Override
    public void addShow(Long audiId, Long movieId, ShowDto showDto) {
        AuditoriumDaoImpl auditoriumDao=new AuditoriumDaoImpl();
        MovieDaoImpl movieDao = new MovieDaoImpl();

        ShowEntity showEntity=new ShowEntity();

        System.out.println("Enter show_time");
        String show_Time= s.next();
        showEntity.setShow_Time(showEntity.getShow_Time());

        System.out.println("Enter show_time");
        String end_Time= s.next();
        showEntity.setEnd_time(showEntity.getEnd_time());

        System.out.println("by default status is open");
        showEntity.setStatus(showEntity.getStatus());

        AuditoriumEntity auditoriumEntity = auditoriumDao.getAuditorium(1l);

        showEntity.setAuditorium(auditoriumEntity);
        MovieEntity movieEntity = movieDao.getMovie(1l);

        showEntity.setMovie(movieEntity);
        showDao.addShows(showEntity);
    }
}
