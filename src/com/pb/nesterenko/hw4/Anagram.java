package com.pb.nesterenko.hw4;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] arg) {
        System.out.println("Введите предложение");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        char[] word1 = s1.toCharArray();
        char[] word2 = s2.toCharArray();

        Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

        for (char c: word1){
            int count = 1;
            if (lettersInWord1.containsKey(c)){
                count = lettersInWord1.get(c) + 1;
            }
            lettersInWord1.put(c, count);
        }

     for (char c : word2) {
         int count = 1;
         if (lettersInWord1.containsKey(c)) {
             count = lettersInWord1.get(c) - 1;
         }
     }
       lettersInWord1.put(c, count);

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
