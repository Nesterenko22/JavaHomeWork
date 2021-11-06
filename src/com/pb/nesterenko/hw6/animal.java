package com.pb.nesterenko.hw6;

public class animal {

    private String food;
    private int location;

    public animal() {

    }

    public animal(String food) {
        this.food = food;
    }



    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("тваринка грається");
    }

    public void eat() {
        System.out.println(" тваринка хоче їсти");
    }

    public void sleep() {
        System.out.println("тваринка хоче спати");
    }
}

