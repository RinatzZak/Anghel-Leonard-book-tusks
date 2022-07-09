package chapter_one;

/**
 * Написать программу, которая вычисляет минимум и максимум двух чисел
 */

public class task25 {
    static int a = 25;
    static int b = 30;

    public static void main(String[] args) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
