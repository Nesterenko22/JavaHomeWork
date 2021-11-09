package com.pb.nesterenko.hw6;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class vetClinic {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Мурчик", "Білий");
        cat.setFood("Молоко і мясо");
        cat.setLocation("Подвіря");

        Cat cat2 = new Cat("Том", "Смугастик");
        cat2.setFood("Молоко і мясо");
        cat2.setLocation("Будинок");

        Horse horse = new Horse("Буцефал", 89);
        horse.setFood("Овес і яблока");
        horse.setLocation("Іподром");

        Dog dog = new Dog("Мухтар", "Бульдог");
        dog.setFood("Каша і кісточка");
        dog.setLocation("Парк");

        Class clazzCat = Cat.class;
        Class clazzDog = Dog.class;

        Animal[] animals = new Animal[] {cat, cat2, horse, dog};

        Class clazz = Class.forName("hw6.Veterinarian");



        Constructor constr = clazz.getConstructor(String.class);
        Object vet = constr.newInstance("Айболіт");

        Method treatAnimal = clazz.getMethod("treatAnimal", Animal.class);

        for(Animal animal: animals) {
            treatAnimal.invoke(vet, animal);
        }


        Class catClazz = Cat.class;
        Class catClazz2 = cat2.getClass();
    }
}


    }

}
