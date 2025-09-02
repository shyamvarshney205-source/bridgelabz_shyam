import java.util.ArrayList;

public class que2 {
    public static void main(String[] args) {
        String text = "This is a sample text";

        // Manual split by spaces
        ArrayList<String> manualSplit = manualSplit(text);

        // Using split() method
        String[] splitArray = text.split(" ");

        // Display manual split result
        System.out.println("Manual Split Result:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        // Display split() method result
        System.out.println("\nsplit() Method Result:");
        for (String word : splitArray) {
            System.out.println(word);
        }

        // Compare both results
        boolean areEqual = manualSplit.size() == splitArray.length;
        if (areEqual) {
            for (int i = 0; i < manualSplit.size(); i++) {
                if (!manualSplit.get(i).equals(splitArray[i])) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("\nAre both results equal? " + areEqual);
    }

    // Manual method to split by spaces
    public static ArrayList<String> manualSplit(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);  // reset StringBuilder
                }
            }
        }
        // Add the last word if exists
        if (word.length() > 0) {
            words.add(word.toString());
        }

        return words;
    }
}

