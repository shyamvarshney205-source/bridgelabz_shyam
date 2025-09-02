public class ques6 {

    // Method that throws IllegalArgumentException if age is invalid
    public static void validateAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150. Provided: " + age);
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            // Valid call
            validateAge(25);

            // Invalid call – this will throw IllegalArgumentException
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Caught an IllegalArgumentException!");
            System.out.println("Error message: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

