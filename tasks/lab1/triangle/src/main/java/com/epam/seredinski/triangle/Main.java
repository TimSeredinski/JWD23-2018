package com.epam.seredinski.triangle;

import com.epam.seredinski.triangle.action.WorkerWithSides;
import com.epam.seredinski.triangle.entity.Triangle;
import com.epam.seredinski.triangle.entity.Vertex;

import java.util.List;

import static com.epam.seredinski.triangle.action.CreatorTriangle.createTriangle;
import static com.epam.seredinski.triangle.datareader.ReaderFromFile.readFromFile;
import static com.epam.seredinski.triangle.validation.TriangleValidation.isTriangle;

public class Main {

    public static void main(String[] args) {
        List<Double[]> arrayOfCoordinates = readFromFile("src/main/resources/fileWithCorrectData.txt");
        Vertex[] vertices = new Vertex[3];
        for (int j = 0; j < arrayOfCoordinates.size(); j++) {
            Triangle triangle = createTriangle(j);
            runLogic(triangle);
        }
    }

    private static void runLogic(Triangle triangle) {
        if (!isTriangle(triangle)) {
            System.out.println("Not a triangle");
            System.exit(1);
        }
        System.out.println(triangle);
        WorkerWithSides workerWithSides = new WorkerWithSides(triangle.getA(), triangle.getB(), triangle.getC());
        System.out.println("Perimeter of triangle = " + workerWithSides.findPerimeter());
        System.out.println("Square of triangle = " + workerWithSides.findSquare());
        System.out.println("Type of triangle: " + workerWithSides.getTypeOfTriangle() + "\n");
    }
}