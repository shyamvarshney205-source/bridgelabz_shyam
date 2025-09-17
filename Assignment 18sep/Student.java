public class Student {
    // Static variable shared by all students
    private static String universityName = "Global University";

    // Static variable to keep track of total students
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private final String rollNumber;  // final variable to ensure immutability
    private char grade;

    // Constructor using 'this' to initialize variables
    public Student(String name, String rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;  // Increase count when a new student is created
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details with instanceof check
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Object is not an instance of Student.");
        }
    }

    // Method to update grade with instanceof check
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("Object is not an instance of Student.");
        }
    }

    // Optional getters
    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public char getGrade() {
        return grade;
    }
}

