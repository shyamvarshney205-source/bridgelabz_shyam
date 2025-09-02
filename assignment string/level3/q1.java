import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int teamSize = 10;

        System.out.printf("%-8s %-10s %-10s %-10s %-15s\n", "Member", "Height(m)", "Weight(kg)", "BMI", "Status");

        for (int i = 1; i <= teamSize; i++) {
            System.out.print("Enter height (in meters) of member " + i + ": ");
            double height = scanner.nextDouble();

            System.out.print("Enter weight (in kilograms) of member " + i + ": ");
            double weight = scanner.nextDouble();

            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);

            System.out.printf("%-8d %-10.2f %-10.2f %-10.2f %-15s\n", i, height, weight, bmi, status);
        }

        scanner.close();
    }

    // BMI formula: weight (kg) / (height (m))^2
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Determine BMI status category
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}


