package dao;

import com.jspiders.dao.AuditoriumDaoImpl;
import com.jspiders.dao.BookingDaoImpl;

public class BookingDaoTests {
    public static void main(String[] args){
        testAddBooking();
    }

    public static void testAddBooking() {
        System.out.println("Testing add Movie");
        try{
            BookingDaoImpl bookingDao = new BookingDaoImpl();
            bookingDao.addBooking();
            System.out.println("Add Movie Test passed");
        }catch (Exception e){
            System.out.println("add Movie test failed");
        }
    }
}
