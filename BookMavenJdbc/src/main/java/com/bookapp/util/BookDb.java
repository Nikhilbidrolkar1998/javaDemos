package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDb {
    static Connection connection;
    public static Connection openConnection(){
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String password="root";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
