package com.epam.learning.fundamentals;

import java.util.Random;
import java.util.Scanner;


public class RandomNum {

    public static void main(String[] args) {
        System.out.println("Please enter the size of array");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        Random wow = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = wow.nextInt(20);
        }
        System.out.println("The array on the same line: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("\nThe array for the next lines:");
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }


}

