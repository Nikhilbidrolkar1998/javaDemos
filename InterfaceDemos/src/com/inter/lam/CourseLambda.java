package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {

        ICourse course=()->new String[]{"html","css","bootstrap"};
        String[] web=course.showCourses();

        course=()->new String[]{"aws","googlecloud","azur"};
        String[] cloud=course.showCourses();

        course=()->new String[]{"java","spring","junit"};
        String[] java=course.showCourses();

        for(String one:java)
        {
            System.out.println(one);
        }
    }
}
