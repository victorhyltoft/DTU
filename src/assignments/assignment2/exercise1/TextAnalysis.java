package assignments.assignment2.exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextAnalysis {
    private final String sourceFileName;
    private int noOfWords;
    private int noOfDifferentWords;
    private int noOfRepetitions;

    public static void main(String[] a){
        String relative_path = "src/assignments/assignment2/exercise1/";
        String textile = "TextAnalysis_test_hidden_02.txt";

        TextAnalysis ta = new TextAnalysis(relative_path + textile, 50);
        System.out.println("word count = " + ta.wordCount());
        System.out.println("different words = " + ta.getNoOfDifferentWords());
        System.out.println("repetitions = " + ta.getNoOfRepetitions());
    }

    // Constructor
    public TextAnalysis(String sourceFileName, int maxNoOfWords) {
        this.sourceFileName = sourceFileName;
        getWords();

    }

    private void getWords() {
        String wordString = "";
        try {
            Scanner sc = new Scanner(new File(sourceFileName));

            while (sc.hasNextLine()) {
                // We would probably rather use a StringBuilder
                wordString += sc.nextLine() + " ";
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (wordString.equals("")) {
            return;
        }

        String[] words = wordString.toLowerCase(Locale.ROOT).split("[^a-zA-Z]+");

        // number of words in total
        noOfWords = words.length;

        // Different words
        Set<String> uniqueWords = new HashSet<>(List.of(words));
        noOfDifferentWords = uniqueWords.size();

        // Get number of repetitions
        String previous_word = "";
        for (String word : words) {
            if (Objects.equals(word, previous_word)) {
                noOfRepetitions++;
            }
            previous_word = word;
        }

    }


    public int wordCount() {
        return noOfWords;
    }

    public int getNoOfDifferentWords() {
        return noOfDifferentWords;
    }

    public int getNoOfRepetitions() {
        return noOfRepetitions;
    }


}
