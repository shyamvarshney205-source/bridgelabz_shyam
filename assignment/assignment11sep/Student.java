// Student.java
public class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;
    String grade;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.grade = calculateGrade(); // Automatically assign grade on creation
    }

    // Method to calculate grade based on marks
    private String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Report:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + grade);
        System.out.println("----------------------------");
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create some Student objects
        Student student1 = new Student("Alice", 101, 92.5);
        Student student2 = new Student("Bob", 102, 76.0);
        Student student3 = new Student("Charlie", 103, 48.0);

        // Display student reports
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
