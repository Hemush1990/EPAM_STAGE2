package qacource.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class ReverseDigits {
    public static void main(String[] args) {
        Integer digit = Integer.parseInt(printNum());
        int a;

        Deque<Integer> num = new LinkedList<>();
        while ((a = digit % 10) != 0) {
            num.addFirst(a);
            digit = digit / 10;
        }

        System.out.println(num);

        int revNumber;
        while ((num.peekLast()) != null) {
            revNumber = num.pollLast();
            System.out.print(revNumber);
        }
    }

    private static String printNum() {
        System.out.println("Enter a number:");

        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
        } catch (IOException exc) {
            System.out.println("Incorrect number" + exc);
        }
        return s;
    }
}

