package chapter_one;

/**
 * Написать программу, которая сравнивает два заданных числа как беззнаковые
 */

public class Task29 {
    static int a = Integer.MAX_VALUE;
    static int b = Integer.MIN_VALUE;
    static int c = Integer.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println(Integer.compareUnsigned(a, b));
        System.out.println(Integer.compareUnsigned(a, c));
    }
}
