package chapter_one;

/**
 * Написать программу, которая вычисляет частное и остаток заданного беззнакового значения
 */

public class task30 {
    public static void main(String[] args) {

        int divisionUnsignedFromMax = Integer.divideUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE);

        int divisionUnsignedFromMin = Integer.divideUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);

        int remainderUnsignedFromMax = Integer.remainderUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE);

        int remainderUnsignedFromMin = Integer.remainderUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println(divisionUnsignedFromMax +"\n" + divisionUnsignedFromMin + "\n" + remainderUnsignedFromMax + "\n" + remainderUnsignedFromMin);
    }
}
