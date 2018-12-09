package com.epam.seredinski.triangle.action;

import static java.lang.Math.sqrt;

public class WorkerWithSides {

    private double a;
    private double b;
    private double c;

    public WorkerWithSides(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double findSquare() {
        double p = findPerimeter() / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double findPerimeter() {
        return a + b + c;
    }

    public String getTypeOfTriangle() {
        if (a == b && b == c && a == c) {
            return "Equilateral";
        }
        if (a == b || b == c || a == c) {
            return "Isosceles";
        }
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "Right";
        }
        return "Simple";
    }
}
