package ru.bigsite.developer;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 5 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль: " + e.getMessage());
        }
    }
}
