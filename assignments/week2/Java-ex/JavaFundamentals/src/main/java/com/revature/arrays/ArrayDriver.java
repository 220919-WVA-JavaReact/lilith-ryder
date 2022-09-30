package com.revature.arrays;

import java.util.Arrays;

public class ArrayDriver {
    public static void main(String[] args) {
        int[] myNumArray = new int[10];

        myNumArray[0] = 74;

        System.out.println(Arrays.toString(myNumArray));

        int[] myArray = {1,2,3,4,5};

        System.out.println(Arrays.toString(myArray));

        double balance = 0;

        double[] transactions = {1000, -119.99, 40, -35.43, -150.65};

        for (int i = 0; i < transactions.length;i++) {
            balance += transactions[i];
        }

        System.out.println("Balance: " + balance);
    }
}
