package com.epam.seredinski.triangle;

import com.epam.seredinski.triangle.action.WorkerWithSides;
import com.epam.seredinski.triangle.entity.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.seredinski.triangle.action.CreatorTriangle.createTriangle;

public class WorkerWithSidesTest {

    @Test
    public void findPerimeterTest() {
        Triangle triangle = createTriangle(0);
        double expectedPerimeter = 3.0 + 4.0 + 5.0;
        WorkerWithSides workerWithSides = new WorkerWithSides(triangle.getA(), triangle.getB(), triangle.getC());
        double actualPerimeter = workerWithSides.findPerimeter();
        Assert.assertEquals(actualPerimeter, expectedPerimeter);
    }

    @Test
    public void findSquareTest() {
        Triangle triangle = createTriangle(0);
        double expectedSquare = 1.0 / 2.0 * 3.0 * 4.0;
        WorkerWithSides workerWithSides = new WorkerWithSides(triangle.getA(), triangle.getB(), triangle.getC());
        double actualSquare = workerWithSides.findSquare();
        Assert.assertEquals(actualSquare,expectedSquare);
    }

    @Test
    public void isIsoscelesWhenTwoSidesAreEqual() {
        Triangle triangle = createTriangle(3);
        WorkerWithSides workerWithSides = new WorkerWithSides(triangle.getA(), triangle.getB(), triangle.getC());
        Assert.assertEquals(workerWithSides.getTypeOfTriangle(), "Isosceles");
    }
    @Test
    public void isEquilateralWhenSidesAreEqual() {
        Triangle triangle = new Triangle(3,3,3);
        WorkerWithSides workerWithSides = new WorkerWithSides(triangle.getA(), triangle.getB(), triangle.getC());
        Assert.assertEquals(workerWithSides.getTypeOfTriangle(), "Equilateral");
    }

    @Test
    public void isRightWhenTheoremOfPythagoras() {
        Triangle triangle = createTriangle(0);
        WorkerWithSides workerWithSides = new WorkerWithSides(triangle.getA(), triangle.getB(), triangle.getC());
        Assert.assertEquals(workerWithSides.getTypeOfTriangle(), "Right");
    }
}
