package com.zegasoftware.model;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return width * length;
    }


    @Override
    public double perimeter() {
        return 2 * width + 2 * length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
