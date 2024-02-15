package ru.bigsite.developer.nullpointer;

import java.util.Scanner;

public class CheckNullScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");

        String name = scanner.nextLine();

        if (name == null || name.isEmpty()) {

            System.out.println("Имя не введено.");

        } else {

            System.out.println("Привет, " + name + "!");

        }
    }
}
