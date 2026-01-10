package org.group_Project;

/*Further Specialization: Within the Mammal and Bird classes, create specific animals,
such as Lion, Elephant (Mammals), and Parrot, Eagle (Birds). These specific animal
classes will override the methods from their parent classes to provide behaviors and
sounds unique to each animal.*/

public class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(name + " is eating meat.");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " roars.");
    }
    @Override
    public void displayInformation() {
        System.out.println("Lion Name: " + name + ", Age: " + age);
    }
}

