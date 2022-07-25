package chapter_one;

import java.util.function.BinaryOperator;

/**
 * Написать программу, которая которая складывает два крупных числа типа int/long и выдает переполнение операции
 */

public class Task26 {
    static int a = Integer.MAX_VALUE;
    static int b = Integer.MAX_VALUE;

    public static void main(String[] args) {
        BinaryOperator<Integer> operator = Math::addExact;
        int z = operator.apply(a, b);
    }
}
