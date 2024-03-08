package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIdException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        ElectionBoothServiceImpl electionBoothService=new ElectionBoothServiceImpl();
        //electionBoothService.checkAge(age);
        return true;
    }
    private boolean checkAge(int age)throws UnderAgeException {
        if(age<18){
            throw new UnderAgeException("Age should be more than 18");
        }
        return true;
    }
    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities={"JP Nagar","ABC Nagar","whitefield"};
        for(String loc:localities){
            if(!loc.equals(locality)){
                throw new LocalityNotFoundException("Locality is not available");
            }
        }
        return true;
    }
    private boolean checkVoterId(int voterId) throws InvalidVoterIdException{
        return true;
    }
}
