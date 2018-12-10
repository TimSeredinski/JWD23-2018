package com.epam.seredinski.triangle.validation;

import com.epam.seredinski.triangle.entity.Triangle;
import com.epam.seredinski.triangle.exception.NotATriangleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleValidation {

    private static final Logger logger = LogManager.getLogger(TriangleValidation.class);

    public static boolean isTriangle(Triangle triangle) {
        boolean result = ((triangle.getA() + triangle.getB() > triangle.getC())
                && (triangle.getA() + triangle.getC() > triangle.getB())
                && (triangle.getC() + triangle.getB() > triangle.getA()));
        if(!result){
            logger.warn("Exception in TriangleValidation.isTriangle() - not a triangle");
            throw new NotATriangleException("Exception in TriangleValidation.isTriangle() - not a triangle");
        }
        return true;
    }
}
