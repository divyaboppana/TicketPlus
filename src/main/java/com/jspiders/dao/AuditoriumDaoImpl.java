package com.jspiders.dao;

import com.jspiders.config.DBConfig;
import com.jspiders.entity.AuditoriumEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AuditoriumDaoImpl implements AuditoriumDao{
    @Override
    public void addAuditorium(AuditoriumEntity auditoriumEntity) {
        System.out.println("add Auditorium");
        Session session = DBConfig.getSession();

        Transaction transaction=session.beginTransaction();
        session.persist(auditoriumEntity);
        transaction.commit();
        session.close();
    }

    @Override
    public AuditoriumEntity getAuditorium(Long audiId) {
        System.out.println("get aditorium details by id "+audiId);

        Session session = DBConfig.getSession();

        Transaction transaction= session.beginTransaction();
        AuditoriumEntity auditoriumEntity=session.find(AuditoriumEntity.class,audiId);

       // session.find();
        //logic
        transaction.commit();
        session.close();

        return auditoriumEntity;

    }

    @Override
    public void updateAuditorium(Long audiId) {
        System.out.println("update aditorium details by id "+audiId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }

    @Override
    public void deleteAuditorium(Long audiId) {
        System.out.println("delete aditorium details by id "+audiId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }
}
