package com.userValidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTesting {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        try {
            result = userValidator.validateFirstName("Saud");
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try{
           userValidator.validateFirstName("saud");
        } catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.INVALID, e.type);
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        try {
            result = userValidator.validateFirstName("Hasan");
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try{
            userValidator.validateFirstName("hasan");
        } catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.INVALID, e.type);
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        try {
            result = userValidator.validateEmail("abc@gmail.com");
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.validateEmail("abc@gmail.co.inin");
        } catch (UserValidatorException e) {
             Assert.assertEquals(UserValidatorException.ExceptionType.INVALID, false);
        }
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        try {
            result = userValidator.validateMobileNumber("91 8754692154");
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotValid_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.validateMobileNumber("91 87546921545");
        } catch (UserValidatorException e) {
            Assert.assertEquals(UserValidatorException.ExceptionType.INVALID, false);
        }
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        try {
            result = userValidator.validatePassword("Saud@123");
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotValid_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.validatePassword("saud@123");
        } catch (UserValidatorException e) {
            Assert.assertEquals(UserValidatorException.ExceptionType.INVALID, false);
        }
    }
}

