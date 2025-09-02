public class que3 {
    public static void main(String[] args) {
        String text = "Java programming is fun";

        String[][] result = splitWordsWithLengths(text);

        // Display the 2D array content
        System.out.println("Word\tLength");
        for (String[] pair : result) {
            System.out.println(pair[0] + "\t" + pair[1]);
        }
    }

    public static String[][] splitWordsWithLengths(String text) {
        // Split text into words
        String[] words = text.split("\\s+");  // split by whitespace(s)

        // Create 2D array [words.length][2]
        String[][] wordLengthArray = new String[words.length][2];

        // Fill the array with word and its length (as string)
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(words[i].length());
        }

        return wordLengthArray;
    }
}

