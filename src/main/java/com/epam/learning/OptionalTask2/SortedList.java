package com.epam.learning.OptionalTask2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

        public static void main(String[] args)  {
            String s;


            List<String> list = new ArrayList<>();


            try {
                BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
                s=reader.readLine();
                list.add(s);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Text from file is here" + list);

            Collections.reverse(list);


            System.out.println("The sorted list  is " + list);


        }
    }


