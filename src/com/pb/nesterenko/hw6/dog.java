package com.pb.nesterenko.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dog dog = (dog) o;
        return Objects.equals(friend, dog.friend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(friend);
    }

    @Override
    public String toString() {
        return "dog{" +
                "friend='" + friend + '\'' +
                '}';
    }



