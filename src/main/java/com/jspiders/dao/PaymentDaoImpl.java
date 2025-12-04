package com.jspiders.dao;

import com.jspiders.config.DBConfig;
import org.hibernate.Session;

public class PaymentDaoImpl implements PaymentDao {

    @Override
    public void addPayment() {
        System.out.println("add Booking details ");
        Session session = DBConfig.getSession();
        //logic
        session.close();
    }

    @Override
    public void getPayment(Long paymentId) {
        System.out.println("get payment details by id "+paymentId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }

    @Override
    public void updatePayment(Long paymentId) {
        System.out.println("update payment details by id "+paymentId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }

    @Override
    public void deletePayment(Long paymentId) {
        System.out.println("delete payment details by id "+paymentId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }
}
