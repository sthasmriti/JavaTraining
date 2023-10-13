package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterviewQues {
    public static void main(String[] args) {

        String str = "elepahant";
        Set<Character> set = new HashSet<>();
        List<Character> uniquevalues = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(set.add(ch)){
                uniquevalues.add(ch);
            }
        }

        System.out.println(uniquevalues);
    }
}
