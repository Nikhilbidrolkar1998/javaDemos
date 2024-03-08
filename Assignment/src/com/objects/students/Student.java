package com.objects.students;

public class Student {
    String studentName;
    String department;

    public Student(String studentName, String department) {
        this.studentName = studentName;
        this.department = department;
    }
    void printDetails(){
        System.out.println("Student Name is "+studentName);
        System.out.println("Department is "+department);
    }
    String getGrades(int... marks){
        int sum=0;
        for(int mark:marks)
        {
            sum=sum+mark;
        }
        int average=sum/marks.length;
        if(average>=90 && average<= 100){
            return "Grade is A";
        } else if (average>=80 && average< 90) {
            return "Grade is B";
        }
        else if (average>=70 && average<80){
            return "Grade is C";
        }
        else if (average>=60 && average<70){
            return "Grade is D";
        }
        else if (average>=50 && average<=59){
            return "Grade is E";
        }
        return "fail";
    }
}
