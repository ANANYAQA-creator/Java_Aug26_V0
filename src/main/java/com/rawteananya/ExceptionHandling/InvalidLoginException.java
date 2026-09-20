package com.rawteananya.ExceptionHandling;

public class InvalidLoginException extends Exception{
//Because it extends Exception, this is a checked custom exception.
    public InvalidLoginException(String message){
        super(message);
    }
}
