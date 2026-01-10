package org.group_Project;

/*Part 2: Creating Specific Animal Classes
Class Mammal and Bird: Extend the Animal class. These classes will override the eat(),
makeSound(), and displayInformation() methods to provide specific behaviors and
information display mechanisms for mammals and birds, respectively.*/

public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating plants or meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a mammal sound.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Mammal Name: " + name + ", Age: " + age);
    }
}
