package org.group_Project;

public class q1 {
   // Write a program to swap 2 String without a temporary variable

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);

        // Swapping without a temporary variable
        str1 = str1 + str2; // str1 now contains "HelloWorld"
        str2 = str1.substring(0, str1.length() - str2.length()); // str2 now contains "Hello"
        str1 = str1.substring(str2.length()); // str1 now contains "World"

        System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);
    }
}
