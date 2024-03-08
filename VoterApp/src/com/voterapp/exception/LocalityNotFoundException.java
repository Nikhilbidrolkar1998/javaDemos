package com.voterapp.exception;

public class LocalityNotFoundException extends Exception{
    public LocalityNotFoundException(){

    }
    public LocalityNotFoundException(String message){
        super(message);
    }
}
