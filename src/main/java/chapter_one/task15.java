package chapter_one;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Написать программу, которая сортирует заданный массив по длине строк
 */

public class task15 {
    static String[] arr = {"Hello", "World", "Java", "Dream", "F", "Computer"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrByLengthInAscendingOrder(arr)));
        System.out.println();
        System.out.println(Arrays.toString(sortArrByLengthInDescendingOrder(arr)));
    }

    /**
     * по возрастанию
     */
    public static String[] sortArrByLengthInAscendingOrder(String[] arr) {
        return Arrays.stream(arr)
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
    }

    /**
     * по убыванию
     */
    public static String[] sortArrByLengthInDescendingOrder(String[] arr) {
        return Arrays.stream(arr)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toArray(String[]::new);
    }
}
