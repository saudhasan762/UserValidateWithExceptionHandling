package com.userValidation;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String name = "^[A-Z]{1}[a-z]{2,}";
    private static final String e_mail = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*+@[a-zA-Z]+[.]([a-zA-z]{2,4})+(([.][a-z]{2})?)$";
    private static final String mobNumber = "^([9]{1}[1]{1})\\s{1}[0-9]{10}$";
    private static final String password = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[a-z])(?=.*[#?!@$%^&*-]).{8,}$";

    public boolean validateFirstName(String fName) throws UserValidatorException {
        try{
            Pattern pattern = Pattern.compile(name);
            return pattern.matcher(fName).matches();
        } catch(Exception e){
            throw new UserValidatorException(UserValidatorException.ExceptionType.INVALID,"Invalid First Name");
        }
    }

    public boolean validateLastName(String lName) throws UserValidatorException {
        try{
            Pattern pattern = Pattern.compile(name);
            return pattern.matcher(lName).matches();
        } catch (Exception e){
            throw new UserValidatorException(UserValidatorException.ExceptionType.INVALID, "Invalid Last Name");
        }
    }

    public boolean validateEmail(String email) throws UserValidatorException{
        try{
            Pattern pattern = Pattern.compile(e_mail);
            return pattern.matcher(email).matches();
        } catch (Exception e){
            throw new UserValidatorException(UserValidatorException.ExceptionType.INVALID, "Invalid Email Address");
        }
    }

    public boolean validateMobileNumber(String mNumber) throws UserValidatorException{
        try{
            Pattern pattern = Pattern.compile(mobNumber);
            return pattern.matcher(mNumber).matches();
        } catch (Exception e){
            throw new UserValidatorException(UserValidatorException.ExceptionType.INVALID, "Invalid Mobile number");
        }
    }

    public boolean validatePassword(String pass) throws UserValidatorException{
        try{
            Pattern pattern = Pattern.compile(password);
            return  pattern.matcher(pass).matches();
        } catch (Exception e){
            throw new UserValidatorException(UserValidatorException.ExceptionType.INVALID, "Invalid Password");
        }
    }
}
