import java.util.Scanner;

public class que9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Check each number
        for (int i = 0; i < 5; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + " is ");

            if (num > 0) {
                System.out.print("positive and ");
                if (num % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (num < 0) {
                System.out.println("negative.");
            } else {
                System.out.println("zero.");
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[4];

        System.out.print("First element (" + first + ") is ");

        if (first == last) {
            System.out.println("equal to the last element (" + last + ").");
        } else if (first > last) {
            System.out.println("greater than the last element (" + last + ").");
        } else {
            System.out.println("less than the last element (" + last + ").");
        }

        scanner.close();
    }
}
