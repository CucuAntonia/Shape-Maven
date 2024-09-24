package com.zegasoftware.model;

public class Rectangle extends Shape {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width)
    {
        this.lenght=lenght;
        this.width=width;
    }


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

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }
}
