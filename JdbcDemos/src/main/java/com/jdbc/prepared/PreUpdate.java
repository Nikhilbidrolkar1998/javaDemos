package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String password="root";
        String sql="update cab set driver_name=? where cab_number=?";
                try(
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement statement = connection.prepareStatement(sql);){
                Scanner sc=new Scanner(System.in);

                int cabNumber=sc.nextInt();
                String driverName=sc.next();

                statement.setInt(2,cabNumber);
                statement.setString(1,driverName);
                boolean result=statement.execute();
                System.out.println(result);
            } catch (Exception e){
            e.printStackTrace();
        }
    }
}
