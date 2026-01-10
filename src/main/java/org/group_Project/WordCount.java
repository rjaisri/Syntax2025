package org.group_Project;
/*Count the Number of Words in a String: Write a function to count the number of words
in a given string. Words are separated by spaces or punctuation. For example, the input
"Hello, world!" should return 2.
 */

public class WordCount {

    public static void main(String[] args) {
        String input = "Hello, world!";
        int wordCount = countWords(input);
        System.out.println("Number of words in '" + input + "': " + wordCount);
    }

    public static int countWords(String str) {
        // Use regex to split the string by spaces and punctuation
        String[] words = str.trim().split("[^a-zA-Z]+");

        return words.length;
    }

}
