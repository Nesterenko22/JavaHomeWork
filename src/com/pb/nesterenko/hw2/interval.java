package com.pb.nesterenko.hw2;

import java.util.Scanner;

public class interval {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second;
                System.out.print("Enter first num: ");
                first = num.nextInt();

                if (first <= 14) {
                    System.out.print("Nan is one period");
                    System.out.print("\n");
                } else if (first >= 15 && first <= 35) {
                    System.out.print("Num is two period");
                } else if (first >= 36 && first <= 50) {
                    System.out.print("num is three reriod");
                } else if (first <= 51 && first >= 100) {
                    System.out.print("Num is four period");
                }
    }
}
