package com.objects.inheritance;

public class TeamOne extends Project{
    String techStack;

    public TeamOne(String projName, int durationinMonths, String domain, String projectManager, String techStack) {
        super(projName, durationinMonths, domain, projectManager);
        this.techStack = techStack;
    }

    String[] showTechStack(){
        String []tech={"Jdk","maven","ide"};
        return tech;
    }

}
