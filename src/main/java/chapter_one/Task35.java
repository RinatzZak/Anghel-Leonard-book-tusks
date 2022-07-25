package chapter_one;

/**
 * Написать программу, которая вычисляет целую часть деления и целую часть остатка от деления делимого на делитель
 */

public class Task35 {
    static double x = 20.0;
    static double y = 6.5;

    static int a = 20;
    static int b = -3;

    public static void main(String[] args) {
        System.out.println(x/y);
        System.out.println(Math.floorMod(a, b));
        System.out.println(Math.rint(x/y));
    }
}
