package com.oops.abstration;

public class AbsMain {
    public static void main(String[] args) {
        Bank bank=new Branch1();
        bank.carLoan();
        bank.eduLoan();
        bank.housingLoan();
        bank.admin();

        Branch1 branch1=(Branch1) bank;
        branch1.staffDetails();

        bank=new SubBranch();
        bank.admin();
        bank.eduLoan();
        bank.housingLoan();
        bank.carLoan();

        Branch2 branch2=(Branch2) bank;
        branch2.loanType();

        SubBranch subBranch=(SubBranch) branch2;
        subBranch.subPay();

    }
}
