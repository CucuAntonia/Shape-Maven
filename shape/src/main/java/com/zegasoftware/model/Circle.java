package com.zegasoftware.model;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private double radius;
    //  private static final double PI = 3.14D;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {

        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }


    public double getRadius() {
        return radius;
    }
}
