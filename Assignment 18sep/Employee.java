public class Employee {
    // Static variable shared by all employees
    private static String companyName = "Tech Solutions Inc.";

    // Static variable to keep track of total employees
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final String id;           // final variable to prevent modification after assignment
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;  // Increment total employees count on new employee creation
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Instance method to display employee details if the object is an Employee instance
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Object is not an Employee.");
        }
    }

    // Getters (optional)
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }
}
