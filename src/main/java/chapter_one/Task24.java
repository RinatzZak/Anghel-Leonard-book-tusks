package chapter_one;

/**
 * Написать программу, которая преобразовывает строки в другую строку
 */

public class Task24 {

    public static void main(String[] args) {
        String str = "String".transform(String::toUpperCase)
                .transform(s -> s.repeat(5))
                .transform(s -> s.indent(s.length()));
        System.out.println(str);
    }
}
