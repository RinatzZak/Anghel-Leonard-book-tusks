package chapter_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Написать программу, которая инвентирует буквы каждого слова, и программу, которая инвертирует буквы каждого слова
 * и сами слова
 */

public class task3 {
    static String sentence = "Hello new world!";

    public static void main(String[] args) {
        System.out.println(replaceCharsAndWords(sentence));
        System.out.println("---------------------");
        System.out.println(replaceSymbolsInWords(sentence));

    }

    public static String replaceCharsAndWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String replaceSymbolsInWords(String s) {
        String[] words = new StringBuilder(s).reverse().toString().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString();
    }
}
