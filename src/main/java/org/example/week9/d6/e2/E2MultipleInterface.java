package org.example.week9.d6.e2;

public class E2MultipleInterface {

    public static void main(String[] args) {

        // Step 1: Create a `Controllable` Interface with unimplemented method turnOn() with no parameters, representing the ability to turn on a device.
        interface Controllable {
            void turnOn();
        }
        // Step 2: Create a `Configurable` Interface with unimplemented method configure() with no parameters, representing the ability to configure settings on a device.
        interface Configurable {
            void configure();
        }
        // Step 3: Create a SmartHomeDevice class that implements both the Controllable and Configurable interfaces.
        class SmartHomeDevice implements Controllable, Configurable {
            @Override
            public void turnOn() {
                System.out.println("Turning on Smart Home Device");
            }
            @Override
            public void configure() {
                System.out.println("Configuring Smart Home Device settings");
            }
        }
        SmartHomeDevice device = new SmartHomeDevice();
        device.turnOn();
        device.configure();

        // Provide an implementation for the turnOn() method that prints "Turning on Smart Home Device".
        // Provide an implementation for the configure() method that prints "Configuring Smart Home Device settings".
        // Step 4: In the `E2MultipleInterface.java` class, Create an object of the SmartHomeDevice class and Call the turnOn(),configure() methods and verify that all methods are being called correctly.


    }
}

