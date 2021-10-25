package com.pb.nesterenko.hw3;

import java.util.Scanner;

public class bingo {
    private static int TrysCount;

    public static void main(String[] args)
    {
        int UnknownNumber, UserNumber ,
                TrysCouunt = 0;
        Scanner input = new
                Scanner(System.in);
        System.out.println("ЗАДАЧА: уГАДАТЬ ЧИСЛО (ОТ 0 ДО 100).");
        UnknownNumber =
                (int)Math.floor(Math.random() * 100);
        do {
            TrysCount++;
            System.out.print("Введите ваше число:");
            UserNumber = input.nextInt();
            if (UserNumber > UnknownNumber)
                System.out.println("Мое число меньше.");
            else if (UserNumber < UnknownNumber)
                System.out.println("Мое число больше.");
            else
                System.out.println("Вы угадали");
            if (UnknownNumber == 101 ){
                break;
            }
            System.out.println("Пока пока))))");

        }
        while (UserNumber != UnknownNumber);
        System.out.println("Поздравляем, Вы угадали с" + TrysCouunt + "попытки");

    }



    }