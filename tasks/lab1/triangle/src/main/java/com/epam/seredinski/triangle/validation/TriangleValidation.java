package com.epam.seredinski.triangle.validation;

import com.epam.seredinski.triangle.entity.Triangle;

public class TriangleValidation {
    public static boolean isTriangle(Triangle triangle) {
        return ((triangle.getA() + triangle.getB() > triangle.getC())
                && (triangle.getA() + triangle.getC() > triangle.getB())
                && (triangle.getC() + triangle.getB() > triangle.getA()));
    }
}
