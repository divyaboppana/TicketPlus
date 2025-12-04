package com.jspiders.dao;

import com.jspiders.config.DBConfig;
import com.jspiders.entity.ShowEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ShowDaoImpl implements ShowsDao{
    @Override
    public void addShows(ShowEntity showEntity) {

        System.out.println("add show ");
        Session session = DBConfig.getSession();

        Transaction transaction=session.beginTransaction();
        //logic
        session.persist(showEntity);
        transaction.commit();
        session.close();

    }

    @Override
    public void getShows(Long showId) {
        System.out.println("get show details by id "+showId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }

    @Override
    public void updateShows(Long showId) {
        System.out.println("update show details by id "+showId);
        Session session = DBConfig.getSession();
        //logic
        session.close();
    }

    @Override
    public void deleteShows(Long showId) {
        System.out.println("delete show details by id "+showId);
        Session session = DBConfig.getSession();
        //logic
        session.close();
    }
}
