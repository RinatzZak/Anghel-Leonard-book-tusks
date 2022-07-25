package chapter_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Написать программу, которая отыскивает символ с наибольшим числом появлений в заданной строке
 */

public class Task14 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите предложение или слово.");
            String sentence = reader.readLine();
            reader.close();
            System.out.println("Вот что получилось: \n" + longestCharacterRepetition(sentence));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String longestCharacterRepetition(String sentence) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            Character c = sentence.charAt(i);
            int k = 1;
            if (map.containsKey(c)) {
                k = map.get(c) + 1;
            }
            map.put(c, k);
        }
        Map.Entry<Character, Integer> max = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max == null) {
                max = entry;
            } else if (entry.getValue() > max.getValue()) {
                max = entry;
            }
        }
        return String.valueOf(max);
    }
}
