package org.group_Project;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        //String input = "madam";
        //take input from keyboard, use scanner class to read the input from the user and store it in a variable. Then check if the input is a palindrome or not and print the result.
        // use loop to check input till quit is entered by the user. If the user enters "quit", the program should stop.
        while (true) {
            System.out.println("Enter a string to check if it's a palindrome (or type 'quit' to exit):");
            Scanner scanner = new Scanner(System.in);
            String inputFromUser = scanner.nextLine(); // Read the input from the user and store it in a variable

            if (inputFromUser.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            boolean isPalindrome = checkPalindrome(inputFromUser);
            if (isPalindrome) {
                System.out.println(inputFromUser + " is a palindrome.");
            } else {
                System.out.println(inputFromUser + " is not a palindrome.");
            }
        }

    }

    public static boolean checkPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
}
