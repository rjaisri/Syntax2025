package org.group_Project;

public class VowelCount {
   // Create a method to count how many vowels are present in a string “documentation”

    public static void main(String[] args) {
        String input = "documentation";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in '" + input + "': " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU"; // Include uppercase vowels as well
        for (int i = 0; i < str.length(); i++) {
            //alternate way to check
           // scan the string for a character




            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
                System.out.println("Found vowel: " + str.charAt(i) + " at index " + i);
            }
        }
        return count;
    }
}
