package org.example.week10.d2.e3;
import java.util.*;


public class E3LinkedList {
    public static java.util.LinkedList<String> removeCountriesStartingWithA(java.util.LinkedList<String> countries) {
        countries.removeIf(country -> country.startsWith("A"));
        return countries;
    }
    public static void main(String[] args) {


        // Create a method removeCountriesStartingWithA that
        // takes a List<String> as a parameter.



        // Remove all elements from the list that start with the letter 'A'.
        // Return the updated list.
        // In the main method, add the following country names to the List<String>:
        // "USA", "Argentina", "Kazakhstan", "Australia", "Pakistan", "Russia"
        // Call the removeCountriesStartingWithA method and pass the list of country names as a parameter.
        // Print the updated list, which should no longer contain countries starting with 'A'.
        java.util.LinkedList<String> countries = new java.util.LinkedList<>();
        countries.add("USA");
        countries.add("Argentina");
        countries.add("India");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("SriLanka");
        java.util.LinkedList<String> updatedCountries = removeCountriesStartingWithA(countries);
        System.out.println(updatedCountries);




    }
}
