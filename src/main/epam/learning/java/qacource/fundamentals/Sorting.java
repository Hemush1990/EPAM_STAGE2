package qacource.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Please, enter the values:");
        Scanner in = new Scanner(System.in);
        int[] nums = new int[7];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        System.out.print("The sorted numbers are: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


    }
}
