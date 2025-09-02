public class que4 {

    public static void main(String[] args) {
        String text = "Java programming language is both powerful and versatile";

        // Split the text into words using space as delimiter
        String[] words = text.split("\\s+");

        if (words.length == 0) {
            System.out.println("No words found in the input text.");
            return;
        }

        // Initialize shortest and longest with the first word
        String shortest = words[0];
        String longest = words[0];

        // Loop through all words
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Display results
        System.out.println("Original Text: " + text);
        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
