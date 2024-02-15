package ru.bigsite.developer;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("Пример пользовательского исключения\n");
        } catch (CustomException e) {
            System.out.println("Поймано пользовательское исключение: \n" + e.getMessage());
            System.out.println(e.getTime());
        }
    }
}