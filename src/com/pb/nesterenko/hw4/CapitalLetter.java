package com.pb.nesterenko.hw4;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class CapitalLetter {
    public static void main (String[] arg) {
        System.out.println("Введите предложение");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0; i< (s.length());i++){
            String outString;
            if(s.charAt(i)==' '){
               assert outString != null;
                outString= outString.substring(0,i+1)+s.substring(i+1,i+2).toUpperCase()+s.substring(i+2);
            } else if(i==0){
                 outStr = str.substring(0, 1).toUpperCase() + str.substring(1);
            }
        }


    }

}
