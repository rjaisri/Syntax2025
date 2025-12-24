package org.example.week8.d4.e2;

public class AccessTester {
    /*
    . **Declare Variables with Access Modifiers in `AccessTester`**
   Inside the `AccessTester` class (but outside any methods), declare the following instance variables:
    - A **private** variable for `name` (type `String`)
    - A **default** (package-private) variable for `city` (type `String`)
    - A **public** variable for `batchNumber` (type `int`)

2. **Create a Method to Display Details**
   In the `AccessTester` class, create a method named `display` that prints a message using the declared variables.
   The message should be in the following format (using a literal for the school name):
   ```
   My name is John and I live in Miami. I study at Syntax in batch 9.
   ```
     */
    private String name;
    String city;
    public int batchNumber;
    //constructor
    public AccessTester(String name, String city, int batchNumber) {
        this.city = city;
        this.batchNumber = batchNumber;
        this.name = name;
    }

    void display() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at Syntax in batch " + batchNumber + ".");
    }

    }



