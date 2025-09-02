public class que5 {
    public static void main(String[] args) {
        String text = "Hello World! This is Java.";

        int vowelCount = 0;
        int consonantCount = 0;

        // Convert text to lowercase to simplify comparisons
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // Consider only alphabetic characters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);
    }
}
