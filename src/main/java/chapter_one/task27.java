package chapter_one;

/**
 * Написать программу, которая конвертирует заданное число типа int, в число типа long с помощью безнаковой конверсии
 */

public class task27 {
    static String str = "12345";

    public static void main(String[] args) {
        int z = Integer.parseUnsignedInt(str);
        System.out.println(z);
    }
}
