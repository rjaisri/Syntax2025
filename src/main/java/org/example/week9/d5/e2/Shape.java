package org.example.week9.d5.e2;

public abstract class Shape {
    // Step 1: Create a `Shape` class with the following:
    // Create a protected String variable with name as shapeName and Create a constructor of Shape class with shapeName parameter
    // Declare two abstract methods calculateArea(),calculatePerimeter() with no parameters.
    // Create a non-abstract method displayName() that prints "The name of the shape is: [shapeName]".
    protected String shapeName;
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    // Declare two abstract methods calculateArea(),calculatePerimeter() with no parameters.
    public abstract void calculateArea() ;


    public abstract  void calculatePerimeter() ;




    public void displayName() {
        System.out.println("The name of the shape is: " + shapeName);
    }


}
