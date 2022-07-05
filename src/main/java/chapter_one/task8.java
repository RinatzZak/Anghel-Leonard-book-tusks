package chapter_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу, которая удаляет все пробелы из строки
 * Для проверки - Don't remove my spaces   what are you doing with my spaces aaaaa
 */

public class task8 {

    public static void main(String[] args) {
        try {
            System.out.println("Введите предложение и мы удалим из него все пробелы! =)");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sentence = reader.readLine();
            System.out.println("Принято!");
            Thread.sleep(3000);
            System.out.println("Вот вот получится...");
            Thread.sleep(3000);
            System.out.println("Вот что вышло =) " + sentence.replace(" ", "").trim());
            System.out.println("Спасибо! До встречи!");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Что-то пошло не так... Попробуйте ещё раз!");
        }
    }
}
