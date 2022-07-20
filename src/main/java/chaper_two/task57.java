package chaper_two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать фрагмент кода с примером выражения switch JDK 12,
 * в котором метки вариантов case указывают на блок в фигурных скобках.
 */

public class task57 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите число от 1 до 10");
            String str = reader.readLine();
            reader.close();
            if (str != null) {
                switch (str) {
                    case "1", "2", "3", "4", "5", "6", "8", "9", "10" -> {
                        int x = Integer.parseInt(str);
                        System.out.println("квадрат из числа " + str + " = " + Math.sqrt(x));
                    }
                    case "7" -> System.out.println("Счастливое число");
                    default -> System.out.println("Диапазон чисел от 1 до 10 включительно!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
