package com.epam.seredinski.triangle.validation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputValidation {

    private static final Logger logger = LogManager.getLogger(InputValidation.class);

    public static boolean isValidInputString(String[] str) {
        if (str.length != 6) {
            logger.warn("InvalidLineException");
            return false;
        }
        for (String s : str) {
            try {
                Double.parseDouble(s);
            } catch (NumberFormatException nfe) {
                logger.warn("NumberFormatException in InputValidation.isValidInputString()", nfe);
                return false;
            }
        }
        return true;
    }
}
