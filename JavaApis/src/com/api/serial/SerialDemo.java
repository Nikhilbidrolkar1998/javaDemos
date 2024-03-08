package com.api.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {
    public static void main(String[] args) {
        Student student=new Student("sri",10,"cse");
        System.out.println("Serializing");
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("stud.ser");
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            ){
            objectOutputStream.writeObject(student);
            System.out.println("completed");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
