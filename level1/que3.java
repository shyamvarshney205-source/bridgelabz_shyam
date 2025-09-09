import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the three sides from the user
        System.out.print("Enter side A of the triangular park (in meters): ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter side B of the triangular park (in meters): ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter side C of the triangular park (in meters): ");
        double sideC = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = sideA + sideB + sideC;

        // Total distance to run in meters
        double totalDistance = 5000; // 5 km = 5000 meters

        // Calculate number of rounds (round up to ensure full 5km)
        int rounds = (int) Math.ceil(totalDistance / perimeter);

        // Output the result
        System.out.println("The athlete must complete " + rounds + " round(s) to run at least 5 km.");

        scanner.close();
    }
}
