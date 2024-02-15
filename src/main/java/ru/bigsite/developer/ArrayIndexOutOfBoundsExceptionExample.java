package ru.bigsite.developer;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int value = array[5]; // обращение к индексу, выходящему за пределы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индекса массива: " + e.getMessage());
        }
    }
}
