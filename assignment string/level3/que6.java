public class que6 {
    public static void main(String[] args) {
        String input = "hello world";

        // To keep track of characters we have already counted
        String checked = "";

        System.out.println("Character frequencies:");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Skip if we have already counted this character
            if (checked.indexOf(ch) != -1) {
                continue;
            }

            int count = 0;

            // Inner loop to count occurrences of ch
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " : " + count);

            // Add this character to checked so we don't count it again
            checked += ch;
        }
    }
}
