package com.zegasoftware.model;

public class Rectangle extends Shape {
    private int lenght;
    private int width;

    public Rectangle()
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

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }
}
