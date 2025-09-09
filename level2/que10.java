import java.util.Scanner;

public class que10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TEAM_SIZE = 10;

        double[] heights = new double[TEAM_SIZE];
        double[] weights = new double[TEAM_SIZE];
        double[] bmis = new double[TEAM_SIZE];
        String[] status = new String[TEAM_SIZE];

        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.println("Enter details for member #" + (i + 1) + ":");

            System.out.print("Height (in meters): ");
            heights[i] = scanner.nextDouble();

            System.out.print("Weight (in kilograms): ");
            weights[i] = scanner.nextDouble();

            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine status based on BMI
            if (bmis[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }

            System.out.println();
        }

        // Display results
        System.out.println("\nBMI Report for Team Members:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmis[i], status[i]);
        }

        scanner.close();
    }
}
