package com.epam.seredinski.triangle.entity;

public class Vertex {

    private double x;
    private double y;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x +
                "; " + y +
                ")";
    }
}
