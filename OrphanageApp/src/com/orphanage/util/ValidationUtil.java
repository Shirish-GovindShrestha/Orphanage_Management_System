package com.orphanage.util;

import java.util.regex.Pattern;

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
     * Validates if the age is between 18 and 70 (inclusive).
     *
     * @param id the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidId(short id){
        return id>0;
    }
    
    /**
     * Validates if the age is between 18 and 70 (inclusive).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(short age) {
        return age >= 0 && age <= 40;
    }
    /**
     * Validates if the weight is between 1 and 130 (inclusive).
     *
     * @param weight the weight to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidWeight(short weight) {
        return weight >= 0 && weight <= 130;
    }
    
    /**
     * Validates if the height is between 1 and 130 (inclusive).
     *
     * @param height the weight to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidHeight(short height) {
        return height >= 30 && height <= 250;
    }

    public static boolean isValidCredentials(String username, String password) {
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);

    }
}
