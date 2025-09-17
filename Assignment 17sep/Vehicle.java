public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 100.00; // Default value

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Update registration fee
        Vehicle.updateRegistrationFee(150.00);

        // Create vehicle objects
        Vehicle v1 = new Vehicle("Alice Johnson", "Car");
        Vehicle v2 = new Vehicle("Bob Smith", "Motorcycle");

        // Display details
        System.out.println("Vehicle 1 Details:");
        v1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        v2.displayVehicleDetails();
    }
}
