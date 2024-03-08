package com.objects.inheritance;

public class FinMain {
    public static void main(String[] args) {
        String[] tools={"git","Docker","junit"};
        TeamOne teamOne=new TeamOne("IB",12,"Fin","Abdul","full Stack");
        teamOne.showTechStack();
        teamOne.shoeProjectDetails();

        System.out.println("__________________");

        TeamTwo teamTwo=new TeamTwo("IB",12,"Fin","Abdul",tools);
        teamTwo.shoeProjectDetails();
        teamTwo.showSupportTools();
        //TeamTwo teamTwo1=new TeamTwo("IB",12,"Fin","Abdul")
    }
}
