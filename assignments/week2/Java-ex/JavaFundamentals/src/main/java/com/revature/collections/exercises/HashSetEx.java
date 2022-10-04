package com.revature.collections.exercises;

import java.util.HashSet;

public class HashSetEx {
    /*
    Below is a list of exercises to help you get familiar with working with the HashSet Collection
     */
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a hash set
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");


        // 2. Write a Java program to iterate through all elements in a hash list.
        for (String i : colors) {
            System.out.println(i);
        }


        // 3. Write a Java program to get the number of elements in a hash set
        System.out.println(colors.size());


        // 4. Write a Java program to test a hash set is empty or not
        System.out.println(colors.isEmpty());


        // 5. Write a Java program to convert a hash set to an array.
        Object[] colorArray = colors.toArray();
        System.out.println(colorArray);



    }
}

