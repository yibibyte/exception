package ru.bigsite.developer.nullpointer;

/**
 *  Оператор сравнения == на null
 */
public class NullPointerExample {
    public static void main(String[] args) {

        String str = null;

        if (str == null) {
            System.out.println("Строка равна null");
        } else {
            System.out.println("Строка не равна null");
        }


    }
}