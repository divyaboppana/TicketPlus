package dao;

import com.jspiders.dao.MovieDao;
import com.jspiders.dao.MovieDaoImpl;
import com.jspiders.entity.BaseEntity;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

public class MovieDaoTests {
    public static void main(String[] args){
        //testAddMovie();
        //testgetMovieByStatus();
        testGetMovieByTitle();
    }

    public static void testgetMovieByStatus() {
        System.out.println("Testing to find Movie by the status");
        try{
            MovieDaoImpl movieDao = new MovieDaoImpl();

            MovieEntity movieEntity=new MovieEntity();

            List<MovieEntity> available = movieDao.getMovieByStatus(MovieStatus.Available);
            System.out.println("Movies found : " + available.size());
//            System.out.println(available);
            for (MovieEntity mv : available) {
                System.out.println(mv);
            }
            System.out.println("FIND Movie Test passed");
        }catch (Exception e){
            System.out.println("FIND Movie test failed");
        }

    }

    public static void testGetMovieByTitle(){
        System.out.println("Testing to find Movie by status");
        try{
            MovieDaoImpl movieDao = new MovieDaoImpl();

            //MovieEntity movieEntity=new MovieEntity();

            MovieEntity available = movieDao.getMovieByTitle("Movie-3");

            System.out.println(available);

            System.out.println("FIND Movie Test passed");
        }catch (Exception e){
            System.out.println("FIND Movie test failed");
        }

    }




    public static void testAddMovie() {
        System.out.println("Testing add Movie");
        try{
            MovieDaoImpl movieDao = new MovieDaoImpl();

            MovieEntity movieEntity=new MovieEntity();
            movieEntity.setTitle("Movie-1");
            movieEntity.setLanguage("Eng");
            movieEntity.setDuration(120);
            movieEntity.setCertification("U");
            movieEntity.setStatus(MovieStatus.Available);

            movieDao.addMovie(movieEntity);

            System.out.println("Add Movie Test passed");
        }catch (Exception e){
            System.out.println("add Movie test failed");
        }
    }
}
