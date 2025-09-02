import java.util.Scanner;

public class que8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = 10;

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter age of student " + i + ": ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("Student " + i + " can vote.");
            } else {
                System.out.println("Student " + i + " cannot vote.");
            }
        }

        scanner.close();
    }
}

