package chapter_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу, которая удаляет заданный символ из заданной строки.
 */

public class task13 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите предложение или слово.");
            String sentence = reader.readLine();
            System.out.println("Введите символ или букву, которую необходимо удалить из данного преложения.слова");
            String symbol = reader.readLine();
            System.out.println("Вот что получилось: \n" + deleteSymbol(sentence, symbol));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String deleteSymbol(String sentence, String symbol) {
        return sentence.replace(symbol, "");
    }
}
