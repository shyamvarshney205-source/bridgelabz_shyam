public class ques7 {
    public static void main(String[] args) {
        String numberString = "abc123"; // Invalid numeric string

        try {
            // Attempt to convert string to integer
            int number = Integer.parseInt(numberString);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}

