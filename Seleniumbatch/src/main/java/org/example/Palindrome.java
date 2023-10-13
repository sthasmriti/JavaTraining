package org.example;

public class Palindrome {
    public static void main(String[] args) {
        String nm = "Mam";
        String rev = "";

        for (int i = nm.length()-1; i >= 0 ; i--) {
            rev = rev + nm.charAt(i);
        }

        if (nm.toLowerCase().equals(rev.toLowerCase())){
            System.out.println(nm+"Is a Palindrome String");
        }
        else {
            System.out.println(nm + " Is NOT a Palindrome String");
        }

//        System.out.println(rev);
    }
}
