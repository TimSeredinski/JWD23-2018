package com.epam.seredinski.triangle;

import com.epam.seredinski.triangle.exception.InvalidLineException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.epam.seredinski.triangle.validation.InputValidation.isValidInputString;

public class InputValidationTest {

    @DataProvider
    public static Object[][] correctCoordinateOfVertices() {
        return new Object[][]{
                {"1.0", "-1.0", "5.0", "1.0", "-5.0", "4.0"},
                {"1.3", "2.2", "3.7", "1.1", "-2.0", "3.5"},
                {"0.8", "0.8", "-6.2", "0.8231", "3", "4.9"}
        };
    }

    @DataProvider
    public static Object[][] coordinateOfVerticesIsNotValid() {
        return new Object[][]{
                {"1.0z", "1.0", "5.0", "1x.0", "5.0", "4.0"},
                {"1.3", "2.2", "3.7", "1.1"},
                {"0.8", "0.8", "6.2", "0.8", "3.3", "4.9", "2.2", "1.4"}
        };
    }

    @Test(dataProvider = "correctCoordinateOfVertices")
    public void isTrueWhenCorrectCoordinates(String[] str) {
        Assert.assertTrue(isValidInputString(str));
    }

    @Test(dataProvider = "coordinateOfVerticesIsNotValid", expectedExceptions = InvalidLineException.class)
    public void isExceptionWhenCoordinatesIsNotValid(String[] str) throws InvalidLineException {
        if (!isValidInputString(str)) {
            throw new InvalidLineException("Exception in InputValidation.isValidInputString()");
        }
    }

}
