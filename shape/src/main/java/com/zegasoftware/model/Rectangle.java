package com.zegasoftware.model;

public abstract class Rectangle extends Shape {
    private int lenght;
    private int width;


    @Override
    public double area ()
    {
        return width*lenght;
    }


    @Override
    public double perimeter()
    {
        return 2*width + 2*lenght;
    }
}
