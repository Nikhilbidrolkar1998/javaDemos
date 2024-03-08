package com.exceptions.basics;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            System.out.println("welcome");
            String value=args[0];
            System.out.println("value "+value);
            int num=Integer.parseInt(value);
            System.out.println("Number "+num);
            int result=100/num;
            System.out.println(result);
            int marks[]=null;
            System.out.println(marks[0]);
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException | ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("enter value");
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("completed.....");
    }
}
