package com.bl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Vaishnavi");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Vv");
        Assertions.assertFalse(result);
    }

    @Test
    void givenFirstName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("#Vv");
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Vishwakarma");
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Vi");
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("@Panchal");
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenStartingWithSmallLetter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("vishwakarma");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("vaishucv14@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmail_WhenUserNameIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenDomainNameIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("vv1409@.com");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenMainTldIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("vv98@gmail");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenAtTheRateIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("vv1998gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenWithOptionalTld_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("vrv09@gmail.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("91 8123746670");
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("6360738002");
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenSpaceIsMissingAfterCountryCode_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("919481403337");
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("91 77456");
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Vaish#6670");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Vaibh98");
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneUpperCase_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("vaish@5706");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneNumericNumber_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Vaish#panch");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneSpecialCharacters_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Vaish5567");
        Assertions.assertTrue(result);
    }
}


