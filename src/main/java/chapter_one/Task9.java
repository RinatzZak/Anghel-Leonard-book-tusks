package chapter_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу, которая соединяет заданные строки с помощью заданного разделителя
 */

public class Task9 {

    public static void main(String[] args) {
        try {
            System.out.println("Введите знак с помощью которого, необходимо объединить строки!");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String symbol = reader.readLine();
            reader.close();
            String result = String.join(symbol, "я", "построил", "предложение", "используя", "вот", "этот", "знак");
            System.out.println("Вот что вышло =) \n" + result);
        } catch (IOException e) {
            throw new RuntimeException("Что-то не так...Ошибка");
        }
    }
}
