package chapter_one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке.
 */
public class task1 {
    public static String string = "Hello world!!";

    public static void main(String[] args) {
        System.out.println(repeatingSymbolsWithMap(string));
    }

    public static Map<Character, Integer> repeatingSymbolsWithMap(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
