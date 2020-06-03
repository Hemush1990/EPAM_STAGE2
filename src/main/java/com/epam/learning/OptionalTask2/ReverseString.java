package com.epam.learning.OptionalTask2;


import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) throws FileNotFoundException {
        String s;


        List<String>list = new ArrayList<>();


        try {BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
            s=reader.readLine();
            list.add(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Text from file is here" + list);

        Collections.reverse(list);

        try (FileWriter fw = new FileWriter("Text2.txt")) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String st = it.next();
                fw.write("\r\n"+ st);
            }

        } catch (IOException exc) {
            System.out.println("Error in writting file");
        }
        System.out.println("The writting process is successful");




    }
}
