package com.revature.collections.exercises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {
    /*
   Below is a list of exercises to help you get familiar with working with the ArrayList Collection
    */
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a linked list. Add several values.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");
        System.out.println(colors);

        // 2. Write a Java program to iterate through all elements in a linked list.
        Iterator<String> it = colors.iterator();
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Write a Java program to iterate a linked list in reverse order
        ListIterator iterator = colors.listIterator(colors.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        // 4.  Write a Java program to insert the specified element at the front of a linked list
        colors.addFirst("Pink");
        System.out.println(colors);

        // 5. Write a Java program to insert some elements at the specified position into a linked list.
        colors.add(5, "Aqua");
        System.out.println(colors);

        // 6. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println(colors.getFirst());
        System.out.println(colors.getLast());

        // 7. Write a Java program to check if a particular element exists in a linked list.
        System.out.println(colors.indexOf("Aqua"));

        // 8. Write a Java program to convert a linked list to array list.
        Object[] colorArray = colors.toArray();
        System.out.println(colorArray);

    }
}
