package chapter_one;

import java.util.Arrays;

/**
 * Написать программу, которая применяет отступ к заданному тексту
 */

public class task23 {
    static String[] arr = {"Hello", "world", "you", "are", "so", "wonderful"};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].indent(i));
        }
        System.out.println("------------------------------------");
        Arrays.stream(arr).forEach(a -> System.out.println(a.indent(a.length())));
    }
}
