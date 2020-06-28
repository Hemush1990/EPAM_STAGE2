package com.epam.learning.fundamentals;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.next();

        System.out.println("Hello, my dear " + name);
    }

}
