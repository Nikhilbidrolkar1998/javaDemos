package com.jdbc.prepared.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteQuery {
    public static void main(String[] args) {
        String url="jdbc:/mysql:??localhost:3306/voyatrining";
        String userName="root";
        String password="root";

        try(
                Connection connection= DriverManager.getConnection(url,userName,password);
                Statement statement=connection.createStatement();
        ) {
            String sql="delete employee where employeeId=10;";
            boolean result = statement.execute(sql);
            System.out.println("Data updated " + !result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
