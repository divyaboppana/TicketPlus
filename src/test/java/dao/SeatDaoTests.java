package dao;

import com.jspiders.dao.AuditoriumDaoImpl;
import com.jspiders.dao.SeatDaoImpl;

public class SeatDaoTests {
    public static void main(String[] args){
        testAddSeat();
    }

    public static void testAddSeat() {
        System.out.println("Testing add Movie");
        try{
            SeatDaoImpl seatDao = new SeatDaoImpl();
            seatDao.addSeat();
            System.out.println("Add Movie Test passed");
        }catch (Exception e){
            System.out.println("add Movie test failed");
        }
    }
}
