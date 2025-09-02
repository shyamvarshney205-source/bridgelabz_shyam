public class qu5 {
    public static void main(String[] args) {
        String input = "hello world";

        System.out.println("Input String: " + input);
        System.out.println("Character frequencies:");

        // Iterate through each unique character and count frequency
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is unique in the iteration (first occurrence)
            if (input.indexOf(ch) == i) {
                int freq = countFrequency(input, ch);
                System.out.println(ch + " : " + freq);
            }
        }
    }

    // Helper method to count frequency of character ch in string str
    public static int countFrequency(String str, char ch) {
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ch) {
                count++;
            }
        }
        return count;
    }
}

