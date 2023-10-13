package org.example;

public class Regex {
    public static void main(String[] args) {
        String str = "A$$$ @@@dj ksdAksdkAAA";


        int count1 = str.replaceAll("[A-Za-z0-9\s]","").length();

        System.out.println(count1);

    }

}
