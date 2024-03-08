package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLonhException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username");
        String username=sc.next();
        boolean usernameFlag=false;
        IValidationService validationService=new ValidationServiceImpl();
        try {
            usernameFlag=validationService.validateUsername(username);
        }catch (NameExistsException e){
            System.out.println(e.getMessage());
        }

        if(usernameFlag== true){
            System.out.println("enter password");
            String pass=sc.next();
            boolean passwordFlag=false;
            try{
                passwordFlag= validationService.validatePassword(pass);
            }catch (TooShortException | TooLonhException e){
                System.out.println(e.getMessage());
            }
            if(passwordFlag==true){
                System.out.println("Password is created");
            }
        }

    }
}
