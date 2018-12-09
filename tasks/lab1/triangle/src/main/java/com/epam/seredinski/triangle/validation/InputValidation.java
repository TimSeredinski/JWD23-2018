package com.epam.seredinski.triangle.validation;

public class InputValidation {
    public static boolean isValidInputString(String[] str) {
        if (str.length != 6) {
            return false;
        }
        for (String s : str) {
            try {
                double d = Double.parseDouble(s);
            } catch (NumberFormatException nfe) {
                return false;
            }
        }
        return true;
    }
}
