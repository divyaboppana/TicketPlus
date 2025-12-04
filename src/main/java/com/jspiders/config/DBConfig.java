package com.jspiders.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DBConfig {
    private static SessionFactory sessionFactory;
    static {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        System.out.println("Loading configuration");

        sessionFactory = configuration.buildSessionFactory();
        System.out.println("build sessionfatory");
    }

    public static Session getSession(){
        Session session = sessionFactory.openSession();
        System.out.println("session opened");
        return session;
    }

    public static void shutdown(){
        sessionFactory.close();
        System.out.println("Session closed");
    }
}
