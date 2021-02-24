package com.userValidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTesting {
    @Test
    public void givenFirstName_WhenNotProper_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateFirstName("Saud");
            Assert.assertTrue(result);
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenNull_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try{
           boolean result = userValidator.validateFirstName(null);
           Assert.assertTrue(result);
        } catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.NULL, e.type);
        }
    }

    @Test
    public void givenLastName_WhenNull_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        try {
            result = userValidator.validateFirstName(null);
            Assert.assertTrue(result);
        } catch (UserValidatorException e) {
            Assert.assertEquals(UserValidatorException.ExceptionType.NULL, e.type);
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try{
            boolean result = userValidator.validateFirstName("Hasan");
            Assert.assertTrue(result);
        } catch (UserValidatorException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenNull_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        try {
            result = userValidator.validateEmail(null);
            Assert.assertTrue(result);
        } catch (UserValidatorException e) {
            Assert.assertEquals(UserValidatorException.ExceptionType.NULL, e.type);
        }

    }

    @Test
    public void givenEmail_WhenNotProper_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail("abc@gmail.co.in");
            Assert.assertTrue(result);
        } catch (UserValidatorException e) {
             e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenNull_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        try {
            result = userValidator.validateMobileNumber(null);
            Assert.assertTrue(result);
        } catch (UserValidatorException e) {
            Assert.assertEquals(UserValidatorException.ExceptionType.NULL, e.type);
        }
    }

    @Test
    public void givenMobileNumber_WhenNotValid_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateMobileNumber("91 8754692154");
            Assert.assertTrue(result);
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        try {
            result = userValidator.validatePassword(null);
            Assert.assertTrue(result);
            } catch (UserValidatorException e) {
            Assert.assertEquals(UserValidatorException.ExceptionType.NULL, e.type);
        }

    }

    @Test
    public void givenPassword_WhenNotValid_ShouldThrowException() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validatePassword("Saud@123");
            Assert.assertTrue(result);
        } catch (UserValidatorException e) {
            e.printStackTrace();
        }
    }
}

