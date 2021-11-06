package com.pb.nesterenko.hw6;

public class dog extends animal {

    private String friend;



    @Override
    public void makeNoise() {
        System.out.println(getLocation() + " грати");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(getFood() + " їсти");
        super.eat();
    }

