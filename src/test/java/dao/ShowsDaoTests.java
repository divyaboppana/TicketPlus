package dao;

import com.jspiders.dao.AuditoriumDaoImpl;
import com.jspiders.dao.MovieDaoImpl;
import com.jspiders.dao.ShowDaoImpl;
import com.jspiders.entity.AuditoriumEntity;
import com.jspiders.entity.MovieEntity;
import com.jspiders.entity.ShowEntity;
import com.jspiders.enums.ShowStatus;

import java.time.LocalDate;

public class ShowsDaoTests {
    public static void main(String[] args){
        testAddShow();
    }

    public static void testAddShow() {
        System.out.println("Testing add Show");
        try{
            ShowDaoImpl showDao = new ShowDaoImpl();

            AuditoriumDaoImpl auditoriumDao=new AuditoriumDaoImpl();
            MovieDaoImpl movieDao = new MovieDaoImpl();

            ShowEntity showEntity=new ShowEntity();
            showEntity.setShow_Time(LocalDate.now());
            showEntity.setEnd_time(LocalDate.now());
            showEntity.setStatus(ShowStatus.Open);

            AuditoriumEntity auditoriumEntity = auditoriumDao.getAuditorium(1l);
            showEntity.setAuditorium(auditoriumEntity);

            MovieEntity movieEntity = movieDao.getMovie(1l);
            showEntity.setMovie(movieEntity);
            showDao.addShows(showEntity);
            System.out.println("Add show Test passed");
        }catch (Exception e){
            System.out.println("add show test failed");
        }
    }
}
