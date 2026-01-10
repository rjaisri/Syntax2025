package org.group_Project;
/*Part 1: Defining the Base Structure


/*Abstract Class Animal: Implements AnimalBehavior. This class serves as the base for
all animal types, providing implementation for some methods of AnimalBehavior that
are common across all animals, such as sleep(), and defining abstract methods like
displayInformation() to show details about the animal.*/

abstract class Animal implements AnimalBehavior {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public abstract void displayInformation();
}






 /*       Part 3: Implementing Features Using OOP Concepts
Inheritance: Demonstrated by the class hierarchy starting from Animal to Mammal/Bird
to specific animals like Lion, Elephant, etc.
Polymorphism and Method Overriding: Specific animal classes overriding behavior
methods like eat(), makeSound(), and displayInformation().
Abstraction: The Animal class is abstract, containing both implemented and abstract
methods, enforcing a contract for the subclasses.
Interface Implementation: All animals implement the AnimalBehavior interface, ensuring
that they all provide implementations for the methods defined in the interface.
Constructors: Use in specific animal classes to initialize properties like name, age, or
any unique attributes they have.
Task Objective:
Design the class structure as described, implementing the necessary methods and
        properties.
*/


