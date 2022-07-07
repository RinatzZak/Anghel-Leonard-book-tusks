package chapter_one;

/**
 * Написать программу, которая отыскивает наибольший общий префикс заданных строк
 */

public class task22 {
    static String[] strings = {"adv", "advwr", "asd", "asddd", "asdadd", "dfg", "ad"};

    public static void main(String[] args) {
        System.out.println(longestPrefix(strings));
    }


    public static String longestPrefix(String[] strings) {
        if (strings.length == 1) {
            return strings[0];
        }

        int firstLen = strings[0].length();

        for (int i = 0; i < firstLen; i++) {
            char ch = strings[0].charAt(i);
            for (int j = 1; j < strings.length; j++) {
                if (i >= strings[j].length() || strings[j].charAt(i) != ch) {
                    return strings[j].substring(0, i);
                }
            }
        }
        return strings[0];
    }
}
