package com.bl;

import java.util.regex.Pattern;

/**
 * Purpose : To validate the entered details of the user.
 *
 * @author : Vaishnavi R. Vishwakarma.
 * @since : 14-09-1998.
 */

public class UserValidator {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_ADDRESS_PATTERN = "^([a-zA-z0-9-_+.]+)"
                                                            + "@([a-z0-9-]+)\\.([a-z,]{2,4})((\\.[a-z]{2,4})?)$";
    private static final String MOBILE_NUMBER = "^[91]{2}[\\s][0-9]{10}$";
    private static final String PASSWORD = "^[a-z(?=.A-Z)(?=.*0-9)(?=.@#$%^&+=)]{8,}$";

    public static void main(String[] args) {
        System.out.println("Welcome to Program");
    }

    /**
     * Purpose : To Validate First Name Of User
     *
     * @param fname This is the parameter to store first name of user
     * @return matcher value
     */
    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    /**
     * Purpose : To Validate Last Name Of User
     *
     * @param lname This is the parameter to store last name of user
     * @return matcher value
     */
    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    /**
     * Purpose : To Validate The Email Address Of User
     *
     * @param mail This is the parameter to store email address of user
     * @return matcher value
     */
    public boolean validateEmailAddress(String mail) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(mail).matches();
    }

    /**
     * Purpose : To Validate The Mobile Number Of User
     *
     * @param phoneNumber This is the parameter to store mobile number of user
     * @return matcher value
     */
    public boolean validateMobileNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER);
        return pattern.matcher(phoneNumber).matches();
    }

    /**
     * Purpose : To Validate The Password Of User
     *
     * @param password This is the parameter to store password of user
     * @return matcher value
     */
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD);
        return pattern.matcher(password).matches();
    }
}
