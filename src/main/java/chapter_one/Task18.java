package chapter_one;

/**
 * написать программу, которая проверяет являются ли две строки анаграммами
 * Анаграмма - строка образованная перестановкой букв в обратном порядке с игнором заглавных букв и пробелов
 */

public class Task18 {

    static String sentence = "Hello";

    static String secondSentence = "olleH";

    public static void main(String[] args) {
        System.out.println(isAnagram(sentence, secondSentence));
    }

    public static boolean isAnagram(String sentence, String secondSentence) {
        int[] count = new int[256];
        char[] charsOfSentence = sentence.replaceAll(" ", "").toLowerCase().toCharArray();
        char[] charsOfSecondSentence = secondSentence.replaceAll(" ", "").toLowerCase().toCharArray();

        if (charsOfSentence.length != charsOfSecondSentence.length) {
            return false;
        }

        for (int i = 0; i < charsOfSentence.length; i++) {
            count[charsOfSentence[i]]++;
            count[charsOfSecondSentence[i]]--;
        }

        for (int j : count) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
