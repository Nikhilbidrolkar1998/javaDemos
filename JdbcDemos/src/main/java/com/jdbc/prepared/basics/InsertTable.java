package com.jdbc.prepared.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String password="root";
        try(
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();){
            String sql = "insert into employee values('Ramu',13,'Hubli')";
            boolean result = statement.execute(sql);
            System.out.println("Data insered " + !result);
        }catch (Exception e){
            System.out.println();
            e.printStackTrace();
        }
    }
}
