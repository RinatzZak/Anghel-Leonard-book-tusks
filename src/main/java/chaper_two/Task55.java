package chaper_two;

/**
 * краткий обзор инструкции и выражений switch В JDK 12
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task55 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            reader.close();
            switch (str) {
                case "astra" -> System.out.println("Yep, it's astra!");
                case "weather" -> System.out.println("Yep, it's weather!");
                default -> System.out.println("No, you lose this game!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
