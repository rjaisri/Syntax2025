package org.example.week8.d6.e1;



    /*
     * 1. Make Car class extend Vehicle using the extends keyword.
     * 2. Declare an instance variable for the car's model (type String).
     * 3. Create a public method named displayCarInfo() that returns void.
     * 4. Inside displayCarInfo(), first call the inherited displayInfo() method.
     * 5. After calling displayInfo(), use System.out.println() to print the car's model.
     *    - For example, print: "Model: Corolla"
     */

public class Car extends Vehicle {
    String model;

    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Model: " + model);
    }
}
