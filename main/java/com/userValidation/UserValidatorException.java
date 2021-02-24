package com.userValidation;

public class UserValidatorException extends Exception{
    enum ExceptionType{
        NULL , EMPTY
    }

    ExceptionType type;
    public UserValidatorException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}
