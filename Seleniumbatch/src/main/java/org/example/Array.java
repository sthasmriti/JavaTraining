package org.example;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<Integer> listofnums = new ArrayList<>();
        listofnums.add(5);
        listofnums.add(4);
        listofnums.add(81);
        listofnums.add(66);
        listofnums.add(12);
        listofnums.add(1);

        for (int i = 0; i < listofnums.size(); i++) {
            System.out.println(listofnums.get(i)*listofnums.get(i));
        }
    }
}
