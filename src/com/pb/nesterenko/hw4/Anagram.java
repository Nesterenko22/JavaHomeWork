package com.pb.nesterenko.hw4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] arg) {
        System.out.println("Введите предложение");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if (isAnagrama(s1,s2))
            System.out.println(" Да Анаграма");
        else
            System.out.print("Нет анаграмы");

        }
        private static boolean isAnagrama(String s1, String s2){
        int r = 0;

        for(int i = 0; i < s1.length(); i++)
            r = r ^ s1.charAt(i);
        for(int i = 0; i < s2.length(); i++)
                r = r ^ s2.charAt(i);


            return ( r == 0);


        }







}
