package com.pb.nesterenko.hw3;

public class Array2 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 3, 4, 73, 6, 12, 8, 9};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Сумма равна" + sum);
    }
}
