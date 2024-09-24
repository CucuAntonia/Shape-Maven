package com.zegasoftware;
//ctrl alt o - optimize imports
//ctrl alt l - formatter

import com.zegasoftware.model.Circle;
import com.zegasoftware.model.Rectangle;
import com.zegasoftware.model.Square;
import com.zegasoftware.model.Triangle;

import java.util.Scanner;

public class App {

    private static Scanner scanner;
    public static void main(String[] args) {

        System.out.println("What shape do you want to work with?");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");

        scanner = new Scanner(System.in);
        int chosenShape = Integer.parseInt(scanner.nextLine());

        switch (chosenShape) {
            case 1:
                squareCalculations();
                break;
            case 2:
                rectangleCalculations();
                break;
            case 3:
                triangleCalculations();
                break;
            case 4:
                circleCalculations();
                break;
            default:
                System.out.println("You have to choose one of the available options.");
        }

        scanner.close();
    }

    private static void squareCalculations() {
        System.out.println("What is the length of you square's sides?");
        int length = Integer.parseInt(scanner.nextLine());

        Square square = new Square(length);

        int choice = chooseCalculation();

        if(choice == 1) {
            System.out.println("The perimeter is: " + square.perimeter());
        }else {
            System.out.println("The area is: " + square.area());
        }
    }

    private static void rectangleCalculations() {
        System.out.println("What is the length of you rectangle's sides?");
        System.out.println("Length: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Width: ");
        int width = Integer.parseInt(scanner.nextLine());

        Rectangle rectangle = new Rectangle(length, width);

        int choice = chooseCalculation();

        if(choice == 1) {
            System.out.println("The perimeter is: " + rectangle.perimeter());
        }else {
            System.out.println("The area is: " + rectangle.area());
        }
    }

    private static void triangleCalculations() {
        System.out.println("What are the lengths of the triangle's sides?");
        System.out.println("Side 1: ");
        int side1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Side 2: ");
        int side2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Side 3: ");
        int side3 = Integer.parseInt(scanner.nextLine());

        Triangle triangle = new Triangle(side1, side2, side3);

        int choice = chooseCalculation();

        if (choice == 1) {
            System.out.println("The perimeter is: " + triangle.perimeter());
        }else {
            System.out.println("The area is: " + triangle.area());
        }
    }

    private static void circleCalculations() {
        System.out.println("What is the radius of your circle?");
        double radius = Double.parseDouble(scanner.nextLine());

        Circle circle = new Circle(radius);

        int choice = chooseCalculation();

        if(choice == 1) {
            System.out.println("The perimeter is: " + circle.perimeter());
        }else {
            System.out.println("The area is: " + circle.area());
        }
    }

    private static int chooseCalculation() {
        System.out.println("What operation do you want to do?");
        System.out.println("1. Calculate perimeter");
        System.out.println("2. Calculate area");

        int choice = Integer.parseInt(scanner.nextLine());

        return choice;
    }
}
