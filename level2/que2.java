import java.util.Scanner;

public class que2 {

    // Recursive method to calculate sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;  // Base case
        } else {
            return n + recursiveSum(n - 1);  // Recursive step
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Calculate sum recursively
        int sumRecursive = recursiveSum(n);

        // Calculate sum using formula
        int sumFormula = n * (n + 1) / 2;

        // Display results
        System.out.println("Sum of first " + n + " natural numbers (recursive): " + sumRecursive);
        System.out.println("Sum of first " + n + " natural numbers (formula): " + sumFormula);

        // Check if both are equal
        if (sumRecursive == sumFormula) {
            System.out.println("Both computations give the same result. The formula is correct!");
        } else {
            System.out.println("There is a discrepancy between the two methods.");
        }

        scanner.close();
    }
}
