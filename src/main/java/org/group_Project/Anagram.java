package org.group_Project;

import java.util.Scanner;

public class Anagram {
    /* Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
    meaning they contain the same characters in a different order. For example, "listen"
    and "silent" are anagrams.*/
    public static void main(String[] args) {
        System.out.println("Enter 2 strings to check if they are anagrams:");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String inputFromUser = scanner.nextLine(); // Read the input from the user and store it in a variable
            String inputFromUser2 = scanner.nextLine();
            if (inputFromUser.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            if (inputFromUser.length() != inputFromUser2.length()) {

                System.out.println("The strings are not anagrams.");
            } else {
                char[] charArray1 = inputFromUser.toCharArray();
                char[] charArray2 = inputFromUser2.toCharArray();
                java.util.Arrays.sort(charArray1);
                java.util.Arrays.sort(charArray2);
                if (java.util.Arrays.equals(charArray1, charArray2)) {
                    System.out.println("The strings are anagrams.");
                } else {
                    System.out.println("The strings are not anagrams.");
                }
            }
        }
    }
}
