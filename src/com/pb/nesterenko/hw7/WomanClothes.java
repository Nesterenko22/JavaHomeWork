package com.pb.nesterenko.hw7;

public interface WomanClothes {
    default void dressWoman() {
        System.out.println("Одягнути жінку");
    }
    static void dress() {
        System.out.println("назва" + "розмір" + "ціна" + "колір");
}


    }
