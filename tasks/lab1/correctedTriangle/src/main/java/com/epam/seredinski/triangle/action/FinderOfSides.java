package com.epam.seredinski.triangle.action;

import com.epam.seredinski.triangle.entity.Vertex;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class FinderOfSides {

    public static double findLengthWithTwoVertices(Vertex a, Vertex b) {
        return sqrt(pow((a.getX() - b.getX()), 2) + pow((a.getY() - b.getY()), 2));
    }

}
