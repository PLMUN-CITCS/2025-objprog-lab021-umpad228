import java.util.Scanner;

public class WordCounter {
    
    // Method to count words in a sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Count words
        int wordCount = countWords(sentence);
        
        // Display result
        System.out.println("The sentence has " + wordCount + " words.");
    }
}