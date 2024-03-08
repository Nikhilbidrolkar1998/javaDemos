package com.voterapp.exception;

public class InvalidVoterIdException extends Exception{
    public InvalidVoterIdException(){

    }
    public InvalidVoterIdException(String message){
        super(message);
    }
}
