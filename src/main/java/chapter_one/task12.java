package chapter_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Написать программу удяляющую повторяющиеся символы из строки.
 */

public class task12 {

    public static void main(String[] args) {
        try {
            System.out.println("Пожалуйста, введите предложение и мы удалим из него все повторяющиеся символы");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sentence = reader.readLine();
            System.out.println(removeRepeatingSymbols(sentence.toLowerCase()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String removeRepeatingSymbols(String sentence) {
        char[] chars = sentence.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char aChar : chars) {
            set.add(aChar);
        }
        return String.valueOf(set.toString());
    }
}