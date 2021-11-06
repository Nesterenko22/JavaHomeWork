package com.pb.nesterenko.hw6;

public class horse extends animal{
    private String strong;



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
