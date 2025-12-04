package com.jspiders.dao;

import com.jspiders.config.DBConfig;
import com.jspiders.entity.MovieEntity;
import com.jspiders.enums.MovieStatus;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class MovieDaoImpl implements MovieDao{
    public void addMovie(MovieEntity movieEntity){
        System.out.println("Adding movie");
        Session session = DBConfig.getSession();

        Transaction transaction=session.beginTransaction();
        session.persist(movieEntity);
        transaction.commit();
        //logics
        session.close();
    }
    public MovieEntity getMovie(Long movieId){
        System.out.println("Finding Movie by id: "+movieId);
        Session session = DBConfig.getSession();
        Transaction transaction= session.beginTransaction();
        MovieEntity movieEntity = session.find(MovieEntity.class,movieId);

        transaction.commit();
        //logics
        session.close();
        return movieEntity;
    }

    @Override
    public List<MovieEntity> getMovieByStatus(MovieStatus status) {
        System.out.println("Finding Movie by status: "+status);

        Session session = DBConfig.getSession();

        String selectMVByStatus_HQL = "FROM MovieEntity mv WHERE mv.status = :status";

        Query<MovieEntity> query = session.createQuery(selectMVByStatus_HQL, MovieEntity.class);
        query.setParameter("status",status);

        Transaction transaction= session.beginTransaction();

        List<MovieEntity> resultList=query.getResultList();

        transaction.commit();
        session.close();

        return resultList;
    }

    @Override
    public MovieEntity getMovieByTitle(String title) {
        System.out.println("Finding Movie by status: "+title);

        Session session = DBConfig.getSession();

        String selectMVByStatus_HQL = "FROM MovieEntity mv WHERE mv.title = :title";

        Query<MovieEntity> query = session.createQuery(selectMVByStatus_HQL, MovieEntity.class);
        query.setParameter("title",title);

        Transaction transaction= session.beginTransaction();

        MovieEntity resultList=query.uniqueResult();

        transaction.commit();
        session.close();

        return resultList;

    }

    public void updateMovie(Long movieId){
        System.out.println("updating movie by id: "+movieId);
        Session session = DBConfig.getSession();
        //logic
        session.close();
    }
    public void deleteMovie(Long movieId){
        System.out.println("delete movie by id: "+movieId);
        Session session = DBConfig.getSession();
        //logic
        session.close();
    }
}
