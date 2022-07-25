package chapter_one;

/**
 * написать программу, которая объявляет многострочные литералы или текстовые блоки
 */

public class Task19 {
   static final String LIT = System.lineSeparator();

    public static void main(String[] args) {
        String text = String.join(LIT, "hello", "my", "new", "beautiful", "world");
        System.out.println(text);
    }
}
