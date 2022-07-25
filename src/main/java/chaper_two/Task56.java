package chaper_two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать фрагмент кода для примера выражения switch JDK 12 с многочисленными метками вариантов case.
 */

public class Task56 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Угадайте число от 1 до 10 включительно! \nВведите число");
            String str = reader.readLine();
            reader.close();
            if (str != null) {
                switch (str) {
                    case "1", "2", "3", "4", "5", "6", "8", "9", "10" -> System.out.println("Нет, не это число!");
                    case "7" -> System.out.println("Поздравляем! Вы угадали!");
                    default -> System.out.println("Диапазон чисел от 1 до 10 включительно!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
