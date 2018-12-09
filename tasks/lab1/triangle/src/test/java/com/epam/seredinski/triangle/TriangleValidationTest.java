package com.epam.seredinski.triangle;

import com.epam.seredinski.triangle.entity.Triangle;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.epam.seredinski.triangle.validation.TriangleValidation.isTriangle;

public class TriangleValidationTest {

    @DataProvider
    public static Object[][] sidesNotValid() {
        return new Object[][]{
                {3.4, 4.1, 15.12312},
                {3.0, 14.42, 5.2},
                {13, 4.9, 5.3}
        };
    }
    @DataProvider
    public static Object[][] triangleZeroSides() {
        return new Object[][]{
                {0, 4.2, 5.3},
                {3.1, 0, 5.9},
                {3.3, 4.6, 0}
        };
    }

    @DataProvider
    public static Object[][] sidesIsNotPositive() {
        return new Object[][]{
                {3.0, 4.2, -5.3},
                {3.99, -4.324, 5.123},
                {-3.5, 4.8, 5.125512}
        };
    }
    @DataProvider
    public static Object[][] correctSides() {
        return new Object[][]{
                {3.6,4.1,4.9},
                {3.0,3.0,5.2},
                {4.123,8.97,6.42}
        };
    }

    @Test(dataProvider = "sidesNotValid")
    public void isFalseWhenSidesIsNotValid(double a, double b, double c) {
        Triangle triangle = new Triangle(a, b, c);
        Assert.assertFalse(isTriangle(triangle));
    }

    @Test(dataProvider = "triangleZeroSides")
    public void isFalseWhenZeroSides(double a, double b, double c) {
        Triangle triangle = new Triangle(a, b, c);
        Assert.assertFalse(isTriangle(triangle));
    }

    @Test(dataProvider = "sidesIsNotPositive")
    public void isFalseWhenSidesIsNotPositive(double a, double b, double c) {
        Triangle triangle = new Triangle(a, b, c);
        Assert.assertFalse(isTriangle(triangle));
    }
    @Test(dataProvider = "correctSides")
    public void isTrueWhenCorrectSides(double a, double b, double c) {
        Triangle triangle = new Triangle(a, b, c);
        Assert.assertTrue(isTriangle(triangle));
    }
}
