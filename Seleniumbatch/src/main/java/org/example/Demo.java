package org.example;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        HashMap<String, String> reversedHashMap = new HashMap<String, String>();

        map.put("name1", "Alex");
        map.put("name3", "paul");
        map.put("name2", "Ronit");
        map.put("name4", "Ali");
        map.put("name5", "Peter");
        map.put("name6", "Max");

        for (String i : map.keySet()) {
            reversedHashMap.put(map.get(i), i);
        }
        System.out.println(map);
    }
}
