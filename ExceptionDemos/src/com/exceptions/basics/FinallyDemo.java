package com.exceptions.basics;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("welcome");
            String value="Priya";
            System.out.println("value "+value);
            int num=Integer.parseInt(value);
            System.out.println("Number "+num);
            int result=100/num;
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        finally {
            System.out.println("close the connection");
        }
        System.out.println("continue.....");
    }
}
