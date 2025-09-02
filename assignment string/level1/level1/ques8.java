public class ques8 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Trying to access index 5 (which doesn't exist)
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
