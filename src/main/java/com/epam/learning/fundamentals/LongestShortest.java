package com.epam.learning.fundamentals;

import java.util.Scanner;

public class LongestShortest {
    public static void main(String[] args) {
        System.out.println("Please enter the size of array");

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] arr = new String[N];

        System.out.println("Please enter the numbers");
        Scanner num = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            arr[i] = num.next();
        }
        counting(arr);
    }

    public static void counting(String[] arr) {
        int min_num = arr[0].length();
        int max_num = 0;
        for (String number : arr) {
            if (number.length() > max_num) {
                max_num = number.length();
            } else if (number.length() < min_num) {
                min_num = number.length();

            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == max_num) {
                System.out.println("The longest number is " + arr[i] + " and his length is " + arr[i].length());
            } else if (arr[i].length() == min_num) {
                System.out.println("\nThe shortest number is " + arr[i] + " and his length is " + arr[i].length());
            }
        }
    }
}
