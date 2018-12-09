package com.epam.seredinski.triangle.action;

import com.epam.seredinski.triangle.entity.Triangle;
import com.epam.seredinski.triangle.entity.Vertex;

import java.util.List;

import static com.epam.seredinski.triangle.datareader.ReaderFromFile.readFromFile;

public class CreatorTriangle {

    public static Triangle createTriangle(int numOfLine){
        List<Double[]> arrayOfCoordinates = readFromFile("src/main/resources/fileWithCorrectData.txt");
        int number = 0;
        Vertex[] vertices = new Vertex[3];
        for (int i = 0; i < vertices.length; i++) {
            vertices[i] = new Vertex(arrayOfCoordinates.get(numOfLine)[i + number], arrayOfCoordinates.get(numOfLine)[i + 1 + number]);
            number++;
        }
        return new Triangle(vertices);
    }
}
