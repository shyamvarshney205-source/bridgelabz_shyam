import java.util.Arrays;
import java.util.Scanner;

public class que8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        if (areAnagrams(text1, text2)) {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are not anagrams.");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String s1, String s2) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanS1 = s1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String cleanS2 = s2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // If lengths differ after cleaning, they cannot be anagrams
        if (cleanS1.length() != cleanS2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] arr1 = cleanS1.toCharArray();
        char[] arr2 = cleanS2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if sorted arrays are equal
        return Arrays.equals(arr1, arr2);
    }
}
