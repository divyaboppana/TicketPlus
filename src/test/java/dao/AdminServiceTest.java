package dao;

import com.jspiders.users.AdminServiceImpl;

public class AdminServiceTest{

    public static void main(String[] args) {
        createMovieTest();
    }

    private static void createMovieTest() {
        System.out.println("Testing add Movie");
        try{
            AdminServiceImpl adminService = new AdminServiceImpl();
            adminService.createMovie();

            System.out.println("Admin - create Movie Test passed");
        }catch (Exception e){
            System.out.println("Admin - create Movie test failed");
            e.printStackTrace();
        }
    }
}
