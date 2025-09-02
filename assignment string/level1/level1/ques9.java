public class ques9 {
    public static void main(String[] args) {
        String originalText = "Hello World";

        // Convert to uppercase
        String upperText = originalText.toUpperCase();

        // Display both strings
        System.out.println("Original Text: " + originalText);
        System.out.println("Uppercase Text: " + upperText);

        // Compare using equals (case-sensitive)
        if (originalText.equals(upperText)) {
            System.out.println("Both strings are exactly equal.");
        } else {
            System.out.println("Strings are not equal (case-sensitive comparison).");
        }

        // Compare using equalsIgnoreCase (case-insensitive)
        if (originalText.equalsIgnoreCase(upperText)) {
            System.out.println("Both strings are equal (case-insensitive comparison).");
        } else {
            System.out.println("Strings are not equal even in case-insensitive comparison.");
        }
    }
}

