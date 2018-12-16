package com.epam.seredinski.triangle.validation;

import com.epam.seredinski.triangle.entity.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleValidation {

    private static final Logger logger = LogManager.getLogger(TriangleValidation.class);

    public static boolean isTriangle(Triangle triangle) {
        if (!((triangle.getA() + triangle.getB() > triangle.getC())
                && (triangle.getA() + triangle.getC() > triangle.getB())
                && (triangle.getC() + triangle.getB() > triangle.getA()))) {
            logger.warn("isTriangle() - not a triangle");
            return false;
        }
        return true;
    }
}
