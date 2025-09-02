public class ques10 {
    public static void main(String[] args) {
        String originalText = "Hello WORLD";

        // Convert to lowercase
        String lowerText = originalText.toLowerCase();

        // Display both strings
        System.out.println("Original Text: " + originalText);
        System.out.println("Lowercase Text: " + lowerText);

        // Compare using equals (case-sensitive)
        if (originalText.equals(lowerText)) {
            System.out.println("Both strings are exactly equal.");
        } else {
            System.out.println("Strings are not equal (case-sensitive comparison).");
        }

        // Compare using equalsIgnoreCase (case-insensitive)
        if (originalText.equalsIgnoreCase(lowerText)) {
            System.out.println("Both strings are equal (case-insensitive comparison).");
        } else {
            System.out.println("Strings are not equal even in case-insensitive comparison.");
        }
    }
}

