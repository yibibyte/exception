package ru.bigsite.developer.nullpointer;

/**
 * Вызов метода у null-объекта
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;

            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("\n Ошибка: " + e.getMessage());
        }
    }
}
