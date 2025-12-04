package dao;

import com.jspiders.dao.AuditoriumDaoImpl;
import com.jspiders.dao.PaymentDaoImpl;

public class PaymentDaoTests {
    public static void main(String[] args){
        testAddPayments();
    }

    public static void testAddPayments() {
        System.out.println("Testing add Movie");
        try{
            PaymentDaoImpl paymentDao = new PaymentDaoImpl();
            paymentDao.addPayment();
            System.out.println("Add Movie Test passed");
        }catch (Exception e){
            System.out.println("add Movie test failed");
        }
    }
}
