package dao;

import com.jspiders.dao.AuditoriumDaoImpl;
import com.jspiders.entity.AuditoriumEntity;

public class AuditoriumDaotests {
    public static void main(String[] args){
        //testAddAuditorium();

    }

    public static void testAddAuditorium() {
        System.out.println("Testing add Auditorium");
        try{
            AuditoriumDaoImpl auditoriumDao = new AuditoriumDaoImpl();

            AuditoriumEntity auditoriumEntity=new AuditoriumEntity();
            auditoriumEntity.setAudi_Name("Phinix");
            auditoriumEntity.setSeat_Rows(30);
            auditoriumEntity.setSeat_Cols(20);
            auditoriumDao.addAuditorium(auditoriumEntity);
            System.out.println("Add Auditorium Test passed");
        }catch (Exception e){
            System.out.println("add Auditorium test failed");
        }
    }
    public static void testGetAuditorium(Long audiId){

    }

}
