package com.epam.seredinski.triangle.action.impl;

import com.epam.seredinski.triangle.action.Service;
import com.epam.seredinski.triangle.entity.Triangle;

import static java.lang.Math.sqrt;

public class TriangleService implements Service<Triangle> {

    @Override
    public double findSquare(Triangle triangle) {
        double p = findPerimeter(triangle) / 2;
        return sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
    }

    @Override
    public double findPerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    @Override
    public String getType(Triangle triangle) {
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
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
