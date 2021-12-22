package com.pb.nesterenko.hw12;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] arg){
        List<Person> persons = Arrays.asList(
                new Person("Vitaliy", "0503849074", LocalDate.of(1975, 12, 30),
                        "Kyiv","2021-12-01"),
                new Person("Vasiliy", "0688090543", LocalDate.of(1986, 3, 2),
                        "Uzin", "2021-12-27"),
                new Person("Vlentyn", "0968320932", LocalDate.of(1985, 6, 28),
                        "Pokrovsmk",'2021-12-12')
        );

      System.out.println("");
      System.out.println(Arrays.toString(persons));

      Arrays.sort(persons,new Comparator.comparingInt(Person::getDateOfBirth));
      Arrays.sort(persons, (p1, p2) -> p1.getDateOfBirth() - p2.getDateOfBirth());
      System.out.println(Arrays.toString(persons));
    }
    Map<Person> result = persons.stream()
            .sorted(Comparator
                    .comparing(Person::getAdress, Comparator.comparing(Enum::name))
                    .thenComparing(Person::getDateAndTimeEdit)
            )
            .collect(Collectors.groupingBy(
                    Person::getAdress,
                    LinkedHashMap::new,
                    Collectors.groupingBy(Person::getDateAndTimeEdit)));

        result.forEach((s, map) -> {
        System.out.println("-= " + s + " =-");
        map.forEach((year, list) -> System.out.format("%d: %s%n", year, list.stream()
                .map(Person::getPhone)
                .sorted()
                .collect(Collectors.joining(", ")))
        );
        System.out.println();
    });

}
