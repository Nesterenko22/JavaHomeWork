package com.pb.nesterenko.hw12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class phoneBook {
    public static void main(String[] arg){
        ArrayList<String> persons = new ArrayList();
        List<String> strings = Arrays.asList("PersonX", "PersonY", "PersonZ");
        persons.addAll(strings);

        persons.add("Fullname","phone");
        System.out.println(persons);

        ArrayList<String> favorite =new ArrayList<>();
        favorite.add("Vitaliy");
        favorite.add("Valentyn");
        persons.removeAll(favorite);
        System.out.println("Після видалення" +  persons);

    }

}
