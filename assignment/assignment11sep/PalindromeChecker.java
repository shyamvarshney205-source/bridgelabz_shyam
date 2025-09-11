// PalindromeChecker.java
public class PalindromeChecker {
    // Attribute
    String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Convert to lowercase and remove non-alphanumeric characters (optional)
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("Original Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result       : The text is a palindrome.");
        } else {
            System.out.println("Result       : The text is NOT a palindrome.");
        }
        System.out.println("-------------------------------------------");
    }

    // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        // Examples
        PalindromeChecker pc1 = new PalindromeChecker("Racecar");
        PalindromeChecker pc2 = new PalindromeChecker("Hello");
        PalindromeChecker pc3 = new PalindromeChecker("A man, a plan, a canal, Panama");

        pc1.displayResult();
        pc2.displayResult();
        pc3.displayResult();
    }
}

