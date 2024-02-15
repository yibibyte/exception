package ru.bigsite.developer.nullpointer;

import java.util.Objects;

public class TernaryOperatorNull {

    // (true)? "One case " : "Other case"

    public static void main(String[] args) {

    String greeting = null;
    //String greeting = " Hi";

    String message = (greeting != null) ? greeting : "Привет";
        System.out.println(message);

    }
}
