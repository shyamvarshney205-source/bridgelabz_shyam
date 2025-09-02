public class q4 {
    public static void main(String[] args) {
        String input = "hello world";

        // Convert to lowercase to treat uppercase and lowercase the same (optional)
        input = input.toLowerCase();

        // We'll use an array to store frequency of ASCII characters (assuming standard ASCII)
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character Frequencies:");

        // Display characters and their frequencies (only those that appear)
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char) i + "' : " + freq[i]);
            }
        }
    }
}

