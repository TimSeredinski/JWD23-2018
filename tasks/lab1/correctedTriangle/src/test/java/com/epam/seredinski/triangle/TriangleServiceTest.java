package com.epam.seredinski.triangle;

import com.epam.seredinski.triangle.action.impl.CreatorTriangle;
import com.epam.seredinski.triangle.action.impl.TriangleService;
import com.epam.seredinski.triangle.entity.Triangle;
import com.epam.seredinski.triangle.exception.NotATriangleException;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.seredinski.triangle.validation.TriangleValidation.isTriangle;

public class TriangleServiceTest {

    private CreatorTriangle creator = new CreatorTriangle();

    @Test
    public void findPerimeterTest() {
        Triangle triangle = creator.create(0);
        double expectedPerimeter = 3.0 + 4.0 + 5.0;
        TriangleService triangleService = new TriangleService();
        double actualPerimeter = triangleService.findPerimeter(triangle);
        Assert.assertEquals(actualPerimeter, expectedPerimeter);
    }

    @Test
    public void findSquareTest() {
        Triangle triangle = creator.create(0);
        double expectedSquare = 1.0 / 2.0 * 3.0 * 4.0;
        TriangleService triangleService = new TriangleService();
        double actualSquare = triangleService.findSquare(triangle);
        Assert.assertEquals(actualSquare, expectedSquare);
    }

    @Test
    public void isIsoscelesWhenTwoSidesAreEqual() {
        Triangle triangle = creator.create(3);
        TriangleService triangleService = new TriangleService();
        Assert.assertEquals(triangleService.getType(triangle), "Isosceles");
    }

    @Test
    public void isEquilateralWhenSidesAreEqual() {
        Triangle triangle = new Triangle(3, 3, 3);
        TriangleService triangleService = new TriangleService();
        Assert.assertEquals(triangleService.getType(triangle), "Equilateral");
    }

    @Test
    public void isRightWhenTheoremOfPythagoras() {
        Triangle triangle = creator.create(0);
        TriangleService triangleService = new TriangleService();
        Assert.assertEquals(triangleService.getType(triangle), "Right");
    }

    @Test(expectedExceptions = NotATriangleException.class)
    public void isExceptionWhenSidesOnOneLine() {
        Triangle triangle = creator.create(4);
        if (!isTriangle(triangle)) {
            throw new NotATriangleException("isTriangle() - not a triangle");
        }
    }
}
