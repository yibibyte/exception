package ru.bigsite.developer.nullpointer;

import java.util.Arrays;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Иван", 25),
                new Person("Мария", 30),
                new Person(null, 40)
    );

        for (Person person : people) {
            System.out.println("Имя: " + person.getName());
            System.out.println("Возраст: " + (person.getAge() != 0 ? person.getAge() : "неизвестен"));
            System.out.println();
        }
    }
}
