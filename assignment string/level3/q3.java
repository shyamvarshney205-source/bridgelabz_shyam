public class q3{
    public static void main(String[] args) {
        String input = "swiss";

        char result = firstNonRepeatingChar(input);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }

    public static char firstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isRepeating = false;

            // Check if ch repeats in the string
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(j) == ch) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                return ch;
            }
        }

        // Return null character if no unique char found
        return '\0';
    }
}

