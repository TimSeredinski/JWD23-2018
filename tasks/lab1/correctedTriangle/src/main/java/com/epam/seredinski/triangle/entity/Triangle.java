package com.epam.seredinski.triangle.entity;

import static com.epam.seredinski.triangle.action.FinderOfSides.findLengthWithTwoVertices;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Vertex[] vertices) {
        a = findLengthWithTwoVertices(vertices[0], vertices[1]);
        b = findLengthWithTwoVertices(vertices[1], vertices[2]);
        c = findLengthWithTwoVertices(vertices[0], vertices[2]);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "The triangle consists of sides: " + " a = " + a + ", b = " + b + ", c = " + c;
    }
}
