package com.jspiders.dao;

public interface BookingDao {
    public void addBooking();

    void getBooking(Long bookId);

    void updateBooking(Long bookId);

    void deleteBooking(Long bookId);
}
