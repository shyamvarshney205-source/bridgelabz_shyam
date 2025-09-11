// Employee.java
public class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an object of Employee
        Employee emp1 = new Employee("Alice Johnson", 101, 75000.00);

        // Displaying details
        emp1.displayDetails();
    }
}
