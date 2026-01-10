package org.group_Project;

import java.util.ArrayList;
import java.util.List;

/*You have a list of strings and you want to keep only those that start with “A” and you
want to return them in lower case".*/
public class Lowercase {
    public static void main(String[] args) {
        String[] input = {"aPPLe", "Banana", "Avocado", "Cherry", "Apricot"};


        List<String> result = new ArrayList<>();

        for (String s : input) {
            if (s != null && s.startsWith("A")) {
                result.add(s.toLowerCase());
            }
        }
        for(String s : result){
            System.out.println(s);
        }



    }
}
