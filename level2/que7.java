import java.util.Scanner;

public class que7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        // Input heights (in cm)
        System.out.print("Enter Amar's height (cm): ");
        double amarHeight = scanner.nextDouble();

        System.out.print("Enter Akbar's height (cm): ");
        double akbarHeight = scanner.nextDouble();

        System.out.print("Enter Anthony's height (cm): ");
        double anthonyHeight = scanner.nextDouble();

        // Find youngest friend
        String youngest;
        int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        if (minAge == amarAge && minAge == akbarAge && minAge == anthonyAge) {
            youngest = "All three friends are of the same age.";
        } else if (minAge == amarAge && minAge == akbarAge) {
            youngest = "Amar and Akbar are the youngest.";
        } else if (minAge == amarAge && minAge == anthonyAge) {
            youngest = "Amar and Anthony are the youngest.";
        } else if (minAge == akbarAge && minAge == anthonyAge) {
            youngest = "Akbar and Anthony are the youngest.";
        } else if (minAge == amarAge) {
            youngest = "Amar is the youngest.";
        } else if (minAge == akbarAge) {
            youngest = "Akbar is the youngest.";
        } else {
            youngest = "Anthony is the youngest.";
        }

        // Find tallest friend
        String tallest;
        double maxHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        if (maxHeight == amarHeight && maxHeight == akbarHeight && maxHeight == anthonyHeight) {
            tallest = "All three friends are of the same height.";
        } else if (maxHeight == amarHeight && maxHeight == akbarHeight) {
            tallest = "Amar and Akbar are the tallest.";
        } else if (maxHeight == amarHeight && maxHeight == anthonyHeight) {
            tallest = "Amar and Anthony are the tallest.";
        } else if (maxHeight == akbarHeight && maxHeight == anthonyHeight) {
            tallest = "Akbar and Anthony are the tallest.";
        } else if (maxHeight == amarHeight) {
            tallest = "Amar is the tallest.";
        } else if (maxHeight == akbarHeight) {
            tallest = "Akbar is the tallest.";
        } else {
            tallest = "Anthony is the tallest.";
        }

        // Display results
        System.out.println("\nYoungest friend(s): " + youngest);
        System.out.println("Tallest friend(s): " + tallest);

        scanner.close();
    }
}
