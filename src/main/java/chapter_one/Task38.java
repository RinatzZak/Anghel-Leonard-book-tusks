package chapter_one;

/**
 * Написать программу, которая вычисляет сомещенное умножение-сложение
 */

public class Task38 {
    static int x = 4;
    static int y = 5;
    static int z = 9;

    public static void main(String[] args) {
        System.out.println(x * y + z);
        System.out.println(Math.fma(x, y, z));
    }
}
