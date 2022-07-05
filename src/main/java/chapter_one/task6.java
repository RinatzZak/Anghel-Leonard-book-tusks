package chapter_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать проргамму, которая подсчитывает появление того или иного символа в заданной строке
 */

public class task6 {

    public static String sentence = "What's about your homework?";

    public static void main(String[] args) {

        try {
            System.out.println("Введите один символ!");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String symbol = reader.readLine();
            if (symbol.length() == 1) {
                System.out.println("Символ " + symbol + " встречается в предложении " + countSymbol(sentence, symbol) + " раз.");
            } else {
                System.out.println("Пожалуйста, введите только один символ!");
            }
        } catch (IOException e) {
            throw new RuntimeException("Вы ввели что-то не то, попробуйте ещё раз!");
        }
    }

    public static int countSymbol(String sentence, String symbol) {
        int count = 0;
        char[] symbolChar = symbol.toCharArray();
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (char c : symbolChar) {
                if (chars[i] == c) {
                    count++;
                    i++;
                }
            }
        }
        return count;
    }
}
