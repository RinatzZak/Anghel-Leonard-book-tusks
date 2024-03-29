package chapter_one;

import java.util.HashSet;
import java.util.Set;

/**
 * Написать программу, которая генерирует все возможное перестановки букв в слове
 */

public class Task10 {
    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(insertChar(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String insertChar(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }
    public static void main(String[] args){
        String s1 = "Cat";
        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
    }
    }

