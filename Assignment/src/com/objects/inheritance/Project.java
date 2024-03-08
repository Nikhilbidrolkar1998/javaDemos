package com.objects.inheritance;

public class Project {
    String projName;
    int durationinMonths;
    String domain;
    String projectManager;

    public Project(String projName, int durationinMonths, String domain, String projectManager) {
        this.projName = projName;
        this.durationinMonths = durationinMonths;
        this.domain = domain;
        this.projectManager = projectManager;
    }

    void shoeProjectDetails(){
        System.out.println("Project Name "+projName);
        System.out.println("Duration in Months "+durationinMonths);
        System.out.println("Project domain "+domain);
        System.out.println("Project Manager "+projectManager);
    }

}
