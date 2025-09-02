public class ques3 {

    public static void main(String[] args) {
        // Original string
        String text = "shyam";

        // Get characters using user-defined method
        char[] manualChars = getCharactersUsingCharAt(text);

        // Get characters using built-in method
        char[] builtInChars = text.toCharArray();

        // Display both character arrays
        System.out.print("Manual characters:   ");
        printCharArray(manualChars);

        System.out.print("Built-in characters: ");
        printCharArray(builtInChars);

        // Compare both arrays
        boolean areEqual = compareCharArrays(manualChars, builtInChars);

        // Display result
        if (areEqual) {
            System.out.println("✅ Both character arrays are equal.");
        } else {
            System.out.println("❌ Character arrays are NOT equal.");
        }
    }

    // User-defined method to return characters using charAt()
    public static char[] getCharactersUsingCharAt(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    // Method to print character array
    public static void printCharArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
