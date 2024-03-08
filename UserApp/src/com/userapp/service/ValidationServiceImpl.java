package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLonhException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {
    @Override
    public boolean validatePassword(String password) throws TooShortException, TooLonhException {
        if(password.length()<6)
            throw new TooShortException("Password is too short");
        if(password.length()>15)
            throw new TooLonhException("Password is long");
        return true;
    }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] usernames={"sri","priya","joe","kathly"};
        for(String name:usernames){
                if(name.equals(username))
                    throw new NameExistsException("Name already exist");}

        return true;
    }
}
