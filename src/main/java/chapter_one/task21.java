package chapter_one;

/**
 * Написать программу, которая удаляет начальные и замыкающие пробелы заданной строки
 */

public class task21 {
    static String sentence = "  Give me a job!  ";

    public static void main(String[] args) {
        System.out.println(sentence);
        System.out.println(sentence.trim());
    }
}
