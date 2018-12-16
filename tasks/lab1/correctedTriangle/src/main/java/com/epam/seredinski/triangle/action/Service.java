package com.epam.seredinski.triangle.action;

public interface Service<T> {
    double findSquare(T figure);

    double findPerimeter(T figure);

    String getType(T figure);

}
