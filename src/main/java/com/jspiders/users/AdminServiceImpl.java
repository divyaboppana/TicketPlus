package com.jspiders.users;

import com.jspiders.dto.MovieDto;
import com.jspiders.enums.MovieStatus;
import com.jspiders.services.MovieServiceImpl;

import java.util.Scanner;

public class AdminServiceImpl implements AdminService{
    @Override
    public void createMovie() {
        System.out.println("Testing add Movie");
        try{
            MovieServiceImpl movieService = new MovieServiceImpl();

            Scanner s=new Scanner(System.in);

            MovieDto movieDto=new MovieDto();

            System.out.println("Enter movie title");
            String title=s.next();
            movieDto.setTitle(title);

            System.out.println("Enter movie language");
            String language=s.next();
            movieDto.setLanguage(language);

            System.out.println("Enter movie duration");
            Integer duration=s.nextInt();
            movieDto.setDuration(duration);

            System.out.println("Enter movie certificate");
            String certificate=s.next();
            movieDto.setCertificate(certificate);

            //System.out.println("Select Status of movie");

            //default Available on first time adding movie
            movieDto.setStatus(MovieStatus.Available);

            //will set the value dynamically in Springs
            movieDto.setCreatedBy(301L);

            System.out.println();
            System.out.println("====Verify movie detils====");
            System.out.println(movieDto);
            System.out.println("====verified====");

            movieService.addMovie(movieDto);

            System.out.println("Movie created successfully");
        }catch (Exception e){
            System.out.println("Movie created failed");
        }
    }

}
