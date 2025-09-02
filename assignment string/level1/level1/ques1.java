public class ques1 {
    public static void main(String[] args) {
        // Example input strings
        String str1 = "OpenAI";
        String str2 = "OpenAI";

        // Compare using charAt()
        boolean areEqual = true;

        // First check: lengths must match
        if (str1.length() != str2.length()) {
            areEqual = false;
        } else {
            // Compare character by character
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        // Output results
        System.out.println("Comparison using charAt(): " + (areEqual ? "Strings are equal" : "Strings are NOT equal"));

        // Now compare using equals()
        boolean equalsMethodResult = str1.equals(str2);
        System.out.println("Comparison using equals(): " + (equalsMethodResult ? "Strings are equal" : "Strings are NOT equal"));

        // Optional: check if both results match
        if (areEqual == equalsMethodResult) {
            System.out.println("✅ Both comparison methods give the same result.");
        } else {
            System.out.println("❌ Mismatch between charAt() comparison and equals() method.");
        }
    }
}
