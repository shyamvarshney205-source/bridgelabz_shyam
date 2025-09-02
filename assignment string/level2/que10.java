import java.util.Scanner;

public class que10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained in Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks obtained in Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks obtained in Maths: ");
        double maths = scanner.nextDouble();

        // Assuming max marks for each subject is 100
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;

        System.out.printf("Total Marks: %.2f out of 300\n", totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        char grade = calculateGrade(percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static char calculateGrade(double percentage) {
        if (percentage >= 90)
            return 'A';
        else if (percentage >= 80)
            return 'B';
        else if (percentage >= 70)
            return 'C';
        else if (percentage >= 60)
            return 'D';
        else
            return 'F';
    }
}

