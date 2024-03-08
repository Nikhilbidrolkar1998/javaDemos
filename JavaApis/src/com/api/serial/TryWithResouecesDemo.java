package com.api.serial;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResouecesDemo {
    public static void main(String[] args) {
        try(FileWriter fileWriter=new FileWriter("trial.txt");
            FileReader fileReader=new FileReader("demo.txt");){
            int num=fileReader.read();
            fileWriter.write((char)num);
            do{
                num=fileReader.read();
                fileWriter.write((char)num);
            }while (num!=-1);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
