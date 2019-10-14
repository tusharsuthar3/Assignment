package com.code.assignment;

import java.util.Scanner;

public class LongTypeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = in.nextInt();
        System.out.println("The sum is " + sumDigits(num));
    }

    public static int sumDigits(long n) {
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;


    }






}
