package ru.bigsite.developer.nullpointer;

public class MethodNull {
    public static void main(String[] args) {

        //String outString = "";

        String outString = null;

        printLength(outString);
    }

    public static void printLength(String str) {
        if (str != null) {
            System.out.println("\nДлина строки: " + str.length());
        } else {
            System.out.println("\nСтрока равна null");
        }
    }
}
