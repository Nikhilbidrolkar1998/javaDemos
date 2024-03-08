package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreSelectOne {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String password="root";
        String sql="select * from cab where drop_loc=?";
        try(
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement statement = connection.prepareStatement(sql);){

            Scanner sc=new Scanner(System.in);
            String dropLocation=sc.next();
                statement.setString(1,dropLocation);


            try (ResultSet resultSet=statement.executeQuery()){

            while (resultSet.next()){
                int cabNumber=resultSet.getInt("cab_number");
                String dropLoc=resultSet.getString("drop_loc");
                String pickupLoc=resultSet.getString("pickup_loc");
                Time pickupTime=resultSet.getTime("pickup_time");
                Date date=resultSet.getDate("pickup_date");
                String driverNme=resultSet.getString("driver_name");

                System.out.println(cabNumber);
                System.out.println(dropLoc);
                System.out.println(pickupLoc);
                System.out.println(pickupTime);
                System.out.println(date);
                System.out.println(driverNme);
                System.out.println("-------------------");
            }}
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
