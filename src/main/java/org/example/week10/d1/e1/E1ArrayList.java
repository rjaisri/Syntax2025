package org.example.week10.d1.e1;
import java.util.*;

public class E1ArrayList {
    public static void main(String[] args) {

        // Step 1: Create a `E1ArrayList` class with the following:
        // Initialize an `ArrayList<String>` to store tasks.
        // Use the `isEmpty()` method to check if the list is empty.
        // Add the task `"Buy Groceries"` to the list.
        // Use the `isEmpty()` method again to check if the list is still empty after adding the task.
        ArrayList<String> tasks = new ArrayList<>();

        // Check if the list is empty initially
        // System.out.println(tasks.isEmpty());
        if (tasks.isEmpty()) {
            System.out.println("true");
        }
        // Add the task "Buy Groceries" to the list
        tasks.add("Buy Groceries");


        // Check if the list is empty after adding the task
        // System.out.println(tasks.isEmpty());
        // Step 2: Print `true` if the list is empty initially and `false`
        // after adding the task.
        if (tasks.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }


    }
}



