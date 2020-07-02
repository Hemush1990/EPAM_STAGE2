package qacource.fundamentals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

    public static void main(String[] args) {
        String line;

        List<String> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
            line = reader.readLine();
            list.add(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Text from file is here" + list);

        Collections.reverse(list);


        System.out.println("The sorted list  is " + list);


    }
}


