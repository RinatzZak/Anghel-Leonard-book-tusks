package chapter_one;

/**
 * Написать программу, которая вычисляет умножение двух крупных значений типа int/long и переполняет операцию
 */

public class task37 {
    static int x = Integer.MAX_VALUE;
    static int y = Integer.MAX_VALUE;
    static long a = Long.MAX_VALUE;
    static long b = Long.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println(x*y);
        try {
            System.out.println(Math.addExact(x, y));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        System.out.println(Math.multiplyFull(x, y));

        System.out.println(a*b);
        try {
            System.out.println(Math.addExact(a, b));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        System.out.println(Math.multiplyHigh(a, b));

    }
}
