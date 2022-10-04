package com.revature.collections.exercises;
import  java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {
    /*
Below is a list of exercises to help you get familiar with working with the ArrayList Collection
 */
    public static void main(String[] args) {

        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
            ArrayList<String> colors = new ArrayList<String>();
            colors.add("Red");
            colors.add("Orange");
            colors.add("Yellow");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Indigo");
            colors.add("Violet");
        System.out.println(colors);


        // 2. Write a Java program to iterate through all elements in an array list
        Iterator<String> it = colors.iterator();
        for (String color : colors) {
            System.out.println(color);
        }


        // 3. Write a Java program to insert an element into the array list at the first position
            colors.add(1, "Pink");
        System.out.println(colors);


        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println(colors.get(1));



        // 5. Write a Java program to remove the third element from an array list.
        colors.remove(3);
        System.out.println(colors);


        // 6. Write a Java program to search an element in an array list.
        System.out.println(colors.indexOf("Violet"));


        // 7. Write a Java program to sort a given array list.
        Collections.sort(colors);
        for (String i : colors) {
            System.out.println(i);
        }


    }
}
