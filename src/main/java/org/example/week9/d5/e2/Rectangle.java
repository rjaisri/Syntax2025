package org.example.week9.d5.e2;

public class Rectangle extends Shape {
    // Step 2: Create the Rectangle.java class as a subclass of Shape:
    // Create private instance variables width and height both double.
    // Create a constructor of Rectangle class which width and height of type double as parameters.
    // Inside constructor,Use super keyword to call the constructor of Shape class(parent class) and pass Rectangle as Parameter and use this keyword to assign values to private instance variables length and width.
    // Override the calculateArea() Method:
    // Provide the implementation for the calculateArea() method and implements the logic to display area of the rectangle using the formula Area=length*breath.
    // Override the calculatePerimeter() Method:
    // Provide the implementation for
    // the calculatePerimeter() method
    // and implements the logic to display area of the rectangle using the formula
    // Perimeter=2*(length+breath).
    private double width;

    private double height;
    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    @Override
    public void calculateArea() {
        double area = width * height;
        System.out.println("Area of the rectangle: " + area);

    }
    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (width + height);
        System.out.println("Perimeter of the rectangle: " + perimeter);

    }

}
