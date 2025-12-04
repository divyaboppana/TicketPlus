package com.jspiders.dao;

import com.jspiders.config.DBConfig;
import org.hibernate.Session;

public class SeatDaoImpl implements SeatDao{
    @Override
    public void addSeat() {
        System.out.println("add seats ");
        Session session = DBConfig.getSession();
        //logic
        session.close();
    }

    @Override
    public void getSeat(Long seatId) {
        System.out.println("get aditorium details by id "+seatId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }

    @Override
    public void updateSeat(Long seatId) {
        System.out.println("update aditorium details by id "+seatId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }

    @Override
    public void deleteSeat(Long seatId) {
        System.out.println("delete aditorium details by id "+seatId);
        Session session = DBConfig.getSession();
        //logic
        session.close();

    }
}
