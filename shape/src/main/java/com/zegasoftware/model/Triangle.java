package com.zegasoftware.model;
import java.lang.Math;


public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    @Override
    public double area() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
