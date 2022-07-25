package chapter_one;

/**
 * Написать программу, которая проверяет, содержит ли заданная строка заданную подстроку
 */

public class Task16 {
    static String sentence = "Hello my new beautiful world!";

    static String someStr = "ew";

    public static void main(String[] args) {
        System.out.println(isHere(sentence, someStr));
    }

    public static boolean isHere(String sentence, String someStr) {
        return sentence.contains(someStr);
    }
}
