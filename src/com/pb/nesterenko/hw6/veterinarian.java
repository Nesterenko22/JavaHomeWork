package com.pb.nesterenko.hw6;

public class veterinarian {

    private String name;

    public veterinarian(String name) {
        this.name = name;
    }

    public veterinarian() {
    }

    public void treatAnimal(animal animal) {
        System.out.println("ветеринар " + name + " лікує тваринку " + animal.getName() +
                " на " + animal.getLocation() + " яке полюбляє " + animal.getFood());
    }
}