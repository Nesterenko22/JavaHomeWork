package com.pb.nesterenko.hw6;

import java.util.Objects;

public class cat extends animal {

    private String meow;


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
        cat cat = (cat) o;
        return Objects.equals(meow, cat.meow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meow);
    }

    @Override
    public String toString() {
        return "cat{" +
                "meow='" + meow + '\'' +
                '}';
    }
}
