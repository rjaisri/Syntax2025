package org.example.week10.d1.e4;
import java.util.*;
public class E4ArrayList {
    public static void main(String[] args) {


        // Step 1: Create a `E5ArrayList` class with the following:
        // Initialize an ArrayList<String> to store chat messages entered by the user.
        // Use the Scanner class to input 5 chat messages from the user.
        // Simulate removing unwanted messages by removing the 1st, 3rd, and 5th elements (index 0, 2, and 4).
        // Print the remaining chat messages in a single line, separated by spaces.
        // Step 2: Input messages from the user, remove specific ones, and print the remaining messages in one line.
        ArrayList<String> chatMessages = new java.util.ArrayList<>();
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter 5 chat messages:");
        for (int i = 0; i < 5; i++) {
            String message = scanner.nextLine();
            chatMessages.add(message);

        }
        // Remove 1st, 3rd, and 5th messages (indices 0, 2, and 4)
        chatMessages.remove(4); // Remove 5th message first to avoid index shift
        chatMessages.remove(2); // Remove 3rd message
        chatMessages.remove(0); // Remove 1st message
        // Print remaining messages in a single line separated by spaces
        System.out.println("Remaining messages:");
        for (String msg : chatMessages) {
            System.out.print(msg + " ");


        }
    }
}


