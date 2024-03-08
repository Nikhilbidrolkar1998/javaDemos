package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID=2L;
    private String name;
    private int studentid;
    private transient String department;

    public Student() {
        super();
    }

    public Student(String name, int studentid, String department) {
        this.name = name;
        this.studentid = studentid;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentid=" + studentid +
                ", department='" + department + '\'' +
                '}';
    }
}
