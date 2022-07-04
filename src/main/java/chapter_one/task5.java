package chapter_one;

import java.util.HashMap;
import java.util.Map;

/**
 * Написать программу, которая подсчитывает количество гласных и согласных букв
 * в заданной строке. Сделать это для английского языка, который имеет 5 гласных(a, e, i, o, u)
 */

public class task5 {
    static String sentence = "Hello my new world!";

    public static void main(String[] args) {
        System.out.println(countingVowelsAndConsonants(sentence));
    }

    public static Map<String, Integer> countingVowelsAndConsonants(String s) {
        int countOfVowels = 0;
        int countOfConsonants = 0;
        Map<String, Integer> result = new HashMap<>();
        String[] chars = s.split(" ");
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String ch : chars) {
            for (int i = 0; i < vowels.length; i++) {
                if (ch.contains(vowels[i])) {
                    countOfVowels++;
                    i++;
                } else {
                    countOfConsonants++;
                }
            }
        }
        result.put("Количество гласных", countOfVowels);
        result.put("Количество согласных", countOfConsonants);
        return result;
    }
}
