package com.epam.seredinski.triangle.validation;

import com.epam.seredinski.triangle.exception.InvalidLineException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputValidation {

    private static final Logger logger = LogManager.getLogger(InputValidation.class);

    public static boolean isValidInputString(String[] str) {
        if (str.length != 6) {
            logger.warn("InvalidLineException");
            throw new InvalidLineException("Exception in ReaderFromFile.readFromFile()");
        }
        for (String s : str) {
            try {
                Double.parseDouble(s);
            } catch (NumberFormatException nfe) {
                logger.warn("Exception in InputValidation.isValidInputString()", nfe);
                throw new InvalidLineException("Exception in InputValidation.isValidInputString()", nfe);
            }
        }
        return true;
    }
}
