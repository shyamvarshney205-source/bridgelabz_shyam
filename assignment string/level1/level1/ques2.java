 public class ques{
    public static void main(String[] args) {
        // Original string
        String original = "ArtificialIntelligence";

        // Define start and end index for the substring
        int start = 0;
        int end = 10;  // exclusive

        // Manually create substring using charAt()
        String manualSubstring = "";
        for (int i = start; i < end && i < original.length(); i++) {
            manualSubstring += original.charAt(i);
        }

        // Create substring using built-in substring() method
        String builtinSubstring = original.substring(start, end);

        // Display both substrings
        System.out.println("Manual substring (charAt): " + manualSubstring);
        System.out.println("Built-in substring:        " + builtinSubstring);

        // Compare the two substrings
        if (manualSubstring.equals(builtinSubstring)) {
            System.out.println("✅ Both substrings are equal.");
        } else {
            System.out.println(" Substrings are NOT equal.");
        }
    }
}
