public class ques5 {
    public static void main(String[] args) {
        // Define a simple string
        String text = "Java";

        try {
            // Attempt to access an invalid index (greater than the length)
            char ch = text.charAt(10); // Invalid index
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            // Catch and handle the exception
            System.out.println("Caught a StringIndexOutOfBoundsException!");
            System.out.println("Error message: " + e.getMessage());
        }

        // Continue program execution
        System.out.println("Program continues after handling the exception.");
    }
}

