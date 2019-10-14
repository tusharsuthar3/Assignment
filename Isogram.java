package com.code.assignment;

import java.util.Arrays;

public class Isogram {

    static boolean is_isolgram (String str){

        str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1 ; i++) {

            if (arr[i] == arr [i +1])
                return false;

            
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "Tushar";
        System.out.println(is_isolgram(str1));

        String str2 = "Tushaar";
        System.out.println(is_isolgram(str2));
    }



}






