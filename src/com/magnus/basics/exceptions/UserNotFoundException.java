package com.magnus.basics.exceptions;

public class UserNotFoundException extends RuntimeException{

    UserNotFoundException(String message){
        super(message);
    }
    UserNotFoundException(String message,Throwable reason){
        super(message,reason);
    }

}
