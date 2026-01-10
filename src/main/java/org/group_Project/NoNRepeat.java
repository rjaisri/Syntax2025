package org.group_Project;
/*
Find the First Non-Repeating Character in a String: Given a string, find and return the
first non-repeating character. For example, in the string "abracadabra", the first
non-repeating character is 'c'.
 */
public class NoNRepeat {

    public static void main(String[] args) {
        String input = "abracadabrac";
        char result = findFirstNonRepeatingCharacter(input);
        if (result != '\0') {
            System.out.println("The first non-repeating character in '" + input + "' is: " + result);
        } else {
            System.out.println("No non-repeating character found in '" + input + "'.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                return currentChar;
            }
        }
        return '\0'; // Return null character if no non-repeating character is found
    }
}
