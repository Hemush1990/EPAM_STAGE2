package com.epam.learning.MainTask1;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Hello, my friend, give me two numbers");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        System.out.println("The sum of two digits " + (a+b));
        System.out.println("The multiple of two digits " +  (a*b));
    }
}
