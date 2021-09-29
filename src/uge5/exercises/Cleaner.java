package uge5.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Cleaner {
    public static void main(String[] args) {
        String filepath = "src/uge5/exercises/limerick.txt";
        cleanText(filepath);
    }

    public static void cleanText(String filename) {
        try {
            Scanner file = new Scanner(new File(filename));
            while (file.hasNextLine()) {
                String word = file.next();
                for (int i = 0; i < word.length(); i++) {
                    if (Character.isLetter(word.charAt(i))) {
                        word.replace(word.charAt(i), '\0');

                    }
                }
                System.out.println(word);




                System.out.println(word);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
