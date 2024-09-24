package com.zegasoftware.model;

public class Circle extends Shape {
    private double radius;
    private double pi=3.14;

    public Circle(double radius, double pi)
    {
        this.radius=radius;
        this.pi=pi;
    }

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

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }
}
