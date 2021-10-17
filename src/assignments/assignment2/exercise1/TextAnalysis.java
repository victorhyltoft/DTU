package assignments.assignment2.exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextAnalysis {
    private String sourceFileName;
    private int maxNoOfWords;
    private int noOfWords;
    private int noOfDifferentWords;
    private int noOfRepetitions;

    public static void main(String[] a){
        String relative_path = "src/assignments/assignment2/";
        String textile = "text17_00.txt";

        TextAnalysis ta = new TextAnalysis(relative_path + textile, 50);
        System.out.println("word count = " + ta.wordCount());
        System.out.println("different words = " + ta.getNoOfDifferentWords());
        System.out.println("repetitions = " + ta.getNoOfRepetitions());
    }

    // Constructor
    public TextAnalysis(String sourceFileName, int maxNoOfWords) {

        this.sourceFileName = sourceFileName;
        this.maxNoOfWords = maxNoOfWords;

        getWords();

    }

    private void getWords() {
        StringBuilder data = new StringBuilder();
        try {
            File myObj = new File(sourceFileName);
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                data.append(sc.next().toLowerCase()).append(" ");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] words = data.toString().split("[^a-zA-Z]+");

        // Get number of words
        noOfWords = words.length;

        // Get number of unique words
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
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
