package org.example.week9.d6.e1;

public class E1Interface {

    public static void main(String[] args) {


        // Step 1: Create a `ElectronicDevice` Interface with two unimplemented methods turnOn() and turnOff() with no parameters.
        interface ElectronicDevice {
            void turnOn();
            void turnOff();
        }

        // Step 2: Create a `Smartphone` class that implements `ElectronicDevice` interface.
        // Provide an implementation for the `turnOn()` method that prints `Smartphone is turning on`.
        // Provide an implementation for the `turnOff()` method that prints `Smartphone is turning off`.
        class Smartphone implements ElectronicDevice {
            @Override
            public void turnOn() {
                System.out.println("Smartphone is turning on");
            }
            @Override
            public void turnOff() {
                System.out.println("Smartphone is turning off");
            }
        }
        // Step 3: Create a `Laptop` class that implements `ElectronicDevice` interface.
        // Provide an implementation for the `turnOn()` method that prints `Laptop is turning on`.
        // Provide an implementation for the `turnOff()` method that prints `Laptop is turning off`.
        class Laptop implements ElectronicDevice {
            @Override
            public void turnOn() {
                System.out.println("Laptop is turning on");
            }
            @Override
            public void turnOff() {
                System.out.println("Laptop is turning off");
            }
        }

        // Step 4: In the `E1Interface.java` class, Create an object of the `Smartphone` class and call both the `turnOn()` and `turnOff()` methods.
        // Create an object of the `Laptop` class and
        // call both the `turnOn()` and `turnOff()` methods
        // and verify that all methods are being called correctly.
        Smartphone smartphone = new Smartphone();
        smartphone.turnOn();
        smartphone.turnOff();
        Laptop laptop = new Laptop();
        laptop.turnOn();
        laptop.turnOff();


    }

}