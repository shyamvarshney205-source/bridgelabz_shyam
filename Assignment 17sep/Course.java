public class Course {
    // Instance variables
    private String courseName;
    private int duration;      // Duration in weeks or months
    private double fee;

    // Class variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " weeks");
        System.out.println("Fee           : $" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Update the institute name using class method
        Course.updateInstituteName("TechVerse Academy");

        // Create course objects
        Course c1 = new Course("Java Programming", 12, 499.99);
        Course c2 = new Course("Web Development", 10, 399.99);

        // Display details
        System.out.println("Course 1 Details:");
        c1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        c2.displayCourseDetails();
    }
}
