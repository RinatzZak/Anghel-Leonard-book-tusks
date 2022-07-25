package chapter_one;

/**
 * Написать программу, которая конвертирует заданное число типа int d число типа long с помощью беззнаковой конверсии
 */

public class Task28 {
    static int a = Integer.MAX_VALUE;

    public static void main(String[] args) {
        long z = Integer.toUnsignedLong(a);
        System.out.println(z);
    }
}
