package com.jdbc.prepared.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQuery {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String password="root";

        try(
                Connection connection= DriverManager.getConnection(url,userName,password);
                Statement statement=connection.createStatement();
                ) {
            String sql="update employee set employeeId=10 where employeeId=1;";
            boolean result = statement.execute(sql);
            System.out.println("Data updated " + !result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
