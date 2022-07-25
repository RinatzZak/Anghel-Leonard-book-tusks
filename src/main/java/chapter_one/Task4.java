package chapter_one;

import static java.lang.Integer.parseInt;

/**
 * Написать программу, которая проверяет, что заданная строка содержит только цифры.
 */

public class Task4 {
    static String firstString = "89900ad99865a";
    static String secondString = "1233129077868";

    public static void main(String[] args) {
        System.out.println(numbersOrNot(firstString));
        System.out.println(numbersOrNot(secondString));
    }

    public static boolean numbersOrNot(String s) {
        try {
            long result = Long.parseLong(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
