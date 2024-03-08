package com.util.maps;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> map=new HashMap<>();
        map.put(new Department("Raju",1,"d1"), Arrays.asList(new Student("Nikhil","Dharwad"),
                new Student("Mahesh","Kolar"),
                new Student("Nikhil","Gadag")));
        map.put(new Department("Sanju",2,"d2"), Arrays.asList(new Student("Sandhya","mumbai"),
                new Student("seema","kochhi"),
                new Student("Ramesh","odissa")));
        map.put(new Department("Balaji",3,"d3"), Arrays.asList(new Student("Prathamesh","Nasik"),
                new Student("prajwal","davangeri"),
                new Student("priya","Mysore")));

//        for(Map.Entry<Department,List<Student>> listDepartments:map.entrySet()){
//            System.out.println(listDepartments.getKey());
//            for ()}
        Set<Department> departments=map.keySet();
        for(Department department:departments){
            System.out.println(department.getDeptHead()+" "+department.getDeptName());
            List<Student> students=map.get(department);
            for (Student student:students){
                System.out.println(student.getStudName());
            }
        }
    }
}
