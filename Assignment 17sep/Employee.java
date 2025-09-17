public class Employee {
    public int employeeID;          // Public - accessible everywhere
    protected String department;    // Protected - accessible in subclass or same package
    private double salary;          // Private - only accessible within this class

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to update salary
    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to $" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : $" + salary);
    }

    // Public method to get salary (if needed)
    public double getSalary() {
        return salary;
    }
}
