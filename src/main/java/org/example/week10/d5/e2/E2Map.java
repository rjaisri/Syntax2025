package org.example.week10.d5.e2;


import java.util.HashMap;

public class E2Map {

    public static void main(String[] args) {

        // Step 1: Create a `E2Map` class with the following:
        // Initialize a `HashMap<Integer, String>` where the key represents the unique book ID and the value represents the book title.
        HashMap<Integer, String> libraryCatalog = new HashMap<>();
        // Step 2: Add the following books as key-value pairs to the HashMap:
        // Add `101 = "The Catcher in the Rye"`, `102 = "To Kill a Mockingbird"`, `103 = "1984"`, `104 = "The Great Gatsby"`, `105 = "Moby Dick"`.
        libraryCatalog.put(101, "The Catcher in the Rye");
        libraryCatalog.put(102, "To Kill a Mockingbird");
        libraryCatalog.put(103, "1984");
        libraryCatalog.put(104, "The Great Gatsby");
        libraryCatalog.put(105, "Moby");


        // Step 3: Use the following methods** to manage and query the library catalog:
        // `size()`: Print the number of books currently in the catalog.
        System.out.println("Number of books in the catalog: " + libraryCatalog.size());


        // `isEmpty()`: Check if the catalog is empty and print the result.
        System.out.println("Is the catalog empty? " + libraryCatalog.isEmpty());
        // `containsKey(102)`: Check if the book with ID `102` (To Kill a Mockingbird) is available in the catalog.
        System.out.println("Is book with ID 102 available? " + libraryCatalog.containsKey(102));
        // `containsValue("1984")`: Check if the book titled `"1984"` is available in the catalog.
        System.out.println("Is the book '1984' available? " + libraryCatalog.containsValue("1984"));
        // `remove(105)`: Remove the book with ID `105` (Moby Dick) from the catalog and print the updated catalog.

        // `remove(105)`: Remove the book with ID `105` (Moby Dick) from the catalog and print the updated catalog.
        libraryCatalog.remove(105);
        //print the catalog

        //print the catalog
        System.out.println("Library Catalog:");
        for (Integer bookID : libraryCatalog.keySet()) {
            System.out.println("Book ID: " + bookID + ", Title: " + libraryCatalog.get(bookID));
        }


        // `clear()`: Clear the entire catalog and check if it’s empty using `isEmpty()`.// Add `101 = "The Catcher in the Rye"`, `102 = "To Kill a Mockingbird"`, `103 = "1984"`, `104 = "The Great Gatsby"`, `105 = "Moby Dick"`.
        libraryCatalog.clear();
        System.out.println(libraryCatalog.isEmpty());



    }

}
