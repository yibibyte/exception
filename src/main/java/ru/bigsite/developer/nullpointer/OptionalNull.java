package ru.bigsite.developer.nullpointer;

import java.util.Optional;

public class OptionalNull {
    public static void main(String[] args) {

        String str = null;
        Optional<String> optionalStr = Optional.ofNullable(str);

        if (optionalStr.isPresent()) {
            System.out.println("Строка не равна null");
        } else {
            System.out.println("Строка равна null");
        }
    }
}