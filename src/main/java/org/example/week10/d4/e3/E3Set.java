package org.example.week10.d4.e3;

import java.util.LinkedHashSet;

public class E3Set {
    public static void main(String[] args) {

        // Step 1: Create a `E3Set` class with the following:
        // Initialize a LinkedHashSet<String> to store email addresses, which will preserve the order in which they were added and ensure that duplicates are not stored.
        // Step 2: Add the following email addresses to the LinkedHashSet:
        // Add null, "john.doe@example.com", "jane.smith@example.com", "john.doe@example.com" (duplicate), "admin@event.com", and "info@company.com".
        // Step 3: Use a for-each loop to iterate through the LinkedHashSet and print the email addresses one by one.
        LinkedHashSet<String>linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(null);
        linkedHashSet.add("john.doe@example.com");
        linkedHashSet.add("jane.doe@example.com");
        // Add null, "john.doe@example.com", "jane.smith@example.com", "john.doe@example.com" (duplicate), "admin@event.com", and "info@company.com".
        linkedHashSet.add("john.doe@example.com");
        linkedHashSet.add("admin@event.com");
        linkedHashSet.add("info@company.com");
        for(String email : linkedHashSet){
            System.out.println( email);

        }



    }
}
