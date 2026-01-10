package org.group_Project;

public class SimulateAnimal {
 /*   Create a simulation where instances of different animals are created, and their behavior
    methods are called to demonstrate polymorphism and method overriding.
    Display information about each animal using the displayInformation() method to show
    how data encapsulation and abstraction are used.
    Testing Your Implementation
    Instantiate various animals in a main method or equivalent entry point of your program.
    Call the methods eat(), makeSound(), and displayInformation() on each instance to see
    the polymorphic behavior in action.*/
 public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);

        Eagle eagle = new Eagle("Freedom", 3);

        lion.displayInformation();
        lion.eat();
        lion.makeSound();

        System.out.println();

        lion.sleep();

        System.out.println();

        eagle.displayInformation();
        eagle.eat();
        eagle.makeSound();
 }
}
