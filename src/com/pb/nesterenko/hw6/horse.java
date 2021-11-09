package com.pb.nesterenko.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        horse horse = (horse) o;
        return Objects.equals(strong, horse.strong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strong);
    }

    @Override
    public String toString() {
        return "horse{" +
                "strong='" + strong + '\'' +
                '}';
    }
