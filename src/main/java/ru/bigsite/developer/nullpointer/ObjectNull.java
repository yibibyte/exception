package ru.bigsite.developer.nullpointer;

import java.util.Objects;

public class ObjectNull {
    public static void main(String[] args) {
        String str = null;

        if (Objects.isNull(str)) {
            System.out.println("Строка равна null");
        } else {
            System.out.println("Строка не равна null");
        }
    }
}
