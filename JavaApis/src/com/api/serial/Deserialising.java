package com.api.serial;

import java.io.*;

public class Deserialising {
    public static void main(String[] args) {
        try(
               FileInputStream fileInputStream=new FileInputStream("stud.ser");
                ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        ){
            Student student=(Student) objectInputStream.readObject();
            System.out.println(student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
