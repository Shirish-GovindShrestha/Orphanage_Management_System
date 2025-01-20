package com.orphanage.util;

import java.util.regex.Pattern;

/**
 *
 * @author Shirish Govind Shrestha 
 * LMU ID:23057125
 */

public class ValidationUtil {

    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern GENDER_PATTERN = Pattern.compile("^(Male|Female|Other)$");
    private static final Pattern BLOOD_GROUP_PATTERN = Pattern.compile("^(AB\\+|A\\+|O\\+|B\\+|AB\\-|A\\-|O\\-|B\\-)$");
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "admin";

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the gender is one of the allowed options.
     *
     * @param gender the program to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidGender(String gender) {
        return GENDER_PATTERN.matcher(gender).matches();
    }

    /**
     * Validates if the bloodGroup is one of the allowed options.
     *
     * @param bloodGroup the program to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidBloodGroup(String bloodGroup) {
        return BLOOD_GROUP_PATTERN.matcher(bloodGroup).matches();
    }

    /**
     * Validates if the id is greater than 0.
     *
     * @param id the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidId(short id) {
        return id > 0;
    }

    /**
     * Validates if the age is between 0 and 30 (inclusive).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(short age) {
        return age >= 0 && age <= 30;
    }

    /**
     * Validates if the weight is between 1 and 150 (inclusive).
     *
     * @param weight the weight to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidWeight(short weight) {
        return weight >= 0 && weight <= 150;
    }

    /**
     * Validates if the height is between 20 and 200 (inclusive).
     *
     * @param height the weight to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidHeight(short height) {
        return height >= 20 && height <= 200;
    }

    /**
     * Validates if the username and password match the predefined
     * valid credentials.
     *
     * @param username the username to validate
     * @param password the password to validate
     * @return true if the credentials are valid, otherwise false
     */
    public static boolean isValidCredentials(String username, String password) {
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);

    }
}
