package com.exceptions.basics;

public class BasicEx {
    public static void main(String[] args) {
        try {
            System.out.println("welcome");
            String value=args[0];
            System.out.println("value "+value);
            int num=Integer.parseInt(value);
            System.out.println("Number "+num);
            int result=100/num;
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("continue.....");
    }

    public static class MultipleCatch {
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
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println("enter value");
            }
            catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("dont enter 0");
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println("please enter number");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("completed.....");
        }
    }
}
