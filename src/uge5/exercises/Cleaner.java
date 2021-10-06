package uge5.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cleaner {
    public static void main(String[] args) {
        String filepath = "src/uge5/exercises/limerick.txt";
        cleanText(filepath);
    }

    public static void cleanText(String filename) {
        Scanner file = null;
        try {
            file = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (file.hasNextLine()) {
            String word = file.next();
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i))) {
                    word = word.replace(Character.toString(word.charAt(i)), "");
                }
                if (word.length() == 4) {
                    word = "";
                }
            }
            System.out.println(word);

        }



    }
}
