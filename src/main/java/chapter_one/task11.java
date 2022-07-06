package chapter_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу, которая выясняет, является ли слово палиндромом или нет.
 * Для проверки: мадам, казак, дед, шалаш, ротатор, наворован, комок, потоп, заказ, тут, летел, кабак, ищи,
 */

public class task11 {

    public static void main(String[] args) {
        try {
            System.out.println("Пожалуйста, введите слово и мы проверим, является она палиндромом или нет.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sentence = reader.readLine();
            System.out.println(isPalindrome(sentence.toLowerCase()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        return s.equals(sb.toString());
    }

}
