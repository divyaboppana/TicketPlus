package com.jspiders.main;

import com.jspiders.users.AdminServiceImpl;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Scanner;

public class TicketPlusApplication {
    static Scanner s= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===welcome to TicketPlus===");

        System.out.println("enter user type \n" +
                "1. Admin \n" +
                "2. Customer \n" +
                "3. Exit");
        Integer user=s.nextInt();
        switch (user){
            case 1:
                System.out.println("Admin");
                System.out.println("enter choice of user \n" +
                        "1. add Movie \n" +
                        "2. add show \n" +
                        "3. Exit");

                Integer options=s.nextInt();
                //From admin class
                AdminServiceImpl adminService=new AdminServiceImpl();

                switch (options){
                    case 1:
                        System.out.println("add movie");
                        adminService.createMovie();
                        break;
                    case 2:
                        System.out.println("add show");
                        break;
                }
                break;

            case 2:
                System.out.println("customer choice");
                break;

            default:
                System.exit(0);
        }
        System.out.println("==Thank you visit again==");
    }
}
