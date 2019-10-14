package com.code.assignment;

import java.util.Scanner;

public class IncreaseDecrease {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        double num = scan.nextDouble();
        System.out.println("Enter number2");
        double num2 = scan.nextDouble();
        System.out.println("Enter number2");
        double num3 = scan.nextDouble();

        if (num < num2 && num2<num3){

            System.out.println("Increasing");
        }else if (num > num2 && num2>num3){

            System.out.println("Decreasing");
        }else {

            System.out.println("Neither Increasing or Decreasing");
        }





    }



}
