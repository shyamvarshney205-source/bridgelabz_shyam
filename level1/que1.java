import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        // Create Scanner object fo input
        Scanner scanner = new Scanner(System.in);

        // Input Principal
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        // Input Rate
        System.out.print("Enter Rate of interest (per annum in %): ");
        double rate = scanner.nextDouble();

        // Input Time
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest = " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
