public class que6 {
    public static void main(String[] args) {
        String text = "Hello World! 123";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (isLetter(ch)) {
                if (isVowel(ch)) {
                    System.out.println(ch + " - Vowel");
                } else {
                    System.out.println(ch + " - Consonant");
                }
            } else {
                System.out.println(ch + " - Not a Letter");
            }
        }
    }

    // Check if character is a letter
    public static boolean isLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    // Check if character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
