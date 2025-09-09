import java.util.ArrayList;
import java.util.Scanner;

public class que1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // ArrayList to store factors
        ArrayList<Integer> factors = new ArrayList<>();

        // Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        // Display factors
        System.out.println("Factors of " + number + ": " + factors);

        // Calculate sum, sum of squares and product of factors
        int sum = 0;
        int sumOfSquares = 0;
        long product = 1;  // Use long for bigger product values

        for (int factor : factors) {
            sum += factor;
            sumOfSquares += factor * factor;
            product *= factor;
        }

        // Display results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        System.out.println("Product of factors: " + product);

        scanner.close();
    }
}
