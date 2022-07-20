package chapter_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу, которая конвертирует заданный объект типа String(представляющий число)
 * в значения типа int, long, float, double
 */

public class task7 {

    public static void main(String[] args) {
        try {
            System.out.println("Введите числовое значение!");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String symbol = reader.readLine();
            System.out.println("В какой формат вы хотите преобразовать число? Напишите - int, long, float, double");
            String format = reader.readLine().toLowerCase();
            reader.close();
            if (symbol.contains(".")){
                switch (format) {
                    case "float" -> System.out.println(Float.parseFloat(symbol));
                    case "double" -> System.out.println(Double.parseDouble(symbol));
                    default -> System.out.println("Это значение не подходит для int или long");
                }
            } else {
                switch (format) {
                    case "int" -> System.out.println(Integer.parseInt(symbol));
                    case "long" -> System.out.println(Long.parseLong(symbol));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Вы ввели что-то не то, попробуйте ещё раз!");
        }
    }
}
