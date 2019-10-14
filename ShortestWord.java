package com.code.assignment;

import java.util.Scanner;


public class ShortestWord {

    void shortAndLongWord(String str) {
        String shortest = "", longest = "";
        int s = str.length(), l = 0;
        String words[] = str.split(" ");

        for(String word:words) {
            if(word.length()<s)
                shortest = word;
            else if(word.length()>l)
                longest = word;
        }

        System.out.println("LONGEST WORD : "+longest);
        System.out.println("SHORTEST WORD : "+shortest);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        ShortestWord obj = new ShortestWord();
        System.out.printf("Enter String Line");
        String str = scr.nextLine();
        str += " ";
        obj.shortAndLongWord(str);
    }

}
