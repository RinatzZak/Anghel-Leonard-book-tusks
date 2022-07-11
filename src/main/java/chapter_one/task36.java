package chapter_one;

/**
 * Написать программу, которая вычисляет следующее значение с плавающей точкой
 */

public class task36 {
    static double x = 30.31;

    public static void main(String[] args) {
        System.out.println(Math.nextDown(x));
        System.out.println(Math.nextUp(x));
    }
}
