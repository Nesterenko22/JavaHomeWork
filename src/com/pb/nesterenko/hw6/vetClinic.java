package com.pb.nesterenko.hw6;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class vetClinic {
    public static void main(String[] args) throws Exception {
        cat cat = new cat("Мурчик", "Білий");
        cat.setFood("Молоко і мясо");
        cat.setLocation("Подвіря");

        cat cat2 = new cat("Том", "Смугастик");
        cat2.setFood("Молоко і мясо");
        cat2.setLocation("Будинок");

        horse horse = new horse("Буцефал", 89);
        horse.setFood("Овес і яблока");
        horse.setLocation("Іподром");

        dog dog = new dog("Мухтар", "Бульдог");
        dog.setFood("Каша і кісточка");
        dog.setLocation("Парк");

        Class clazzCat = cat.class;
        Class clazzDog = dog.class;

        animal[] animals = new animal[] {cat, cat2, horse, dog};

        Class clazz = Class.forName("hw6.Veterinarian");



        Constructor constr = clazz.getConstructor(String.class);
        Object vet = constr.newInstance("Айболіт");

        Method treatAnimal = clazz.getMethod("treatAnimal", animal.class);

        for(animal animal: animals) {
            treatAnimal.invoke(vet, animal);
        }


        Class catClazz = cat.class;
        Class catClazz2 = cat2.getClass();
    }
}


    }

}
