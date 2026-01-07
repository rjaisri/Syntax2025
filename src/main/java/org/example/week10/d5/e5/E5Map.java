package org.example.week10.d5.e5;


import java.util.*;


public class E5Map {

    public static void main(String[] args) {

        // Heads Up This is a little bit tricky
        // Initialize a HashMap<String, List> where the key represents

        // the Subject and the value List of Students.
        HashMap<String, List<String>> subjectStudentsMap = new HashMap<>();


        // Add the following Students Grouped by Subject into HashMap:


        // Add "Mathematics" = ["Alice", "Bob"],

        // "Science" = ["Charlie", "David"],
        // "History" = ["Eve", "Frank"].
        subjectStudentsMap.put("Mathematics", Arrays.asList("Alice", "Bob"));
        subjectStudentsMap.put("Science", Arrays.asList("Charlie", "David"));
        subjectStudentsMap.put("History", Arrays.asList("Eve", "Frank"));
        for(var entry : subjectStudentsMap.entrySet()){
            System.out.println("Subject: " + entry.getKey() + " Students: " + entry.getValue());
        }
        // Print the contents of each map using a loop,
        // and observe how the data is organized into lists for each key.
        // Use a for-each loop to iterate through the
        // entries of the TreeMap and print each key-value pair
        // in the format:Subject: [key] Students: [value].
        //for(var entry : subjectStudentsMap.entrySet()){
          //  System.out.println("Subject: " + entry.getKey() + " Students: " + entry.getValue());
        }



    }






