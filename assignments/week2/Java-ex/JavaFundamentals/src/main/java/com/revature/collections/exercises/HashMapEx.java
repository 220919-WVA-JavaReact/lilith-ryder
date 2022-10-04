package com.revature.collections.exercises;

import java.util.HashMap;

public class HashMapEx {

    /*
    Below is a list of exercises to help you get familiar with working with the HashMap Collection
     */

    public static void main(String[] args) {

        // 1. Create a HashMap with Integers for the Keys and Strings for the Entries. Insert 5 entries with numbers as
        // the key and colors as the value associated
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Orange");
        colors.put(3, "Yellow");
        colors.put(4, "Green");
        colors.put(5, "Blue");
        System.out.println(colors);
        // 2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println(colors.size());

        // 3. Write a Java program to test if a map contains a mapping for the specified key
        System.out.println(colors.containsKey(3));

        // 4. Write a Java program to get the value of a specified key in a map.
        System.out.println(colors.get(3));


        // 5. Write a Java program to get a set view of the keys contained in this map.
        for (int i : colors.keySet()) {
            System.out.println(i);
        }

    }

}
