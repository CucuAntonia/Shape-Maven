package com.zegasoftware.model;

public class Circle extends Shape {
    private int radius;
    private double pi=3.14;
    @Override
    public double area()
    {

        return pi * radius *radius;
    }

    @Override
    public double perimeter()
    {
    return 2*pi*radius;
    }
}
