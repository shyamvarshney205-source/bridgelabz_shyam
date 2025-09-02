public class q2 {
    public static void main(String[] args) {
        String input = "programming";

        System.out.println("Input string: " + input);
        System.out.print("Unique characters: ");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if this character appears only once in the string
            if (isUnique(input, ch)) {
                System.out.print(ch + " ");
            }
        }
    }

    // Helper method to check if character ch is unique in the string
    public static boolean isUnique(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                if (count > 1) {
                    return false;  // More than one occurrence found
                }
            }
        }

        return count == 1;  // True if exactly one occurrence
    }
}
