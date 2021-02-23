package com.userValidation;

public class UserValidatorException extends Exception{
    enum ExceptionType{
        INVALID
    }

    ExceptionType type;
    public UserValidatorException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}
