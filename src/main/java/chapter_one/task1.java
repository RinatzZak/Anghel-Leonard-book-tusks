package chapter_one;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке.
 */
public class task1 {
    public static String string = "Hello world!!";

    public static void main(String[] args) {
        System.out.println(repeatSymbols(string));
    }

    public static Integer repeatSymbols(String s) {
       char[] myChars = s.toCharArray();
       List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < myChars.length - 1; i++) {
            for (int j = i+1; j < myChars.length; j++) {
                if (myChars[i] == myChars[j]) {
                    characterList.add(myChars[i]);
                    i++;
                }
            }
        }
        return characterList.size();
    }
}
