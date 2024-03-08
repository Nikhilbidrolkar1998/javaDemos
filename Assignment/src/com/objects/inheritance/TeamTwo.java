package com.objects.inheritance;

public class TeamTwo extends Project{
    String[] tools;

    public TeamTwo(String projName, int durationinMonths, String domain, String projectManager, String[] tools) {
        super(projName, durationinMonths, domain, projectManager);
        this.tools = tools;
    }
    void showSupportTools(){
        for(String  tool:tools){
            System.out.println(tool);
        }
    }
}
