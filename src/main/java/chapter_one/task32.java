package chapter_one;

/**
 * Написать программу, которая в которой применяются И/ИЛИ к двум булевым выражениям
 */

public class task32 {
    static int a = 30;
    static int b = 40;

    public static void main(String[] args) {
        if (a < b && b <= 40) {
            System.out.println("It's good!");
        } else {
            System.out.println("No, it's wrong");
        }
    }
}
