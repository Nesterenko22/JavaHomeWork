package com.pb.nesterenko.hw11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.pb.nesterenko.hw3.Array;

import java.time.LocalDate;
import java.util.*;

public class Main {
    ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();


        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new s11json.LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new s11json.LocalDateDeserializer());
        ObjectMapper objectMapper = mapper.registerModule(module);
        String json = mapper.writeValueAsString(data);
        System.out.println(json);

        List<Person> persons = Arrays.asList(
                new Person("Vitaliy", "1233456", LocalDate.of(1975, 12, 30),
                        "Kyiv","2021-12-01"),
                new Person("Vasiliy", "3234345", LocalDate.of(1986, 3, 2),
                        "Uzin", "2021-12-27"),
                new Person("Vlentyn", "5454545", LocalDate.of(1985, 6, 28),
                        "Pokrovsmk",'2021-12-12')
        );

        String personsJson = mapper.writeValueAsString(persons);
        System.out.println(personsJson);
        List persons2 = mapper.readValue(personsJson, List.class);
        System.out.println(persons2.get(0).getClass().getName());
        System.out.println(persons2);

        List<Person> persons3 = mapper.readValue(personsJson, new TypeReference<List<Person>>() {});
        System.out.println(persons3.get(0).getClass().getName());
        System.out.println(persons3);
    }
    public void searchOneMember(){
        System.out.println(member);
        boolean flag = false;
        Scanner init = new Scanner(System.in);
        System.out.println("Якщо ви бажаєте  шукати:" + "\n" +
                "за назвою введіть 1" + "\n" +
                "за фаілією >> 2" + "\n" +
                "за номером >> 3");
        System.out.println(">>");
        int searchType = init.nextInt();

        Collections.reverse(Person);
        System.out.println('після реверсу' + Person);

        File file = Paths.get("files/person.data").toFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Person> persons = (List<Person>) objectInputStream.readObject();

        System.out.println(persons);




    }


         }

