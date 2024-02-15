package ru.bigsite.developer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Hello Exception!)
 */
public class FileNotFoundExceptionExample
{
    public static void main( String[] args )
    {
        try {
            File file = new File("nonexistent.txt");
            FileReader fr = new FileReader(file); // попытка открытия несуществующего файла
        } catch (FileNotFoundException e) {
            System.out.println("\nФайл не найден: " + e.getMessage());
        }
    }
}
