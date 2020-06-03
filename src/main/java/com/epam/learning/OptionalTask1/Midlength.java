package com.epam.learning.OptionalTask1;

import java.util.Scanner;

public class Midlength {
    int N;
    public static void Midcount(int[] arr, int N, int[] temp){
        double mid = 0;
        int sum = 0;
        int count = 0;
        int t;

        for (int i = 0; i <arr.length ; i++) {
            t = arr[i];
            while (t>0){
                t/=10;
                count++;
            }temp[i] += count;
            sum+=count;
            count = 0;


        }mid = sum/N;
        System.out.println("The mid length is: " + mid);
        for (int i = 0; i <arr.length ; i++) {
            if(temp[i]<mid){
                System.out.println("The shorter number for mid length is:" + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter the size of array");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] arr = new int[N];
        int [] temp = new int[N];
        System.out.println("Please enter the numbers");
        Scanner num = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            arr[i] = num.nextInt();
        }Midcount(arr, N, temp);

    }
}
