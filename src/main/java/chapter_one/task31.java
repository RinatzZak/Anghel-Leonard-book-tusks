package chapter_one;

/**
 * Написать программу, которая определяет является ли значение тиап double/float конечным
 */

public class task31 {
    static double d = 3.4d;
    static float f = 40.000f;

    public static void main(String[] args) {
        System.out.println(Float.isFinite(f));
        System.out.println(Double.isFinite(d));
        System.out.println(Float.isFinite(f/0f));
        System.out.println(Double.isFinite(d/0));
    }
}
