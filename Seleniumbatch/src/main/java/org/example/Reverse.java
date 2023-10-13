package org.example;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String word = "Hi everyone how you guys are doing";
        String[] arr = word.split(" ");
        String output = "";
        System.out.println(Arrays.toString(arr));

        String[] new_arr = new String[arr.length];
        int count = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            String res = "";
            for(int j = arr[i].length()-1; j >=0;j--){
                res = res +arr[i].charAt(j);
            }
            arr[i]= res;

        }
        System.out.println(Arrays.toString(arr));

    }
}
