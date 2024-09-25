package com.zegasoftware;

import com.zegasoftware.model.Circle;
import com.zegasoftware.model.Shape;
import com.zegasoftware.model.Square;
import com.zegasoftware.model.Triangle;

import java.util.ArrayList;
import java.util.List;

public class NewApp {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        int a = 0;
        int b = 0;
        int c = 0;
        double radius = 0;

        Triangle triangle = new Triangle(a, b, c);
        Square square = new Square(a);
        Circle circle = new Circle(radius);

        shapes.add(triangle);
        shapes.add(square);
        shapes.add(circle);

        for( Shape s:shapes) {
            s.area();
        }
    }
}
