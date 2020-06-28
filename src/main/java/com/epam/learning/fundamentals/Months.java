package com.epam.learning.fundamentals;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("What number will you give me?");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String month;

        if (number <= 12 && number > 0) {
            month = months[number - 1];
            System.out.println("This is your month - " + month);

        } else {
            System.out.println("There isn't such month");
        }
    }
}
