package com.jspiders.dao;

import com.jspiders.config.DBConfig;
import org.hibernate.Session;

public class BookingDaoImpl implements BookingDao{
    @Override
    public void addBooking() {
        System.out.println("add Booking");
        Session session = DBConfig.getSession();
        //logic
        session.close();
    }

    @Override
    public void getBooking(Long bookId) {
        System.out.println("get Booking details by id "+bookId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }

    @Override
    public void updateBooking(Long bookId) {
        System.out.println("update Booking details by id "+bookId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }

    @Override
    public void deleteBooking(Long bookId) {
        System.out.println("delete Booking details by id "+bookId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }
}
