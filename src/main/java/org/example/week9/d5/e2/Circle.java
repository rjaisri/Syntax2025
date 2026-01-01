package org.example.week9.d5.e2;


    // Step 3: Create the Circle.java class as a subclass of Shape:
    // Has private instance variable radius of type double.
    // Has private final variable PI as private final double PI = Math.PI;.
    // Create a constructor of Circle class with radius of type double as parameter.
    // Inside constructor,Use super keyword to call the constructor of Shape class(parent class) and pass Circle as Parameter and use this keyword to assign values to private instance variable radius.
    // Override the calculateArea() Method:
    // Provide the implementation for the `calculateArea()` method and implements the logic to display area of the circle using the formula Area=PI*radius*radius.
    // Override the `calculatePerimeter()` Method:**
    // Provide the implementation for the `calculatePerimeter()` method and implements the logic to display area of the rectangle using the formula Perimeter=2*PI*radi
public class Circle extends Shape {
    private double radius;
    private final double PI = Math.PI;
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area of the circle:" + area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * PI * radius;
        System.out.println("Perimeter of the circle:" + perimeter);
    }


    }

