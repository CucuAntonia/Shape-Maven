package com.zegasoftware.model;

public class Square extends Shape {

    private int a;

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }
}
