import java.util.Scanner;

public class que3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check leap year conditions
        boolean isLeapYear;

        if ((year % 400) == 0) {
            isLeapYear = true;
        } else if ((year % 100) == 0) {
            isLeapYear = false;
        } else if ((year % 4) == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        // Output result
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close();
    }
}
