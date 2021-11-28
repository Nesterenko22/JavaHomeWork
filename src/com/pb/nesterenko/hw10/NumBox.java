package com.pb.nesterenko.hw10;

import com.pb.nesterenko.hw8.WrongLoginException;

import java.util.Arrays;

public class NumBox <T extends Number>{

    private final T[] number;

    public NumBox(T[] number) {
        this.number = number;
    }
    public NumBox(int num){
        number = (T[]) new Number[num];
    }

    public T[] getNumber() {
        return number;
    }
    public T[] setNumber() {
        return number;
    }

    public void add(T t) {
        number.add(t);
    }

    public T get(int index) {
        return number.get(index);
    }
    public void add() throws IndexException {
        if (i == number.length) {
            throw new WrongLoginException("масив запоолнен");
    public int length() {
        int i = 0;
        for (T n: number){
            if (n == null) {
                break;
            }
            i++;
            if (i== number.length){
                System.out.println("Масив заповнений");
                break;
            }
        }
        return i;
    }
    public double average() {
        double average;
        double sum = 0;
        int i = 0;
        for (T n: number){
            if (n != null) {
                Double nNew = (Double) n;
                double nNum = nNew.doubleValue();
                sum += nNum;
                i++;
            }

               else break;
            }
        average = sum / i;
        return  average;
        }



    }

}

